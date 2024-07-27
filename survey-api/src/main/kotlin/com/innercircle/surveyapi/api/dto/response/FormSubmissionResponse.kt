package com.innercircle.surveyapi.api.dto.response

data class FormSubmissionResponse(
    val id: Long,
    val form_id: Long,
    val form_version: Int,
    val submitted_at: String,
    val respondent_info: String,
)
