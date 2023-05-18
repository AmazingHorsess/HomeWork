package com.example.myapplication.presentation.lab5.task_one.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)