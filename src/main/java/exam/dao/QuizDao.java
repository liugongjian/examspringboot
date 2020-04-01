package exam.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import exam.model.ExamInfo;
import exam.model.Option;
import exam.model.Quiz;
import exam.model.SubjectInfo;
import exam.util.MongoDBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;


@Repository
public class QuizDao {

//    @Autowired
//    MongoDBUtil mongoDBUtil;
//    MongoOperations mongoOperations = mongoDBUtil.getMongoOps("test");
//    MongoOperations mongoOperations = new MongoTemplate(new SimpleMongoClientDbFactory(MongoClients.create(), "qustion"));

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    ExamRepository examRepository;

    MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), "question"));


    public Quiz getQuestion(Integer subject_id, Integer exam_id, Integer question_no){

        Quiz q = mongoOps.findOne(query(where("subject_id").is(subject_id).and("exam_id").is(exam_id).and("question_no").is(question_no)), Quiz.class);
        return q;
    }

    public SubjectInfo getSubjectInfo(Integer subject_id) {
        SubjectInfo si = subjectRepository.findBySubjectId(subject_id);
        //System.out.println(si.toString());
        return si;
    }

    public List<ExamInfo> getExamInfo(Integer subject_id) {
        List<ExamInfo> le = examRepository.findBySubjectId(subject_id);
        return le;
    }

    public List<SubjectInfo> getSubjects() {
        List<SubjectInfo> le = subjectRepository.getSubjects();
        return le;
    }

//    public void generateQuiz(){
//
//        Option o = new Option("A","alksjdlfjaskdjfl");
//        List<Option> l = new LinkedList<Option>();
//        l.add(o);
//        Quiz q = new Quiz(2,2,10,1,"jslakjslkdfjlads",l,"A","asdf");
//        mongoOps.save(q);
//
//        Quiz t = mongoOps.findOne(query(where("subject_id").is(2)),Quiz.class);
//        System.out.println(t.toString());
//    }
}
