package com.innercircle.surveyapi.api.dto.response

data class QuestionOptionDto(
    val id: Int,
    val questionId: Int,
    val optionText: String,
    val optionOrder: Int,
)
