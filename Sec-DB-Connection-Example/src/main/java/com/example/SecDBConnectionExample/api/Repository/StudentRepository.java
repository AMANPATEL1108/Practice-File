package com.example.SecDBConnectionExample.api.Repository;

import com.example.SecDBConnectionExample.api.model.Student;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, IntegralDataTypeHolder> {
}
