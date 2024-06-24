package com.sh.shop_kick_n_go.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int productId;
    private Category category;
    private String productName;
    private int price;
    private int size;
    private String color;
    private int inventoryQuantity;
    private String image;
    private Material material;
    private OrderableStatus2 orderableStatus2;
}
