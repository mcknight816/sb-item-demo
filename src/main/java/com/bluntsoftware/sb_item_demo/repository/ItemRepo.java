package com.bluntsoftware.sb_item_demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bluntsoftware.sb_item_demo.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends MongoRepository<Item, String> {
}