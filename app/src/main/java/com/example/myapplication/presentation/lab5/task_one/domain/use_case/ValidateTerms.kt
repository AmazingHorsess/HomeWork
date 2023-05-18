package com.example.myapplication.presentation.lab5.task_one.domain.use_case

class ValidateTerms {

    fun execute(acceptedTerms: Boolean): ValidationResult {
        if(!acceptedTerms) {
            return ValidationResult(
                successful = false,
                errorMessage = "Пожалуйста, примите условия"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}