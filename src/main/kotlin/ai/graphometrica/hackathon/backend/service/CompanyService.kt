package ai.graphometrica.hackathon.backend.service

import ai.graphometrica.hackathon.backend.domain.Company
import org.springframework.stereotype.Service
import javax.websocket.server.ServerEndpoint

@Service
class CompanyService {

    fun getCompanyByInn(inn: String): Company {
        return Company(inn)
    }

}