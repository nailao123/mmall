package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

/**
 * Created by Administrator on 2017/6/16 0016.
 */

public interface IProductService {
    //更新或增加产品
    ServerResponse saveOrUpdateProduct(Product product);
    //更新产品状态
    ServerResponse<String> setSaleStatus(Integer productId,Integer status);
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
    //根据条件有选择的性的查询
    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);
   ServerResponse<ProductDetailVo> getProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);
}
