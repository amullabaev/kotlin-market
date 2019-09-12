package com.example.market.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "products")
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String,
        var description: String,
        var amount: Long,
        var price: Long,
        var rowCreatedDate: Date,

        @ManyToOne
        @JoinColumn(name = "category_id")
        var category: Category
)
