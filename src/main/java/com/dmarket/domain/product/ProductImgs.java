package com.dmarket.domain.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductImgs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgId;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String imgAddress;

    @Builder
    public ProductImgs(Long productId, String imgAddress) {
        this.productId = productId;
        this.imgAddress = imgAddress;
    }
}
