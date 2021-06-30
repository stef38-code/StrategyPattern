package com.stephane.strategy.pattern.examples.client.rest.response.employee;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public @Data
class Employee {
    private List< com.stephane.strategy.pattern.examples.client.rest.response.employee.Data > data = new ArrayList<>();
    private String message;
    private String status;
}