package com.example.shoppingmall.shopGoods.dto;

import com.example.shoppingmall.shopGoods.entity.ShopClassification;
import com.example.shoppingmall.shopGoods.entity.ShopEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
// 고객용 ShopDto
public class ShopDto {
  private String shopName;
  private String introduction;

  private ShopClassification shopClassification;

  // todo 상품 추가 시, private List<GoodsEntity> goods;도 추가

  public static ShopDto fromEntity(ShopEntity entity) {
    return new ShopDto(
      entity.getShopName(),
      entity.getIntroduction(),
      entity.getShopClassification()
    );
  }
}
