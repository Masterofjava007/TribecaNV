package com.example.demo.Repository;

import com.example.demo.Model.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKitchenRepo extends JpaRepository<Kitchen, Integer> {
}
