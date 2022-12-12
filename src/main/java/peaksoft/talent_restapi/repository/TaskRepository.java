package peaksoft.talent_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import peaksoft.talent_restapi.entities.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "select c from Task c where c.lesson.id = :lessonId")
    List<Task> getAllTasks(Long lessonId);
}
