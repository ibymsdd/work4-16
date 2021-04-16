package com.bym.work.work416;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bym.work.work416.mapper")
@SpringBootApplication
public class Work416Application {

	public static void main(String[] args) {
		SpringApplication.run(Work416Application.class, args);
	}

}
