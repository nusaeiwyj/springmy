package com.nusaeiwyj.springmy.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class jasypttest {
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void contextLoads() {
        //加密方法
        System.out.println(stringEncryptor.encrypt("123456"));
        System.out.println(stringEncryptor.encrypt("123456"));
        //解密方法
        System.out.println(stringEncryptor.decrypt("qKranvxU0DjWkaWT+CSFug=="));
        System.out.println(stringEncryptor.decrypt("i+EllDwkviEcoXsZfM+5XQ=="));
    }

}
