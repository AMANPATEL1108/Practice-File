package com.example.RelationDB.api;

import com.example.RelationDB.api.Model.*;
import com.example.RelationDB.api.Repository.CategoryRepository;
import com.example.RelationDB.api.Repository.ProductRepository;
import com.example.RelationDB.api.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RelationDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(RelationDbApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository studentRepository) {
        return args -> addStudent(studentRepository);
    }

    @Transactional
    public void addStudent(StudentRepository studentRepository) {
//        // Create student
//        Student student = new Student();
//        student.setId(1);
//        student.setStudentName("Aman");
//        student.setAbout("Bayad");
//
//        // Create laptop
//        Laptop laptop = new Laptop();
//        laptop.setLaptopId(1);
//        laptop.setModelNumber("456M");
//        laptop.setBrand("Asus");
//
//        // Set bidirectional relationship
//        laptop.setStudent(student);
//        student.setLaptop(laptop);
//
//        // Save student (cascade will save laptop)
//        studentRepository.save(student);

//        Student stude = new Student();
//        stude.setStudentName("Ap");
//        stude.setAbout("Heyy Address");
//        stude.setId(5);
//
//        Address address=new Address();
//        address.setAddressId(7);
//        address.setStreet("25/26");
//        address.setCity("Lakh");
//        address.setCountry("INDIA");
//        address.setStudent(stude);
//
//        Address address2=new Address();
//
//        address2.setAddressId(8);
//        address2.setStreet("259/269");
//        address2.setCity("Lakhjnn");
//        address2.setCountry("INDIA2");
//        address2.setStudent(stude);
//
//        List<Address> addressList=new ArrayList();
//        addressList.add(address);
//        addressList.add(address2);
//
//        stude.setAddressList(addressList);
//        Student save=studentRepository.save(stude);


        Product product1 = new Product();
        product1.setPId("pid1");
        product1.setProductName("IPhone 14 Max Pro");

        Product product2 = new Product();
        product2.setPId("pid2");
        product2.setProductName("Samsung S24");

        Product product3 = new Product();
        product3.setPId("pid3");
        product3.setProductName("Samsung TV123");

        Category category1 = new Category();
        category1.setCId("cid1");
        category1.setTitle("Electronics");


        Category category2 = new Category();
        category2.setCId("cid2");
        category2.setTitle("Mobiles Phones");


        List<Product> category1Products = category1.getProducts();
        category1Products.add(product1);
        category1Products.add(product2);
        category1Products.add(product3);


        List<Product> category2Products = category2.getProducts();
        category2Products.add(product1);
        category2Products.add(product2);

        categoryRepository.save(category1);
        categoryRepository.save(category2);

//      Category category=categoryRepository.findById("cid1").get();
//        System.out.println(category.getProducts().size());
//
//
//        Category category2=categoryRepository.findById("cid2").get();
//        System.out.println(category2.getProducts().size());

        System.out.println("Student created successfully");
    }

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
}
