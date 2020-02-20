package com.madushan.employee.model;

import lombok.Data;

@Data
public class Allocation {

    private Integer id;
    private Integer employeeID;
    private String startDate;
    private String endDate;
    private String projectCode;
}
