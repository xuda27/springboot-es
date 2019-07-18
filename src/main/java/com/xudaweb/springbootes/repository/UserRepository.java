package com.xudaweb.springbootes.repository;

import com.xudaweb.springbootes.esentity.UserInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<UserInfo, Long> {
}
