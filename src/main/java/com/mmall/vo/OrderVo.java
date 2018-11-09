package com.mmall.vo;

import com.mmall.pojo.OrderItem;
import com.mmall.pojo.Shipping;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderVo {

    private Long orderNo;

    private BigDecimal payment;

    private Integer paymentType;

    private String paymentTypeDesc;

    private Integer postage;

    private Integer status;

    private String statusDesc;

    private String paymentTime;

    private String sendTime;

    private String endTime;

    private String closeTime;

    private String createTime;

    //订单的明细
    private List<OrderItemVo> orderItemVoList;

    private String imageHost;

    private Integer shippingId;

    private String receiveName;

    private ShippingVo shippingVo;


}
