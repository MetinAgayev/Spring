package com.bookstore.business.abstracts;

import com.bookstore.business.respones.GetAllBrandResponse;

import java.util.List;

public interface BrandService {

    List<GetAllBrandResponse> getAll();
}
