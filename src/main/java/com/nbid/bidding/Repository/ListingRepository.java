package com.nbid.bidding.Repository;

import com.nbid.bidding.Entity.ListingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<ListingEntity, Long> {

}
