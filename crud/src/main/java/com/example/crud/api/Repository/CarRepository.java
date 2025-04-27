package com.example.crud.api.Repository;

import com.example.crud.api.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CarRepository extends JpaRepository<Car,Integer>, JpaSpecificationExecutor<Car> {

    @Query("SELECT c FROM Car c WHERE c.company = :name")
    List<Car> findCarByName(@Param("name") String name);

    @Query("SELECT s FROM Car s WHERE s.version LIKE %:keyword%")
    List<Car> findCarByVersionKeyword(@Param("keyword") String keyword);

}
