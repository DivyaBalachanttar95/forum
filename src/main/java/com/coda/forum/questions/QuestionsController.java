package com.coda.forum.questions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {

    @GetMapping("/v1/users/{userId}/questions")
    public ResponseEntity<String> viewQuestions(@PathVariable("userId") String userId){

        return ResponseEntity.ok("");
    }
}
