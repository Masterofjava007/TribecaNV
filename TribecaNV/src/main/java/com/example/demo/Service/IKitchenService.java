package com.example.demo.Service;

import com.example.demo.Model.Kitchen;

import java.util.List;

public interface IKitchenService {
    List<Kitchen> fetchAllKitchens();
    Kitchen fetchKitchen (int id);
    void createKitchen (Kitchen k);
    void deleteKitchen (Kitchen k);
    void updateKitchen (Kitchen k);


}
