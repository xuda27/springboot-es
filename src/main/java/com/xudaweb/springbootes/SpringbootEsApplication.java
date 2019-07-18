package com.xudaweb.springbootes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.xudaweb.springbootes.dao" })
public class SpringbootEsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEsApplication.class, args);
	}

}
