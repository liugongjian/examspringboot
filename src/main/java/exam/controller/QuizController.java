package exam.controller;


import exam.dao.QuizDao;
import exam.model.Quiz;
import exam.model.ResponseData;
import exam.model.SubjectAndExam;
import exam.model.SubjectInfo;
import exam.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping("/manage/exam")
    public ResponseEntity<ResponseData<Quiz>> getQuestion(@RequestParam("subject_id") Integer subject_id, @RequestParam("exam_id") Integer exam_id, @RequestParam("question_no") Integer question_no){
        Quiz q = quizService.getQuestion(subject_id,exam_id,question_no);
        ResponseData<Quiz> responseData = new ResponseData<Quiz>(0,"",q);
        return new ResponseEntity(responseData, HttpStatus.OK);
    }

    @GetMapping("/manage/subject")
    public ResponseEntity<ResponseData<SubjectInfo>> getSubjectInfo(@RequestParam("subject_id") Integer subject_id){

        SubjectAndExam m = quizService.getSubjectAndExamInfo(subject_id);

        ResponseData<SubjectAndExam> responseData = new ResponseData<SubjectAndExam>(0,"",m);
        return new ResponseEntity(responseData, HttpStatus.OK);

    }

    @GetMapping("/manage/subjects")
    public ResponseEntity<ResponseData<List<SubjectInfo>>> getSubjects(){

        List<SubjectInfo> ls = quizService.getSubjects();

        ResponseData<List<SubjectInfo>> responseData = new ResponseData<List<SubjectInfo>>(0,"",ls);
        for(SubjectInfo s : ls){
            System.out.println(s.toString());
        }
        return new ResponseEntity(responseData, HttpStatus.OK);

    }
}
