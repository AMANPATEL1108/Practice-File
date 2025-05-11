package com.example.SecDBConnectionExample.api.Repository;

import com.example.SecDBConnectionExample.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
