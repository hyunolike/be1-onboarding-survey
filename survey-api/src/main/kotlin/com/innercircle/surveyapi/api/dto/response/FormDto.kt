package com.innercircle.surveyapi.api.dto.response

data class FormDto(
    val id: Int,
    val title: String,
    val description: String,
    val createdAt: String,
    val updatedAt: String,
    val isActive: Boolean,
    val version: Int,
)
