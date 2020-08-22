package ai.graphometrica.hackathon.backend.controller

import ai.graphometrica.hackathon.backend.dto.CompanyDto
import ai.graphometrica.hackathon.backend.dto.mapToCompanyDto
import ai.graphometrica.hackathon.backend.service.CompanyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BackendController(
    val companyService: CompanyService
) {

    @GetMapping("company/inn/{inn}")
    fun getCompanyByInn(@PathVariable("inn") inn: String): CompanyDto {
        return mapToCompanyDto(companyService.getCompanyByInn(inn))
    }

}