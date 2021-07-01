package com.stephane.strategy.pattern.examples.client.rest.response.employee;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private String profileImage;
    private String employeeName;
    private int employeeSalary;
    private int id;
    private int employeeAge;
}