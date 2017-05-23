package com.formicine.weaver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.formicine.weaver.dao.mapper")
public class WeaverDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeaverDaoApplication.class, args);
	}
}
