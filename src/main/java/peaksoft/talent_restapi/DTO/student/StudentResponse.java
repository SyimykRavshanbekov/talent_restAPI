package peaksoft.talent_restapi.DTO.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.talent_restapi.enums.StudyFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private StudyFormat studyFormat;
}
