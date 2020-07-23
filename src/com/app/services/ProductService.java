/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.services;

import com.app.entity.PageResult;
import com.app.entity.Result;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import org.json.JSONObject;

/**
 *
 * @author WORKGROUP
 */
public class ProductService extends BaseService implements IService<ProductService>{
    
    public ProductService(){
        baseUrl = "products";
    }

    private ProductService(JSONObject data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PageResult<ProductService> getPage(String search, int page, int pageSize, String sort, boolean asc) throws MalformedURLException, ProtocolException, IOException {
        Result result = get(search, page, pageSize, sort, asc);
        PageResult<ProductService> pageResult = new PageResult<>(result.getData(), ProductService.class);
        return pageResult; 
    }

    @Override
    public ProductService getByID(Object id) throws IOException, Exception {
        Result result = get(id);
        ProductService products = new ProductService(result.getData());
        return products;
    }

    @Override
    public Result create(ProductService entity) throws IOException {
        return post(entity.toJson());
    }

    @Override
    public Result update(ProductService entity) throws IOException {
        return put(entity.toJson());
    }

    @Override
    public Result remove(Object id) throws IOException {
        return delete(id);
    }

    private JSONObject toJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
