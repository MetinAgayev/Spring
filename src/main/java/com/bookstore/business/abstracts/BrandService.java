package com.bookstore.business.abstracts;

import com.bookstore.entities.concretes.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();
}
