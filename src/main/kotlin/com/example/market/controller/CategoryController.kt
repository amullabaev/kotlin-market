package com.example.market.controller

import com.example.market.dto.CategoryDto
import com.example.market.entity.Category
import com.example.market.service.CategoryService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/categories")
class CategoryController(private val categoryService: CategoryService) {

    @GetMapping
    fun findAll(): Iterable<Category> {
        return categoryService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Optional<Category> {
        return categoryService.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody categoryDto: CategoryDto): Category {
        return categoryService.create(categoryDto)
    }

}
