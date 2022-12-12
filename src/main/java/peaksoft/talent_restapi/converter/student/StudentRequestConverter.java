package peaksoft.talent_restapi.converter.student;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.instructor.InstructorRequest;
import peaksoft.talent_restapi.DTO.student.StudentRequest;
import peaksoft.talent_restapi.entities.Instructor;
import peaksoft.talent_restapi.entities.Student;

@Component
public class StudentRequestConverter {
    public Student createStudent(StudentRequest studentRequest){
        if (studentRequest == null){
            return null;
        }

        Student student = new Student();

        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setEmail(studentRequest.getEmail());
        student.setPhoneNumber(studentRequest.getPhoneNumber());
        student.setLastName(studentRequest.getLastName());
        student.setStudyFormat(studentRequest.getStudyFormat());

        return student;
    }


    public void updateStudent(Student student, StudentRequest studentRequest){
        if (studentRequest.getFirstName() != null){
            student.setFirstName(studentRequest.getFirstName());
        }if (studentRequest.getLastName() != null){
            student.setFirstName(studentRequest.getFirstName());
        }if (studentRequest.getEmail() != null){
            student.setEmail(studentRequest.getEmail());
        }if (studentRequest.getStudyFormat() != null){
            student.setStudyFormat(studentRequest.getStudyFormat());
        }if (studentRequest.getPhoneNumber() != null){
            student.setPhoneNumber(studentRequest.getPhoneNumber());
        }
    }
}
