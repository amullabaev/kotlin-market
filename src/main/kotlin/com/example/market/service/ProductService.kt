package com.example.market.service

import com.example.market.dto.ProductDto
import com.example.market.entity.Product
import java.util.*

interface ProductService {
    fun findAll(): Iterable<Product>
    fun findById(id: Long): Optional<Product>
    fun create(productDto: ProductDto): Product
}
