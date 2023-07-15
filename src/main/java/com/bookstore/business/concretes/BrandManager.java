package com.bookstore.business.concretes;

import com.bookstore.business.abstracts.BrandService;
import com.bookstore.dataAccess.abstracts.BrandRepository;
import com.bookstore.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }
}
