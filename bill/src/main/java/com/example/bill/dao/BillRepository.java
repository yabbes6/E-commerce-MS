package com.example.bill.dao;

import com.example.bill.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {

    List<Bill> getAllBills();
    List<Bill> getBillByUsername(@Param("username") String username);
}
