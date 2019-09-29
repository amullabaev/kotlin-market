package com.example.market.service.impl

import com.example.market.dto.ProductDto
import com.example.market.entity.Category
import com.example.market.entity.Product
import com.example.market.repository.CategoryRepository
import com.example.market.repository.ProductRepository
import com.example.market.service.ProductService
import org.springframework.stereotype.Service
import java.util.*
import javax.persistence.EntityNotFoundException

@Service
class ProductServiceImpl(
        private val productRepository: ProductRepository,
        private val categoryRepository: CategoryRepository
) : ProductService {
    override fun findAll(): Iterable<Product> {
        return productRepository.findAll()
    }

    override fun findById(id: Long): Product? {
        return productRepository.findById(id).orElseThrow { EntityNotFoundException("There is no product with the given id!") }
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

    override fun update(id: Long, productDto: ProductDto): Product {
        val product: Product = productRepository.findById(id).orElseThrow { EntityNotFoundException("There is no product with the given id!") }
        val category: Category = categoryRepository.getOne(productDto.categoryId)
        product.name = productDto.name
        product.description = productDto.description
        product.amount = productDto.amount
        product.price = productDto.price
        product.category = category
        return productRepository.save(product)

    }

    override fun destroy(id: Long) {
        return productRepository.deleteById(id)
    }
}
