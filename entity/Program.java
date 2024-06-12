package com.hero_vired.programs_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String domain;
    private String programType;
    private String registrations;
    private String description;
    private String placementAssurance;
    private String imageUrl;
    private String universityName;
    private String facultyProfileUrl;
    private int learningHours;
    private String duration;
    private String certificateDiploma;
    private String eligibilityCriteria;

}
