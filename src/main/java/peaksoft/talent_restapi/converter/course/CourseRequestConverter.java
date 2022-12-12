package peaksoft.talent_restapi.converter.course;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.company.CompanyRequest;
import peaksoft.talent_restapi.DTO.course.CourseRequest;
import peaksoft.talent_restapi.entities.Company;
import peaksoft.talent_restapi.entities.Course;

@Component
public class CourseRequestConverter {
    public Course createCourse(CourseRequest courseRequest){
        if (courseRequest == null){
            return null;
        }

        Course course = new Course();

        course.setCourseName(courseRequest.getCourseName());
        course.setDescription(courseRequest.getDescription());
        course.setDuration(courseRequest.getDuration());

        return course;
    }


    public void updateCourse(Course course, CourseRequest courseRequest){
        if (courseRequest.getCourseName() != null){
            course.setCourseName(courseRequest.getCourseName());
        }if (courseRequest.getDuration() == 0){
            course.setDuration(courseRequest.getDuration());
        }if (courseRequest.getDescription() != null){
            course.setDescription(courseRequest.getDescription());
        }
    }
}
