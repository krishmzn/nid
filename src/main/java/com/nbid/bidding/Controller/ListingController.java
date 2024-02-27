package com.nbid.bidding.Controller;

import com.nbid.bidding.Entity.ListingEntity;
import com.nbid.bidding.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {

    @Autowired
    ListingService Listservice;
    @RequestMapping("/createpost")
    public ResponseEntity<String> CreatePost(@RequestBody ListingEntity ListingEntityReceived) {
        return Listservice.CreatePostService(ListingEntityReceived);
    }
}
