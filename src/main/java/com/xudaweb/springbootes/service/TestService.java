package com.xudaweb.springbootes.service;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.xudaweb.springbootes.dao.UserInfoDAO;
import com.xudaweb.springbootes.dovalue.UserInfoDO;
import com.xudaweb.springbootes.dto.IdcardDTO;
import com.xudaweb.springbootes.esentity.UserInfo;
import com.xudaweb.springbootes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {
    @Autowired
    private UserInfoDAO userInfoDAO;

    @Autowired
    private UserRepository userRepository;

//    @PostConstruct
    private void syncUserInfo() {
        List<UserInfoDO> userInfoList = userInfoDAO.selectAll();

        List<UserInfo> resultList = userInfoList.stream().map(userInfoDO -> {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(userInfoDO.getId());
            userInfo.setUserName(userInfoDO.getName());
            userInfo.setIdcard(userInfoDO.getIdNumber());
            if (!StringUtils.isEmpty(userInfoDO.getIdNumber())) {
                String result = HttpUtil.get("http://api.k780.com:88/?app=idcard.get&idcard=" + userInfoDO.getIdNumber() + "&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");
                IdcardDTO idcard = JSON.parseObject(result, IdcardDTO.class);
                if (!"1".equals(idcard.getSuccess())) {
                    userInfo.setAddress("");
                    userInfo.setSex("");
                }
                userInfo.setAddress(idcard.getResult().getAtt());
                userInfo.setSex(idcard.getResult().getSex());
            }

            return userInfo;
        }).collect(Collectors.toList());
        userRepository.deleteAll();
        userRepository.saveAll(resultList);
    }

    public UserInfo getUserInfo(Long id) {
        return userRepository.findById(id).orElse(new UserInfo());
    }

}
