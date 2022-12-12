package peaksoft.talent_restapi.converter.lesson;

import org.springframework.stereotype.Component;
import peaksoft.talent_restapi.DTO.lesson.LessonRequest;
import peaksoft.talent_restapi.entities.Lesson;

@Component
public class LessonRequestConverter {
    public Lesson createLesson(LessonRequest lessonRequest){
        if (lessonRequest == null){
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setLessonName(lessonRequest.getLessonName());

        return lesson;
    }


    public void updateLesson(Lesson lesson, LessonRequest lessonRequest){
        if (lessonRequest.getLessonName() != null){
            lesson.setLessonName(lessonRequest.getLessonName());
        }
    }
}
