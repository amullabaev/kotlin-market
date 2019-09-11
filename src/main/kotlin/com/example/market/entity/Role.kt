package com.example.market.entity

import javax.persistence.*

@Entity
@Table(name = "roles")
data class Role (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String
)
