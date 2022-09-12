package com.gauravtrchie.productservice.Repository;


import com.gauravtrchie.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
