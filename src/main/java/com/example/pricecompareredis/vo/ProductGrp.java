package com.example.pricecompareredis.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductGrp {

  private String prodGrpId; // FPG0001
  private List<Product> productList; //[{d1fc1031, 25000}, {}...]
}

