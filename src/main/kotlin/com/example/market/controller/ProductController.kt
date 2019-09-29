package com.example.market.controller

import com.example.market.dto.ProductDto
import com.example.market.entity.Product
import com.example.market.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(private val productService: ProductService) {

    @GetMapping
    fun findAll(): Iterable<Product> {
        return productService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Product? {
        return productService.findById(id)
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun create(@RequestBody productDto: ProductDto): Product {
        return productService.create(productDto)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody productDto: ProductDto): Product {
        return productService.update(id, productDto)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    fun destroy(@PathVariable id: Long) {
        return productService.destroy(id)
    }
}
