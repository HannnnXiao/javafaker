package com.testCases;

import com.github.javafaker.Faker;
import org.junit.Test;

public class TestPassword {

    @Test
    public void test() {
        Faker faker = new Faker();

        String pass = faker.internet().password(32, 32, true, true, true);
        System.out.println(pass);
        System.out.println(pass.length());
    }

}
