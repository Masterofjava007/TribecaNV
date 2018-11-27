package com.example.demo.Service;

import com.example.demo.Model.Renter;
import java.util.List;

public interface IRentersServiceImp {
    List<Renter> fetchAllRenters();
    Renter fetchRenter (int id);
    void createRenter (Renter r);
    void deleteRenter (Renter r);
    void updateRenter (Renter r);
}
