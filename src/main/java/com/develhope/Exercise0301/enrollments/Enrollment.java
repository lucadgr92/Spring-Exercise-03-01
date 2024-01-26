package com.develhope.Exercise0301.enrollments;

import com.develhope.Exercise0301.classes.ClassEntity;
import com.develhope.Exercise0301.students.StudentEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private StudentEntity student;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id")
    private ClassEntity schoolClass;
}

