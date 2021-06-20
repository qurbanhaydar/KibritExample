package com.example.kibritexample.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Tours")
@Data
@AllArgsConstructor
@NoArgsConstructor



public class ToursEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @Column(name= "tourname")
    private String tourname;

    @Column(name="where")
    private String where;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="about")
    private String about;

    @Column(name="image")
    private String image;

    @OneToMany
    private List<ToursReviews> reviews = new ArrayList<>();
}

