package com.coda.forum.questions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class QuestionsControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testViewQuestionsForAUser() throws Exception {
        String viewQuestionExpectedOutput = "[\n" +
                "  {\n" +
                "    \"question\": {\n" +
                "      \"question_id\": \"12\",\n" +
                "      \"question\": \"\"\n" +
                "    },\n" +
                "    \"answers\": [\n" +
                "      {\n" +
                "        \"answer_id\": \"\",\n" +
                "        \"answer\": \"\",\n" +
                "        \"user_id\": \"\",\n" +
                "        \"updated_time\": \"\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";
        mockMvc.perform(MockMvcRequestBuilders.
                get("/v1/users/userId/questions"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}