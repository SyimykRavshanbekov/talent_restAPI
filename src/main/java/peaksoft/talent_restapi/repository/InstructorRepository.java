package peaksoft.talent_restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import peaksoft.talent_restapi.entities.Instructor;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    @Query(value = "select c from Instructor c where c.course.id = :courseId")
    List<Instructor> getAllInstructor(Long courseId);
}
