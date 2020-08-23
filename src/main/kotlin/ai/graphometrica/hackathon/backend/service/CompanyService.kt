package ai.graphometrica.hackathon.backend.service

import ai.graphometrica.hackathon.backend.domain.Company
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Service

@Service
class CompanyService(
    val jdbcTemplate: JdbcTemplate
) {

    val sql = """select u.name,u.address, u.okved_code,u.okved_name,u.city,u.location,
u.website, u.rubric, u.sub_rubric, u.create_year, u.employee_number, u.ogrn, u.inn,
a.preds, a.target, u.proceed, u.soc_networks
from analytics a join unofficial u on a.inn = u.inn order by location"""

    fun getAll(): List<Company> {
        return jdbcTemplate.query(sql, RowMapper { rs, rowNum ->
            Company(
                name = rs.getString(1),
                address = rs.getString(2),
                okved_code = rs.getString(3),
                okved_name = rs.getString(4),
                city = rs.getString(5),
                location = rs.getString(6),
                website = rs.getString(7),
                rubric = rs.getString(8),
                sub_rubric = rs.getString(9),
                create_year = rs.getString(10),
                employee_number = rs.getString(11),
                ogrn = rs.getString(12),
                inn = rs.getLong(13),
                preds = rs.getDouble(14),
                target = rs.getLong(15),
                proceed = rs.getString(16),
                soc_networks = rs.getString(17)
            )
        })

    }

}