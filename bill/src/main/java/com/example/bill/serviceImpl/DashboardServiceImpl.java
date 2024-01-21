package com.example.bill.serviceImpl;

import com.example.bill.dao.BillRepository;
import com.example.bill.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    BillRepository billRepository;
    String categoryRepository;
    String productRepository;
    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        Map<String ,Object> map = new HashMap<>();
        map.put("category",categoryRepository);//categoryRepository.count()
        map.put("product",productRepository);//productRepository.count()
        map.put("bill",billRepository.count());//billRepository.count()

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
