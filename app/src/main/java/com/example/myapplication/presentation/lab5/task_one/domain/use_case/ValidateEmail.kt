package com.example.myapplication.presentation.lab5.task_one.domain.use_case

import android.util.Patterns

class ValidateEmail {
    fun execute(email: String): ValidationResult {
        if(email.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "Электронная почта не может быть пуста"
            )
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                errorMessage = "Это недействительный адрес электронной почты"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}