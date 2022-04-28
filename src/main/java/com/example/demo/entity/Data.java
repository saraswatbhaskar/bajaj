package com.example.demo.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@lombok.Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    String[] data;
}
