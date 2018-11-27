package com.example.demo.Service;

import com.example.demo.Model.Renter;
import com.example.demo.Repository.IRentersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RentersServiceImp implements IRentersServiceImp {

    @Autowired
    private IRentersRepo rentersRepo;

    @Override
    public List<Renter> fetchAllRenters() {
        return rentersRepo.findAll();
    }

    @Override
    public Renter fetchRenter(int id) {
        return rentersRepo.getOne(id);
    }

    @Override
    public void createRenter(Renter r) {
        rentersRepo.save(r);
    }

    @Override
    public void deleteRenter(Renter r) {
        rentersRepo.delete(r);
    }

    @Override
    public void updateRenter(Renter r) {
        rentersRepo.save(r);
    }
}
