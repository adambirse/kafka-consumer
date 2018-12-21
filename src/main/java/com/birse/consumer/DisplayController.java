package com.birse.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/display")
public class DisplayController {


    @GetMapping
    public List<String> send() {
        return MessageStore.getMessages();
    }

}
