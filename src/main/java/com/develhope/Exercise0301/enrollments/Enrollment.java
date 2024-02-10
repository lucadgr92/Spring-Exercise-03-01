package com.develhope.Exercise0301.enrollments;

import com.develhope.Exercise0301.classes.ClassEntity;
import com.develhope.Exercise0301.students.StudentEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private StudentEntity student;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id")
    private ClassEntity schoolClass;
}
/*
    la logica è corretta ma devi rivedere le relazioni tra classi. All'interno del codice tu hai
    inserito le oneToOne mentre l'esercizio chiede: considera questo use case: 1 student ---> n
     enrollments 1 class ---> n enrollments*/
