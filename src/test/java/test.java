import com.mongodb.MongoClient;
import exam.dao.UserRepository;
import exam.model.Option;
import exam.model.Quiz;
import exam.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

public class test {

    MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), "question"));
    @Autowired
    UserRepository userRepository;

        @Test
    public void generateQuiz(){

        Option o = new Option("C","ccccccc");
        List<Option> l = new LinkedList<Option>();
        l.add(o);
        Quiz q = new Quiz(2,2,10,3,"jslakjslkdfjlads",l,"A","asdf");
        mongoOps.save(q);

        Quiz t = mongoOps.findOne(query(where("subject_id").is(2)),Quiz.class);
        System.out.println(t.toString());
    }
    @Test
    public void generateFreeSubject(){
    }

}
