package peaksoft.talent_restapi.converter.company;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.company.CompanyRequest;
import peaksoft.talent_restapi.entities.Company;
import peaksoft.talent_restapi.entities.Course;
import peaksoft.talent_restapi.entities.Group;

import java.util.List;

@Component
public class CompanyRequestConverter {
    public Company createCompany(CompanyRequest companyRequest){
        if (companyRequest == null){
            return null;
        }

        Company company = new Company();

        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());

//        List<Course> courses = companyRequest.getCourses();
//        List<Group> groups = companyRequest.getGroups();
//
//        courses.forEach(x -> x.setCompany(company));
//        groups.forEach(x -> x.setCompany(company));
//
//        company.setCourses(courses);
//        company.setGroups(groups);

        return company;
    }


    public void updateCompany(Company company, CompanyRequest companyRequest){

        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());
    }

}
