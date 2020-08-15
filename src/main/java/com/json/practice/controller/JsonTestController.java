package com.json.practice.controller;


import com.json.practice.dto.JsonOutDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class JsonTestController {

    @PostMapping
    public ResponseEntity<JsonOutDTO> test(
            @RequestBody JsonOutDTO outDTO
    ) {
        return new ResponseEntity<JsonOutDTO>(outDTO,HttpStatus.OK);
    }
}
