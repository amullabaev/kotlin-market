package com.example.market.service

import com.example.market.dto.ProductDto
import com.example.market.entity.Product

interface ProductService {
    fun findAll(): Iterable<Product>
    fun findById(id: Long): Product?
    fun create(productDto: ProductDto): Product
    fun update(id: Long, productDto: ProductDto): Product
    fun destroy(id: Long)
}
