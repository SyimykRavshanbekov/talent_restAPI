package peaksoft.talent_restapi.converter.company;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.company.CompanyResponse;
import peaksoft.talent_restapi.entities.Company;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyResponseConverter {
    public CompanyResponse viewCompany(Company company){
        if (company==null){
            return null;
        }

        CompanyResponse companyResponse = new CompanyResponse();

        companyResponse.setId(company.getId());
        companyResponse.setCompanyName(company.getCompanyName());
        companyResponse.setLocatedCountry(company.getLocatedCountry());
        companyResponse.setCount(company.getCount());

        return companyResponse;
    }

    public List<CompanyResponse> view(List<Company> companies){
        List<CompanyResponse> companyResponses = new ArrayList<>();

        for (Company company: companies) {
            companyResponses.add(viewCompany(company));
        }

        return  companyResponses;
    }
}
