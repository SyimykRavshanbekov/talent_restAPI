package peaksoft.talent_restapi.DTO.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.talent_restapi.entities.Company;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequest {

    private String courseName;

    private int duration;

    private String description;
}
