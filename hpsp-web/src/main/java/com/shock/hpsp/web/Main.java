package com.shock.hpsp.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author czf
 * @Date 2020/10/13 1:41 下午
 */
@SpringBootApplication
@RestController
@Api("MainController")
public class Main {


    @RequestMapping("/test")
    public String h(@ApiParam(name="param", value = "参数") String param){
        return "input:"+param;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}
