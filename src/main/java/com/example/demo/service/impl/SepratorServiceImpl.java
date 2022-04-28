package com.example.demo.service.impl;

import com.example.demo.entity.DataResponse;
import com.example.demo.service.SepratorService;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SepratorServiceImpl implements SepratorService {
    @Override
    public DataResponse separator(List<String> lstOfObjects) {
        String alpha = "[a-zA-Z]*";
        String digit="[0-9]*";
        List<String> lstOfAlphabet = lstOfObjects.stream().filter(l -> l.matches(alpha)).collect(Collectors.toList());
        List<String> lstOfDigit = lstOfObjects.stream().filter(l -> l.matches(digit)).collect(Collectors.toList());
        DataResponse dataResponse = new DataResponse();
        dataResponse.setIs_success("true");
        dataResponse.setUser_id("bhaskar_saraswat_21071995");
        dataResponse.setEmail("saraswatbhaskar@gmail.com");
        dataResponse.setRoll_number("PD0172");

        dataResponse.setNumbers(lstOfDigit.toArray(new String[0]));
        dataResponse.setAlphabets(lstOfAlphabet.toArray(new String[0]));
        return dataResponse;
    }
}
