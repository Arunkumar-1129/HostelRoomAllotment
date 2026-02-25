package com.example.hostelAllotment.repository;

import com.example.hostelAllotment.model.entity.AllotmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllotmentRepository extends JpaRepository<AllotmentEntity, Integer> {
}