package com.example.myapplication.presentation.lab5.task_one.domain.use_case

class ValidatePassword {
    fun execute(password: String): ValidationResult {
        if(password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "Пароль должен состоять не менее чем из 8 символов"
            )
        }
        val containsLettersAndDigits = password.any { it.isDigit() } &&
                password.any { it.isLetter() }
        if(!containsLettersAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "Пароль должен содержать хотя бы одну букву и цифру"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}