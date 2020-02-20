package com.madushan.alloone.service;

import java.util.List;

import com.madushan.alloone.model.Allocation;

public interface AllocationService {

    List<Allocation> findByID(Integer employeeID);

    Allocation save(Allocation allocation);
}
