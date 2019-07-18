package com.xudaweb.springbootes.dovalue;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfoDO implements Serializable {
    /**
     * userId
     */
    @Id
    private Long id;

    /**
     * 用户会员号
     */
    @Column(name = "member_id")
    private String memberId;

    /**
     * 业务用户id
     */
    @Column(name = "out_user_id")
    private Long outUserId;

    /**
     * 集团id
     */
    @Column(name = "out_org_id")
    private Integer outOrgId;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private Long mobile;

    /**
     * 身份证ID
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 支付密码
     */
    @Column(name = "pay_pwd")
    private String payPwd;

    /**
     * 是否免密支付（1：是，0：否）
     */
    @Column(name = "free_pay_pwd")
    private Integer freePayPwd;

    /**
     * 是否验证（1：是，0：否）
     */
    private Integer authed;

    /**
     * 身份证证正面照
     */
    @Column(name = "idcard_front_url")
    private String idcardFrontUrl;

    /**
     * 身份证证背面照
     */
    @Column(name = "idcard_back_url")
    private String idcardBackUrl;

    /**
     * 创建时间
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 逻辑删除字段，0：正常使用，时间戳：删除
     */
    @Column(name = "is_delete")
    private Long isDelete;

    /**
     * 用户账户类型,1：储值，2：鲸币卡，4：礼品卡，可持有多种，多种为相加结果，如，3:既是储值账户，又是鲸币账户
     */
    @Column(name = "account_type")
    private Integer accountType;

    private Integer transfer;

    @Column(name = "extend_01")
    private String extend01;

    @Column(name = "extend_02")
    private String extend02;

    private static final long serialVersionUID = 1L;

    /**
     * 获取userId
     *
     * @return id - userId
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置userId
     *
     * @param id userId
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户会员号
     *
     * @return member_id - 用户会员号
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置用户会员号
     *
     * @param memberId 用户会员号
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取业务用户id
     *
     * @return out_user_id - 业务用户id
     */
    public Long getOutUserId() {
        return outUserId;
    }

    /**
     * 设置业务用户id
     *
     * @param outUserId 业务用户id
     */
    public void setOutUserId(Long outUserId) {
        this.outUserId = outUserId;
    }

    /**
     * 获取集团id
     *
     * @return out_org_id - 集团id
     */
    public Integer getOutOrgId() {
        return outOrgId;
    }

    /**
     * 设置集团id
     *
     * @param outOrgId 集团id
     */
    public void setOutOrgId(Integer outOrgId) {
        this.outOrgId = outOrgId;
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取身份证ID
     *
     * @return id_number - 身份证ID
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证ID
     *
     * @param idNumber 身份证ID
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取支付密码
     *
     * @return pay_pwd - 支付密码
     */
    public String getPayPwd() {
        return payPwd;
    }

    /**
     * 设置支付密码
     *
     * @param payPwd 支付密码
     */
    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    /**
     * 获取是否免密支付（1：是，0：否）
     *
     * @return free_pay_pwd - 是否免密支付（1：是，0：否）
     */
    public Integer getFreePayPwd() {
        return freePayPwd;
    }

    /**
     * 设置是否免密支付（1：是，0：否）
     *
     * @param freePayPwd 是否免密支付（1：是，0：否）
     */
    public void setFreePayPwd(Integer freePayPwd) {
        this.freePayPwd = freePayPwd;
    }

    /**
     * 获取是否验证（1：是，0：否）
     *
     * @return authed - 是否验证（1：是，0：否）
     */
    public Integer getAuthed() {
        return authed;
    }

    /**
     * 设置是否验证（1：是，0：否）
     *
     * @param authed 是否验证（1：是，0：否）
     */
    public void setAuthed(Integer authed) {
        this.authed = authed;
    }

    /**
     * 获取身份证证正面照
     *
     * @return idcard_front_url - 身份证证正面照
     */
    public String getIdcardFrontUrl() {
        return idcardFrontUrl;
    }

    /**
     * 设置身份证证正面照
     *
     * @param idcardFrontUrl 身份证证正面照
     */
    public void setIdcardFrontUrl(String idcardFrontUrl) {
        this.idcardFrontUrl = idcardFrontUrl;
    }

    /**
     * 获取身份证证背面照
     *
     * @return idcard_back_url - 身份证证背面照
     */
    public String getIdcardBackUrl() {
        return idcardBackUrl;
    }

    /**
     * 设置身份证证背面照
     *
     * @param idcardBackUrl 身份证证背面照
     */
    public void setIdcardBackUrl(String idcardBackUrl) {
        this.idcardBackUrl = idcardBackUrl;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_created - 创建时间
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreated 创建时间
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modify - 修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModify 修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 获取逻辑删除字段，0：正常使用，时间戳：删除
     *
     * @return is_delete - 逻辑删除字段，0：正常使用，时间戳：删除
     */
    public Long getIsDelete() {
        return isDelete;
    }

    /**
     * 设置逻辑删除字段，0：正常使用，时间戳：删除
     *
     * @param isDelete 逻辑删除字段，0：正常使用，时间戳：删除
     */
    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取用户账户类型,1：储值，2：鲸币卡，4：礼品卡，可持有多种，多种为相加结果，如，3:既是储值账户，又是鲸币账户
     *
     * @return account_type - 用户账户类型,1：储值，2：鲸币卡，4：礼品卡，可持有多种，多种为相加结果，如，3:既是储值账户，又是鲸币账户
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置用户账户类型,1：储值，2：鲸币卡，4：礼品卡，可持有多种，多种为相加结果，如，3:既是储值账户，又是鲸币账户
     *
     * @param accountType 用户账户类型,1：储值，2：鲸币卡，4：礼品卡，可持有多种，多种为相加结果，如，3:既是储值账户，又是鲸币账户
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * @return transfer
     */
    public Integer getTransfer() {
        return transfer;
    }

    /**
     * @param transfer
     */
    public void setTransfer(Integer transfer) {
        this.transfer = transfer;
    }

    /**
     * @return extend_01
     */
    public String getExtend01() {
        return extend01;
    }

    /**
     * @param extend01
     */
    public void setExtend01(String extend01) {
        this.extend01 = extend01;
    }

    /**
     * @return extend_02
     */
    public String getExtend02() {
        return extend02;
    }

    /**
     * @param extend02
     */
    public void setExtend02(String extend02) {
        this.extend02 = extend02;
    }
}