package com.example.kibritexample.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionType;

import javax.persistence.*;

@Entity
@Table(name="tour_reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ToursReviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "tour_id")
    private Long tourId;
}

