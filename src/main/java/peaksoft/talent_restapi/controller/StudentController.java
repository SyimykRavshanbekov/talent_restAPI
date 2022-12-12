package peaksoft.talent_restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.talent_restapi.DTO.student.StudentRequest;
import peaksoft.talent_restapi.DTO.student.StudentResponse;
import peaksoft.talent_restapi.service.StudentService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/getAll")
    public List<StudentResponse> getAllInstructor(){
        return studentService.getAllListStudent();
    }

    @GetMapping("/getAllByGroupId/{groupId}")
    public List<StudentResponse> getAllInstructor(@PathVariable Long groupId){
        return studentService.getAllStudents(groupId);
    }

    @PostMapping("/save/{id}")
    public StudentResponse saveStudent(@PathVariable Long id, @RequestBody StudentRequest studentRequest) throws IOException {
        return studentService.addStudent(id, studentRequest);
    }

    @GetMapping("/findById/{id}")
    public StudentResponse findById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public StudentResponse deleteById(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/update/{id}")
    public StudentResponse updateStudent(@RequestBody StudentRequest studentRequest, @PathVariable Long id) throws IOException {
        return studentService.updateStudent(studentRequest, id);
    }

    @PostMapping("/assignStudent/{studentId}/{groupId}")
    public void assignStudent(@PathVariable("studentId")Long studentId, @PathVariable("groupId") Long groupId) throws IOException {
        studentService.assignStudent(groupId, studentId);
    }
}
