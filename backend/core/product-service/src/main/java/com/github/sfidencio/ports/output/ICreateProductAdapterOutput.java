package com.github.sfidencio.ports.output;

import com.github.sfidencio.domain.entities.Product;

public interface ICreateProductAdapterOutput {
  Product execute(Product domain);
}
