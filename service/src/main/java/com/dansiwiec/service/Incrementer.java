package com.dansiwiec.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class Incrementer {

    @RequestMapping(value = "/", method = POST)
    public ResponseEntity<Integer> increment(@RequestBody Parameters params) {
        int incremented = params.getNumber() + 1;
        return new ResponseEntity<Integer>(incremented, HttpStatus.OK);
    }

}
