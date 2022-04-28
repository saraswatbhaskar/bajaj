package com.example.demo.controller;

import com.example.demo.entity.Data;
import com.example.demo.entity.DataResponse;
import com.example.demo.service.SepratorService;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class SepratorController {

    @Autowired
    SepratorService sepratorService;

    @PostMapping("/bfhl")
    public DataResponse getSeparatedResponse(@RequestBody String value){
        Gson gson=new Gson();
        Data data = gson.fromJson(value, Data.class);
        return sepratorService.separator(Arrays.asList(data.getData()));
    }
}
