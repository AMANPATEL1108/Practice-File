package com.example.RelationDB.api.Repository;

import com.example.RelationDB.api.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
