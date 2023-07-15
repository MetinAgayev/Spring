package com.bookstore.dataAccess.abstracts;

import com.bookstore.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BrandRepository extends JpaRepository<Brand,Integer> {


}
