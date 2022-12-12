package peaksoft.talent_restapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.talent_restapi.DTO.task.TaskRequest;
import peaksoft.talent_restapi.DTO.task.TaskResponse;
import peaksoft.talent_restapi.converter.task.TaskRequestConverter;
import peaksoft.talent_restapi.converter.task.TaskResponseConverter;
import peaksoft.talent_restapi.entities.Lesson;
import peaksoft.talent_restapi.entities.Task;
import peaksoft.talent_restapi.repository.LessonRepository;
import peaksoft.talent_restapi.repository.TaskRepository;
import peaksoft.talent_restapi.service.TaskService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private final LessonRepository lessonRepository;

    private final TaskRequestConverter taskRequestConverter;

    private final TaskResponseConverter taskResponseConverter;

    @Override
    public List<TaskResponse> getAllTasks(Long id) {
        return taskResponseConverter.view(taskRepository.getAllTasks(id));
    }

    @Override
    public TaskResponse addTask(Long id, TaskRequest taskRequest) {
        Lesson lesson = lessonRepository.findById(id).get();
        Task task = taskRequestConverter.createTask(taskRequest);
        lesson.addTask(task);
        task.setLesson(lesson);
        taskRepository.save(task);
        return taskResponseConverter.viewTask(task);
    }

    @Override
    public TaskResponse getTaskById(Long id) {
        return taskResponseConverter.viewTask(taskRepository.getById(id));
    }

    @Override
    public TaskResponse updateTask(TaskRequest taskRequest, Long id) {
        Task task = taskRepository.findById(id).get();
        taskRequestConverter.updateTask(task, taskRequest);
        taskRepository.save(task);
        return taskResponseConverter.viewTask(task);
    }

    @Override
    public TaskResponse deleteTask(Long id) {
        Task task = taskRepository.findById(id).get();
        taskRepository.delete(task);
        return taskResponseConverter.viewTask(task);
    }
}
