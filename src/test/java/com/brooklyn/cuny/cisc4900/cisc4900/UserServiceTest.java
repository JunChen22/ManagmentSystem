package com.brooklyn.cuny.cisc4900.cisc4900;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc()
public class UserServiceTest {

    //need to change to does not need the  start the whole application to test a unit
    //@Autowired
    //MockMvc mockMvc;

    @Test
    public void contextLoads() {
        System.out.println("at test");
    }

    public String obtainAccessToken(String username,String password){
        return "token";
    }

}
