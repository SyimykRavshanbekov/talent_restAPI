package peaksoft.talent_restapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.talent_restapi.DTO.lesson.LessonRequest;
import peaksoft.talent_restapi.DTO.lesson.LessonResponse;
import peaksoft.talent_restapi.converter.lesson.LessonRequestConverter;
import peaksoft.talent_restapi.converter.lesson.LessonResponseConverter;
import peaksoft.talent_restapi.entities.Course;
import peaksoft.talent_restapi.entities.Lesson;
import peaksoft.talent_restapi.repository.CourseRepository;
import peaksoft.talent_restapi.repository.LessonRepository;
import peaksoft.talent_restapi.service.LessonService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;
    private final CourseRepository courseRepository;
    private final LessonRequestConverter lessonRequestConverter;
    private final LessonResponseConverter lessonResponseConverter;

    @Override
    public List<LessonResponse> getAllLessons(Long id) {
        return lessonResponseConverter.view(lessonRepository.getAllLessons(id));
    }

    @Override
    public LessonResponse addLesson(Long id, LessonRequest lessonRequest) {
        Course course = courseRepository.getById(id);
        Lesson lesson = lessonRequestConverter.createLesson(lessonRequest);
        course.addLesson(lesson);
        lesson.setCourse(course);
        lessonRepository.save(lesson);
        return lessonResponseConverter.viewLesson(lesson);
    }

    @Override
    public LessonResponse getLessonById(Long id) {
        return lessonResponseConverter.viewLesson(lessonRepository.getById(id));
    }

    @Override
    public LessonResponse updateLesson(LessonRequest lessonRequest, Long id) {
        Lesson lesson = lessonRepository.findById(id).get();
        lessonRequestConverter.updateLesson(lesson, lessonRequest);
        lessonRepository.save(lesson);
        return lessonResponseConverter.viewLesson(lesson);
    }

    @Override
    public LessonResponse deleteLesson(Long id) {
        Lesson lesson = lessonRepository.findById(id).get();
        lessonRepository.delete(lesson);
        return lessonResponseConverter.viewLesson(lesson);
    }
}
