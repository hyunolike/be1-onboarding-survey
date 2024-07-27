@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.innercircle.survey.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "questions")
data class Question(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @ManyToOne
    @JoinColumn(name = "form_id", nullable = false)
    var formJpaEntity: FormJpaEntity,
    val formVersion: Int,
    val questionText: String,
    val questionType: String,
    @Column(name = "question_order", nullable = false)
    val questionOrder: Int,
    @Column(name = "is_required", nullable = false)
    val isRequired: Boolean,
    @Column(name = "additional_config")
    val additionalConfig: String?,
    @OneToMany(mappedBy = "question", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val responses: List<Response> = emptyList(),
    @OneToMany(mappedBy = "question", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var questionOptions: List<QuestionOption> = emptyList(),
)
