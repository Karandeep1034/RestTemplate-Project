package com.example.apiCalls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.apiCalls.service.TaskService;
import com.example.apiCalls.dto.TaskDTO;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @RequestMapping(value = "/tasks", method = RequestMethod.PUT)
    public String updateTasks(@RequestBody TaskDTO Task){
        return service.updateUserByExchangeMethod(Task);
    }


}
