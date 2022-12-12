package peaksoft.talent_restapi.service;

import peaksoft.talent_restapi.DTO.instructor.InstructorRequest;
import peaksoft.talent_restapi.DTO.instructor.InstructorResponse;
import peaksoft.talent_restapi.entities.Instructor;

import java.io.IOException;
import java.util.List;

public interface InstructorService {
    List<InstructorResponse> getAllList();

    List<InstructorResponse> getAllInstructor(Long courseId);

    InstructorResponse addInstructor(Long id, InstructorRequest instructor) throws IOException;

    InstructorResponse getInstructorById(Long id);

    InstructorResponse updateInstructor(InstructorRequest instructor, Long id) throws IOException;

    InstructorResponse deleteInstructor(Long id);

    void assignInstructor(Long courseId, Long instructorId) throws IOException;
}
