package com.example.demo4.entity;

import com.example.demo4.validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    @NotEmpty(message="Title must not be empty")
    @Size(max=50,min=1,message ="Title must be less than 50 character")

    private String title;

    @Column(name="author")
    private String author;

    @Column(name="price")
    @NotNull(message="Price is required")
    private Double price;

    @ManyToOne
    @JoinColumn(name="category_id")
    @ValidCategoryId
    private Category category;
}
