package com.innercircle.surveyapi.api.dto.request

data class FormSubmissionRequest(
    val respondent_info: String,
    val responses: List<SubmissionRequest>,
)
