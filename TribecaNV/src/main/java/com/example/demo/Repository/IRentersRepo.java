package com.example.demo.Repository;

import com.example.demo.Model.Renter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentersRepo extends JpaRepository<Renter, Integer> {
}
