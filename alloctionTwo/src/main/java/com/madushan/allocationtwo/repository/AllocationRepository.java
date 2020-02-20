package com.madushan.allocationtwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madushan.allocationtwo.model.Allocation;

public interface AllocationRepository extends JpaRepository<Allocation, Integer> {
}
