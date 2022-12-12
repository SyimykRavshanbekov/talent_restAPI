package peaksoft.talent_restapi.service;


import peaksoft.talent_restapi.DTO.company.CompanyRequest;
import peaksoft.talent_restapi.DTO.company.CompanyResponse;
import peaksoft.talent_restapi.entities.Company;

import java.io.IOException;
import java.util.List;


public interface CompanyService {
    List<CompanyResponse> getAllCompanies();

    CompanyResponse addCompany(CompanyRequest companyRequest) throws IOException;

    CompanyResponse getCompanyById(Long id);

    CompanyResponse updateCompany(Long companyId, CompanyRequest companyRequest) throws IOException;

    CompanyResponse deleteCompany(Long companyId);
}
