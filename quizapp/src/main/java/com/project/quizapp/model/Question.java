package com.project.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String category;

    @Column(name = "question_title")
    private String question_title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Column(name = "right_answer")
    private String right_answer;

    @Column(name = "difficulty_level")
    private String difficulty_level;
}
