package com.douglas.umwa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/api/test"})
public class getTest {

    @GetMapping("/list")
    public ResponseEntity<String> findList() {
        String teste = "blabla";
        return ResponseEntity.ok().body(teste);
    }
}
