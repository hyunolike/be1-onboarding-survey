package com.innercircle.surveyapi.api.dto.response

data class CreateFormResponse(
    val form: FormDto,
    val questions: List<QuestionDto>,
)
