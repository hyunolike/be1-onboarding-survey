@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.innercircle.survey.persistence.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "submissions")
data class Submission(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @ManyToOne @JoinColumn(name = "form_id", nullable = false)
    val formJpaEntity: FormJpaEntity,
    val formVersion: Int,
    val submittedAt: LocalDateTime = LocalDateTime.now(),
    val respondentInfo: String?,
    @OneToMany(mappedBy = "submission", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val responses: List<Response> = emptyList(),
)
