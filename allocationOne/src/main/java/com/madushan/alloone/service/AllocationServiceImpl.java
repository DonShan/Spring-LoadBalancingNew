package com.madushan.alloone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.madushan.alloone.model.Allocation;
import com.madushan.alloone.repository.AllocationRepository;
@Service
public class AllocationServiceImpl implements AllocationService {

    @Autowired
    AllocationRepository allocationRepository;

    @Override
    public Allocation save(Allocation allocation) {
        return allocationRepository.save(allocation);
    }

    @Override
    public List<Allocation> findByID(Integer employeeID) {
        System.err.println("Calling AllocationServiceOne");

        Allocation allocation = new Allocation();
        allocation.setEmployeeID(employeeID);

        Example<Allocation> employeeExample = Example.of(allocation);

        return allocationRepository.findAll(employeeExample);
    }
}