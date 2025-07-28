package com.example.helo;

import com.example.helo.config.ProjectConfig;
import com.example.helo.controller.HeloController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(HeloController.class)
//@Import(ProjectConfig.class)
public class HelloTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
     HelloService helloService;
    @InjectMocks
    private HeloController heloController;
    @Test
        public void HeloControllerTest()throws Exception{
      // when(helloService.hello()).thenReturn("Hello");
       mockMvc.perform(MockMvcRequestBuilders.get("/hello")
                        .accept(MediaType.APPLICATION_JSON))
               .andDo(print())
                .andExpect(status().is(401));
    }

}
