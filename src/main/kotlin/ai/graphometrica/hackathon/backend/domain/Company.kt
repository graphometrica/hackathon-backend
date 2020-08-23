package ai.graphometrica.hackathon.backend.domain

/*
select u.name,u.address, u.okved_code,u.okved_name,u.city,u.location,
u.website, u.okved_code, u.okved_name,
u.rubric,
u.sub_rubric,
u.create_year,
u.employee_number,
u.ogrn,
u.inn,
a.preds, a.target from analytics a join unofficial u on a.inn = u.inn order by location
 */

data class Company(
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