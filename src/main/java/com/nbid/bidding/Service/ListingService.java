package com.nbid.bidding.Service;

import com.nbid.bidding.Entity.ListingEntity;
import com.nbid.bidding.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ListingService {

    @Autowired
    ListingRepository lRepo;

    public ResponseEntity<String> CreatePostService(ListingEntity listingEntityReceived) {
        try {
            lRepo.save(listingEntityReceived);
            System.out.print("Post created suscessfully");
            return ResponseEntity.ok("Post created Successfully");
        } catch (Exception err) {
            System.out.print(err);
            System.out.print("-----------------Post reqest unsescessful--------------------------------");
            return ResponseEntity.internalServerError().body("Post unsuscessful");
        }
    }
}
