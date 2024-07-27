package com.innercircle.surveyapplication

import com.innercircle.survey.persistence.repository.FormJpaRepository
import com.innercircle.surveycommon.dto.response.*
import com.innercircle.surveydomain.model.*
import com.innercircle.surveydomain.module_infrastructure.module_persistence.entity.*
import com.innercircle.surveydomain.module_infrastructure.module_persistence.repository.ResponseRepository
import com.innercircle.surveydomain.module_infrastructure.module_persistence.repository.SubmissionRepository
import com.innercircle.surveydomain.service.SurveyAppender
import org.springframework.stereotype.Service
import java.text.Normalizer
import java.time.LocalDateTime

@Service
class SurveyServiceImpl(
    private val formRepository: FormJpaRepository,
    private val submissionRepository: SubmissionRepository,
    private val responseRepository: ResponseRepository
) : SurveyAppender, SurveyReader, SurveyUpdater {
    override fun append(title: String, description: String?): Normalizer.Form {
        formRepository.save(FormEntity(
            title = title,
            description = description,
            createdAt = LocalDateTime.now()
        ))
    }

    override fun append(definition: SurveyAppender.SurveyFormDefinitionasadsa): Normalizer.Form {
        val (title, description, required, order, content) = definition


        return form
    }
}
