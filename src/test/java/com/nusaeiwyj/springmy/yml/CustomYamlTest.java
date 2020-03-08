package com.nusaeiwyj.springmy.yml;

import com.nusaeiwyj.springmy.model.yml.Family;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CustomYamlTest {

    @Autowired
    Family family;

    @Test
    public void hello() {

        System.out.println(family.toString());
    }
}