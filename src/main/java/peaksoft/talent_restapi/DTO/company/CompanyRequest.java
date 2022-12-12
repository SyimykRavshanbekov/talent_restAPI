package peaksoft.talent_restapi.DTO.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.talent_restapi.entities.Course;
import peaksoft.talent_restapi.entities.Group;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequest {
    private String companyName;

    private String locatedCountry;

//    private List<Course> courses;
//
//    private List<Group> groups;
}
