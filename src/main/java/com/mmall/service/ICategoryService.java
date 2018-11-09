package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

import java.util.List;

public interface ICategoryService {

    ServerResponse addCategory(String categoryName,Integer parentId);

    ServerResponse updateCategoryName(String categoryName,Integer caterotyId);

    ServerResponse getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
