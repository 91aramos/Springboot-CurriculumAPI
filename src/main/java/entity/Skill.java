package entity;

import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String score;

    public Skill(String description, String score) {
        this.description = description;
        this.score = score;
    }
}