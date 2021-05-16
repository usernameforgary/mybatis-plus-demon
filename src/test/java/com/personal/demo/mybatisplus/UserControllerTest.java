package com.personal.demo.mybatisplus;


import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() {
        if(mockMvc == null) {
            log.info("initial mockMvc...");
            mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
            log.info((mockMvc == null) + "");
        }
    }

    @Test
    public void getUserByIdTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/user/124"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
