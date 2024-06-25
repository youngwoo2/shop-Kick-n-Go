package com.sh.shop_kick_n_go.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRegistDto {

    private Category category;
    private String productName;
    private int price;
    private int size;
    private String color;
    private int inventoryQuantity;
    private String image;
    private Material material;
    private OrderableStatus2 orderableStatus2;

    public ProductDto toProductDto() {
        return new ProductDto(0, this.category, this.productName, this.price, this.size, this.color, this.inventoryQuantity, this.image, this.material, orderableStatus2.판매중);
    }
}