package com.example.demo.Service;

import com.example.demo.Model.Kitchen;
import com.example.demo.Repository.IKitchenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitchenServiceImp implements IKitchenService {


    @Autowired
    private IKitchenRepo kitchenRepo;

    @Override
    public List<Kitchen> fetchAllKitchens() {
        return kitchenRepo.findAll();
    }

    @Override
    public Kitchen fetchKitchen(int id) {
        return kitchenRepo.getOne(id);
    }

    @Override
    public void createKitchen(Kitchen k) {
        kitchenRepo.save(k);
    }

    @Override
    public void deleteKitchen(Kitchen k) {
        kitchenRepo.delete(k);
    }

    @Override
    public void updateKitchen(Kitchen k) {
        kitchenRepo.save(k);
    }
}
