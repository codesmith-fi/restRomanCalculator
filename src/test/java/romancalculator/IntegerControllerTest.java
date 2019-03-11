package romancalculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IntegerControllerTest {
    private static final String TEXT_URI = "/api/integer";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void integer_ShouldReturnValidConversionResult() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get(TEXT_URI)
            .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}