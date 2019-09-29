package com.example.market.controller

import com.example.market.dto.CategoryDto
import com.example.market.entity.Category
import com.example.market.service.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/categories")
class CategoryController(private val categoryService: CategoryService) {

    @GetMapping
    fun findAll(): Iterable<Category> {
        return categoryService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Category? {
        return categoryService.findById(id)
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun create(@RequestBody categoryDto: CategoryDto): Category {
        return categoryService.create(categoryDto)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody categoryDto: CategoryDto): Category {
        return categoryService.update(id, categoryDto)
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    fun destroy(@PathVariable id: Long) {
        return categoryService.destroy(id)
    }
}
