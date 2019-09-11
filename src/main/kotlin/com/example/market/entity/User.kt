package com.example.market.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var firstName: String,
        var lastName: String,
        var email: String,
        var rowCreatedDate: Date,

        @ManyToOne
        @JoinColumn(name = "role_id")
        var role: Role
)
