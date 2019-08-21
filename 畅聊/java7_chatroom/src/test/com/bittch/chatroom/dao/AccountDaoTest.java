package com.bittch.chatroom.dao;

import com.bittch.chatroom.entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AccountDaoTest {
    private AccountDao accountDao = new AccountDao();
    @Test
    public void userLogin() {
        User user = accountDao.userLogin("test","123");
        System.out.println(user);
        Assert.assertNotNull(user);
    }

    @Test
    public void userRegister() {
        User user = new User();
        user.setUserName("test");
        user.setPassword("123");
        boolean isSuccess = accountDao.userRegister(user);
        Assert.assertEquals(true,isSuccess);
    }
    @Test
    public void testData() throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("F:\\Work Code\\IDEA Project\\java7_chatroom\\src\\main\\java\\resources\\datasource.properties"));
        System.out.println(properties.getProperty(""));


    }

}
