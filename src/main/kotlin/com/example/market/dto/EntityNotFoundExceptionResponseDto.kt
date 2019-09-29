package com.example.market.dto

import org.springframework.http.HttpStatus

class EntityNotFoundExceptionResponseDto(
        var status: HttpStatus,
        var message: String
)
