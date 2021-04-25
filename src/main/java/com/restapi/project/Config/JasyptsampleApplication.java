package com.restapi.project.Config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JasyptsampleApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(JasyptsampleApplication.class, args);
    }
    public void run(String... args) throws Exception {
        StandardPBEStringEncryptor spe = new StandardPBEStringEncryptor();
        spe.setAlgorithm("PBEWithMD5AndDES");
        spe.setPassword("ogingdaddy");
    }
}
