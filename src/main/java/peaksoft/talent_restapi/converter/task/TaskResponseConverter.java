package peaksoft.talent_restapi.converter.task;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.student.StudentResponse;
import peaksoft.talent_restapi.DTO.task.TaskResponse;
import peaksoft.talent_restapi.entities.Student;
import peaksoft.talent_restapi.entities.Task;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskResponseConverter {
    public TaskResponse viewTask(Task task){
        if (task==null){
            return null;
        }

        TaskResponse taskResponse = new TaskResponse();

        taskResponse.setId(task.getId());
        taskResponse.setTaskName(task.getTaskName());
        taskResponse.setTaskText(task.getTaskText());
        taskResponse.setDeadLine(task.getDeadLine());

        return taskResponse;
    }


    public List<TaskResponse> view(List<Task> tasks){
        List<TaskResponse> taskResponses = new ArrayList<>();

        for (Task task: tasks) {
            taskResponses.add(viewTask(task));
        }

        return  taskResponses;
    }
}
