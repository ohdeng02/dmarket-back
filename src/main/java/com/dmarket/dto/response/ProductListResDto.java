package com.dmarket.dto.response;

import com.dmarket.dto.common.ProductListDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductListResDto {
    private int totalPage;
    private List<ProductListDto> productList;
}

