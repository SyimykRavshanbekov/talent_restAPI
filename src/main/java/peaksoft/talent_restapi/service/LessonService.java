package peaksoft.talent_restapi.service;

import peaksoft.talent_restapi.DTO.lesson.LessonRequest;
import peaksoft.talent_restapi.DTO.lesson.LessonResponse;
import peaksoft.talent_restapi.entities.Lesson;

import java.util.List;

public interface LessonService {
    List<LessonResponse> getAllLessons(Long id);

    LessonResponse addLesson(Long id, LessonRequest lessonRequest);

    LessonResponse getLessonById(Long id);

    LessonResponse updateLesson(LessonRequest lessonRequest, Long id);

    LessonResponse deleteLesson(Long id);
}
