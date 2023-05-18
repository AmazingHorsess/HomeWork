package com.example.myapplication.presentation.lab5.task_one.domain.use_case

class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword: String): ValidationResult {
        if(password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "Пароли не совпадают"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}