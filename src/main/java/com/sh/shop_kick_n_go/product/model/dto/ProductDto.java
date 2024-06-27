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

    public ProductDto(Category category, String productName, int price, int size, String color,
                      int inventoryQuantity, String image, Material material, OrderableStatus2 orderableStatus2) {
        this.category = category;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.color = color;
        this.inventoryQuantity = inventoryQuantity;
        this.image = image;
        this.material = material;
        this.orderableStatus2 = orderableStatus2;
    }
}
