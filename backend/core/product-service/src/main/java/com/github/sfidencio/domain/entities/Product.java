package com.github.sfidencio.domain.entities;

import com.github.sfidencio.config.Constants;
import com.github.sfidencio.domain.exceptions.DomainException;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(UUID id,
                      String description,
                      BigDecimal price,
                      BigDecimal stock) {

    public Product() {
        this(UUID.randomUUID(), "", BigDecimal.ZERO, BigDecimal.ZERO);
    }


    public void validatePrice() {
        if (this.price == null || this.price.compareTo(BigDecimal.ZERO) <= 0)
            throw new DomainException(Constants.MSG_ERRO_DOMAIN_INVALID_PRICE, Constants.HTTP_STATUS_CODE_422);
    }

    public void validateStock() {
        if (this.stock == null || this.stock.compareTo(BigDecimal.ZERO) < 0) {
            throw new DomainException(Constants.MSG_ERRO_DOMAIN_INVALID_STOCK, Constants.HTTP_STATUS_CODE_422);
        }
    }

}
