package org.example.fulltextsearchapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "articles")
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(name="category")
    private String category;

    @Column(name="keywords")
    private String keywords;
}

