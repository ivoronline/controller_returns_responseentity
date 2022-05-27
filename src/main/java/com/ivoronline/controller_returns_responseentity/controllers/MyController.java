package com.ivoronline.controller_returns_responseentity.controllers;

import com.ivoronline.controller_returns_responseentity.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // RETURN STRING
  //================================================================
  @RequestMapping("ReturnString")
  ResponseEntity<String> returnString() {
    String                 body           = "Hello from Controller";
    HttpStatus             httpStatus     = HttpStatus.UNAUTHORIZED;
    ResponseEntity<String> responseEntity = new ResponseEntity<>(body, httpStatus);
    return responseEntity;
  }

  //================================================================
  // RETURN OBJECT
  //================================================================
  @RequestMapping("ReturnPerson")
  ResponseEntity<Person> returnPersont() {

    Person                 person      = new Person();
                           person.name = "John";
                           person.age  = 20;

    HttpStatus             httpStatus     = HttpStatus.UNAUTHORIZED;

    ResponseEntity<Person> responseEntity = new ResponseEntity<>(person, httpStatus);

    return responseEntity;

  }

}
