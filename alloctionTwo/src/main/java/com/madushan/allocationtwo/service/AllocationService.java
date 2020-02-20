package com.madushan.allocationtwo.service;

import java.util.List;

import com.madushan.allocationtwo.model.Allocation;

public interface AllocationService {

    List<Allocation> findByID(Integer employeeID);

    Allocation save(Allocation allocation);
}
