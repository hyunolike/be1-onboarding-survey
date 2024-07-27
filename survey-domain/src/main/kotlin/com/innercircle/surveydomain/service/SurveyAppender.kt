package com.innercircle.surveydomain.service

import java.text.Normalizer.Form

/**
 * @author Theo
 * @since 2024/07/27
 */
interface SurveyAppender {
    fun append(title:String, description:String?): Form
    fun append(definition: SurveyFormDefinitionasadsa): Formdsadsadas
dsadasdsa
    data class SurveyFormDefinitionasadsa(
        val title: String,
        val description: String?,
        val required: Boolean,
        val order: Long,dasdsa
        val content: String
    )

}
