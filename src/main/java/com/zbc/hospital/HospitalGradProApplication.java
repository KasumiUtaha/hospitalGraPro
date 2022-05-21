package com.zbc.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.zbc.hospital.dao","com.zbc.hospital.admin.dao"})
@SpringBootApplication
public class HospitalGradProApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalGradProApplication.class, args);
    }

}
