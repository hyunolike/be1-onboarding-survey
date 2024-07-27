package com.innercircle.surveydomain.service

import com.innercircle.surveycommon.dto.request.CreateFormRequest
import com.innercircle.surveycommon.dto.request.FormSubmissionRequest
import com.innercircle.surveycommon.dto.response.CreateFormResponse
import com.innercircle.surveycommon.dto.response.FormSubmissionResponse
import com.innercircle.surveydomain.domain.Form

interface SurveyService {
    fun createForm(request: CreateFormCommand): CreateFormResponse

    fun submitForm(
        forms_id: Long,
        request: FormSubmissionRequest,
    ): Form

    data class CreateFormCommand(
        val title: String,
        val description: String,
        val isActive: Boolean?,
        val questions: List<QuestionCommand>,
    )

    data class FormDefinition(
        val id: Long,
        val title: String,
        val description: String,
        val isActive: Boolean,
        val version: Int,
    )
}
