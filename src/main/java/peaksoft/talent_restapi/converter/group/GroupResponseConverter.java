package peaksoft.talent_restapi.converter.group;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.course.CourseResponse;
import peaksoft.talent_restapi.DTO.group.GroupResponse;
import peaksoft.talent_restapi.entities.Course;
import peaksoft.talent_restapi.entities.Group;

import java.util.ArrayList;
import java.util.List;

@Component
public class GroupResponseConverter {
    public GroupResponse viewGroup(Group group){
        if (group==null){
            return null;
        }

        GroupResponse groupResponse = new GroupResponse();

        groupResponse.setId(group.getId());
        groupResponse.setGroupName(group.getGroupName());
        groupResponse.setImage(group.getImage());
        groupResponse.setCount(group.getCount());
        groupResponse.setDateOfStart(group.getDateOfStart());

        return groupResponse;
    }

    public List<GroupResponse> view(List<Group> groups){
        List<GroupResponse> groupResponses = new ArrayList<>();

        for (Group group: groups) {
            groupResponses.add(viewGroup(group));
        }

        return  groupResponses;
    }
}
