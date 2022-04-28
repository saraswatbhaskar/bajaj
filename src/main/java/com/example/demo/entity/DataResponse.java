package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataResponse {
    String is_success;
    String user_id;
    String email;
    String roll_number;
    String[] numbers;
    String[] alphabets;
}
