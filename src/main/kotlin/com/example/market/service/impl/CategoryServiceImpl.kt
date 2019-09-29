package com.example.market.service.impl

import com.example.market.dto.CategoryDto
import com.example.market.entity.Category
import com.example.market.repository.CategoryRepository
import com.example.market.service.CategoryService
import org.springframework.stereotype.Service
import java.util.*
import javax.persistence.EntityNotFoundException

@Service
class CategoryServiceImpl(private val categoryRepository: CategoryRepository) : CategoryService {
    override fun findAll(): Iterable<Category> {
        return categoryRepository.findAll()
    }

    override fun findById(id: Long): Category? {
        return categoryRepository.findById(id).orElseThrow { EntityNotFoundException("There is no category with the given id!") }
    }

    override fun create(categoryDto: CategoryDto): Category {
        val category = Category(
                name = categoryDto.name,
                description = categoryDto.description,
                rowCreatedDate = Date()
        )
        return categoryRepository.save(category)
    }

    override fun update(id: Long, categoryDto: CategoryDto): Category {
        val category: Category = categoryRepository.findById(id).orElseThrow { EntityNotFoundException("There is no category with the given id!") }
        category.name = categoryDto.name
        category.description = categoryDto.description
        return categoryRepository.save(category)
    }

    override fun destroy(id: Long) {
        return categoryRepository.deleteById(id)
    }
}
