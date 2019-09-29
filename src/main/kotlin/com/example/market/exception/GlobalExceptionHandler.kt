package com.example.market.exception

import com.example.market.dto.EntityNotFoundExceptionResponseDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.persistence.EntityNotFoundException

@RestControllerAdvice
class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EntityNotFoundException::class)
    fun handleEntityNotFoundException(exception: EntityNotFoundException): EntityNotFoundExceptionResponseDto {
        return EntityNotFoundExceptionResponseDto(message = exception.message
                ?: "Not Found", status = HttpStatus.NOT_FOUND, code = HttpStatus.NOT_FOUND.value())
    }
}
