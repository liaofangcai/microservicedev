package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @author 作者 Fangcai Liao
* @version 创建时间：Oct 26, 2016 11:09:14 AM
* 类说明
*/
@SpringBootApplication
//@EnableEurekaClient
public class MicroServiceDevApplication {

    /**
     * 程序主入口.
     * @param args args
     */
    public static void main(final String[] args) {
        SpringApplication.run(MicroServiceDevApplication.class, args);
    }
}
