package com.test;


import com.domain.Account;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SpringTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testSpring(){
        List<Account> list = accountService.findAll();
        System.out.println(list);
    }
}
