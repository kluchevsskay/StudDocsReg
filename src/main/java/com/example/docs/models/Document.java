package com.example.docs.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "documents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "first name")
    private String first;
    @Column(name = "last name")
    private String last;
    @Column(name = "student's number")
    private String num;
    @Column(name = "facultycommittee")
    private String fac;
    @Column(name = "project")
    private String project;
    @Column(name = "day")
    private String day;
    @Column(name = "author")
    private String author;
}
