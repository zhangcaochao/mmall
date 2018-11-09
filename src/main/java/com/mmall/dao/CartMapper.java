package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    void deleteByUserIdProductIds(@Param("userId") Integer userId, @Param("productIdList") List<String> productList);

    void checkedOrUncheckedProduct(@Param("userId") Integer userId, @Param("productId") Integer productId,@Param("checked") Integer checked);

    int selectCartProductCount(Integer userId);

    List<Cart> selectCheckedCartByUserId(Integer userID);
}