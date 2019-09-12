package com.example.market.service.impl

import com.example.market.dto.ProductDto
import com.example.market.entity.Category
import com.example.market.entity.Product
import com.example.market.repository.CategoryRepository
import com.example.market.repository.ProductRepository
import com.example.market.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
        private val productRepository: ProductRepository,
        private val categoryRepository: CategoryRepository
) : ProductService {
    override fun findAll(): Iterable<Product> {
        return productRepository.findAll()
    }

    override fun findById(id: Long): Optional<Product> {
        return productRepository.findById(id)
    }

    override fun create(productDto: ProductDto): Product {
        val category: Category = categoryRepository.getOne(productDto.categoryId)
        val product = Product(
                name = productDto.name,
                description = productDto.description,
                amount = productDto.amount,
                price = productDto.price,
                category = category,
                rowCreatedDate = Date()
        )
        return productRepository.save(product)
    }
}
