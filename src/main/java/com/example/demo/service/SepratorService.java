package com.example.demo.service;

import com.example.demo.entity.DataResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SepratorService {
    DataResponse separator(List<String> lstOfObjects);
}
