package ai.graphometrica.hackathon.backend.dto

import ai.graphometrica.hackathon.backend.domain.Company

data class CompanyDto(
    val inn: String
)

fun mapToCompanyDto(company: Company): CompanyDto {
    return CompanyDto(
        inn = company.inn
    )
}