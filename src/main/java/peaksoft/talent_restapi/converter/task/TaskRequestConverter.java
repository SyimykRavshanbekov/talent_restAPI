package peaksoft.talent_restapi.converter.task;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.student.StudentRequest;
import peaksoft.talent_restapi.DTO.task.TaskRequest;
import peaksoft.talent_restapi.entities.Student;
import peaksoft.talent_restapi.entities.Task;

@Component
public class TaskRequestConverter {
    public Task createTask(TaskRequest taskRequest){
        if (taskRequest == null){
            return null;
        }

        Task task = new Task();

        task.setTaskName(taskRequest.getTaskName());
        task.setTaskText(taskRequest.getTaskText());
        task.setDeadLine(taskRequest.getDeadLine());

        return task;
    }


    public void updateTask(Task task, TaskRequest taskRequest){
        if (taskRequest.getTaskText() != null){
            task.setTaskText(taskRequest.getTaskText());
        }if (taskRequest.getTaskName() != null){
            task.setTaskName(taskRequest.getTaskName());
        }if (taskRequest.getDeadLine() != null){
            task.setDeadLine(taskRequest.getDeadLine());
        }
    }
}
