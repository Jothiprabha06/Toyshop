package com.example.Toydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Toydemo.Model.ToyDemo;

public interface ToyRepository extends JpaRepository<ToyDemo, Integer>{

}
