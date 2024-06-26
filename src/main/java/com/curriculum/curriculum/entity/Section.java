package com.curriculum.curriculum.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "SECTION")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String dates;
    private String description;
    private String responsabilities;
    private String technologies;

    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Responsability> lResponsabilities;

    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Technology> lTechnologies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsabilities() {
        return responsabilities;
    }

    public void setResponsabilities(String responsabilities) {
        this.responsabilities = responsabilities;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public List<Responsability> getListResponsabilities() {
        return lResponsabilities;
    }

    public void setListResponsabilities(List<Responsability> lResponsabilities) {
        this.lResponsabilities = lResponsabilities;
    }

    public List<Technology> getListTechnologies() {
        return lTechnologies;
    }

    public void setListTechnologies(List<Technology> lTechnologies) {
        this.lTechnologies = lTechnologies;
    }

    
}