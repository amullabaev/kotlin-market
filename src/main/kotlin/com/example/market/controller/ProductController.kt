package com.example.market.controller

import com.example.market.dto.ProductDto
import com.example.market.entity.Product
import com.example.market.service.ProductService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/products")
class ProductController(private val productService: ProductService) {

    @GetMapping
    fun findAll(): Iterable<Product> {
        return productService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Optional<Product> {
        return productService.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody productDto: ProductDto): Product {
        return productService.create(productDto)
    }
}
