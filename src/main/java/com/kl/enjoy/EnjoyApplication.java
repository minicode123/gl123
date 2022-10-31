package com.kl.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.kl.enjoy.mapper")
public class EnjoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnjoyApplication.class, args);
	}

}
