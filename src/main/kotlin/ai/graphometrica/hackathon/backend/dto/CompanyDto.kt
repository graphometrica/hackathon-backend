package ai.graphometrica.hackathon.backend.dto

import ai.graphometrica.hackathon.backend.domain.Company
import ai.graphometrica.hackathon.backend.exception.NotFoundException

data class CompanyDto(
    var name: String? = null,
    var address: String? = null,
    var okved_code: String? = null,
    var okved_name: String? = null,
    var city: String? = null,
    var location: String? = null,
    var website: String? = null,
    var sub_rubric: String? = null,
    var rubric: String? = null,
    var create_year: String? = null,
    var employee_number: String? = null,
    var ogrn: String? = null,
    var inn: Long? = null,
    var preds: Double? = null,
    var target: Long? = null,
    var proceed: String? = null,
    var soc_networks: String? = null
)

fun mapToCompanyDto(company: Company?): CompanyDto {

    company ?: throw NotFoundException()

    return CompanyDto(
     name = company.name,
     address = company.address,
     okved_code = company.okved_code,
     okved_name = company.okved_name,
     city = company.city,
     location = company.location,
     website = company.website,
     sub_rubric = company.sub_rubric,
     rubric = company.rubric,
     create_year = company.create_year,
     employee_number = company.employee_number,
     ogrn = company.ogrn,
     inn = company.inn,
     preds = company.preds,
     target = company.target,
     proceed = company.proceed,
     soc_networks = company.soc_networks
    )
}