package com.lu.epc_wallet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lu.epc_wallet.mapper")
public class EpcWalletApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpcWalletApplication.class, args);
    }

}
