package com.example.kibritexample.service;

import com.example.kibritexample.dao.repository.TourRepository;
import com.example.kibritexample.dao.entity.ToursEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    private TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public List<ToursEntity> getTours() {
        List<ToursEntity> tours = tourRepository.findAll();
        return tours;
    }
}