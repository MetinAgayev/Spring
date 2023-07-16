package com.bookstore.business.concretes;

import com.bookstore.business.abstracts.BrandService;
import com.bookstore.business.respones.GetAllBrandResponse;
import com.bookstore.dataAccess.abstracts.BrandRepository;
import com.bookstore.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public  class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandResponse> brandResponses=new ArrayList<GetAllBrandResponse>();
        for(Brand brand:brands  ) {
           GetAllBrandResponse responsesItem=new GetAllBrandResponse();
           responsesItem.setId(brand.getId());
           responsesItem.setName(brand.getName());

           brandResponses.add(responsesItem);
        }
        return brandResponses;
    }
}
