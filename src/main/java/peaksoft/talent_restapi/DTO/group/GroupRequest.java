package peaksoft.talent_restapi.DTO.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.talent_restapi.entities.Company;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupRequest {
    private String groupName;

    private LocalDate dateOfStart;

    private String image;
}
