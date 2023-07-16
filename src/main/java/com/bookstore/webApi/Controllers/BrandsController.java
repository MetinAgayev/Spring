package com.bookstore.webApi.Controllers;


import com.bookstore.business.abstracts.BrandService;
import com.bookstore.business.respones.GetAllBrandResponse;
import com.bookstore.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
  private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<GetAllBrandResponse> getAll(){
    return brandService.getAll();
    }
}
