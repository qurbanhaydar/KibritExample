package com.example.kibritexample.controller;
import com.example.kibritexample.dao.entity.ToursEntity;
import com.example.kibritexample.service.TourService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/tours")
public class TourController {
    private TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping
    public String getTours(Model model) {
        List<ToursEntity> tours = tourService.getTours();

        model.addAttribute("tours", tours);
        return "TourList";
    }
}
