package com.example.kibritexample.dao.repository;

import com.example.kibritexample.dao.entity.ToursEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<ToursEntity, Long> {
}
