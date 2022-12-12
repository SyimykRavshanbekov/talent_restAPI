package peaksoft.talent_restapi.service;

import peaksoft.talent_restapi.DTO.task.TaskRequest;
import peaksoft.talent_restapi.DTO.task.TaskResponse;
import peaksoft.talent_restapi.entities.Task;

import java.util.List;

public interface TaskService {
    List<TaskResponse> getAllTasks(Long id);

    TaskResponse addTask(Long id, TaskRequest taskRequest);

    TaskResponse getTaskById(Long id);

    TaskResponse updateTask(TaskRequest taskRequest, Long id);

    TaskResponse deleteTask(Long id);
}
