package com.nmm.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplicatoin {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplicatoin.class,args);
    }
}
