package exam.service;

import exam.dao.QuizDao;
import exam.model.ExamInfo;
import exam.model.Quiz;
import exam.model.SubjectAndExam;
import exam.model.SubjectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    public Quiz getQuestion(Integer subject_id, Integer exam_id, Integer question_no){

        return quizDao.getQuestion(subject_id,exam_id,question_no);
    }

    public SubjectAndExam getSubjectAndExamInfo(Integer subject_id) {

        SubjectInfo si = quizDao.getSubjectInfo(subject_id);
        List<ExamInfo> le = quizDao.getExamInfo(subject_id);
        SubjectAndExam subjectAndExam = new SubjectAndExam(si,le);
        return subjectAndExam;
    }

    public List<SubjectInfo> getSubjects() {

        return quizDao.getSubjects();

    }
}
