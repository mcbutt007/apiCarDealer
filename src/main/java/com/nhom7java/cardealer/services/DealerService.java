package com.nhom7java.cardealer.services;

import com.nhom7java.cardealer.repositories.DealerRepository;
import com.nhom7java.cardealer.models.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll();
    }

    public Dealer getDealerById(Long id) {
        return dealerRepository.findById(id).orElse(null);
    }

    public Dealer createDealer(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    public Dealer updateDealer(Long id, Dealer dealer) {
        Dealer existingDealer = dealerRepository.findById(id).orElse(null);
        if (existingDealer != null) {
            // Update the fields of the existing dealer with the new dealer data
            existingDealer.setName(dealer.getName());
            existingDealer.setLocation(dealer.getLocation());
            //... update other fields as needed
            return dealerRepository.save(existingDealer);
        } else {
            return null;
        }
    }

    public boolean deleteDealer(Long id) {
        Dealer existingDealer = dealerRepository.findById(id).orElse(null);
        if (existingDealer != null) {
            dealerRepository.delete(existingDealer);
            return true;
        } else {
            return false;
        }
    }
}