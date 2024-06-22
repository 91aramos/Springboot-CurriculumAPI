package com.curriculum.curriculum.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "RESPONSABILITY")
public class Responsability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_section", referencedColumnName = "id")
    private Section section;

    @Column(name = "text", columnDefinition = "TEXT")
    private String text;

    public Responsability(Section section, String text) {
        this.section = section;
        this.text = text;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}