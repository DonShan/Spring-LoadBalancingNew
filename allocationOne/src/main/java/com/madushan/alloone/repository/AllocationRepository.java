package com.madushan.alloone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.madushan.alloone.model.Allocation;

public interface AllocationRepository extends JpaRepository<Allocation, Integer> {
}
