package exam.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Document("qustion")
public class Quiz {

    private Integer subject_id;
    private Integer exam_id;
    private Integer question_totalcount;
    private Integer question_no;
    private String question_desc;
    private List<Option> question_options;
    private String correct_option;
    private String question_explain;

    public Quiz(){}

    public Quiz(Integer subject_id, Integer exam_id, Integer question_totalcount, Integer question_no, String question_desc, List<Option> question_options, String correct_option, String question_explain) {
        this.subject_id = subject_id;
        this.exam_id = exam_id;
        this.question_totalcount = question_totalcount;
        this.question_no = question_no;
        this.question_desc = question_desc;
        this.question_options = question_options;
        this.correct_option = correct_option;
        this.question_explain = question_explain;
    }

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public Integer getExam_id() {
        return exam_id;
    }

    public void setExam_id(Integer exam_id) {
        this.exam_id = exam_id;
    }

    public Integer getQuestion_totalcount() {
        return question_totalcount;
    }

    public void setQuestion_totalcount(Integer question_totalcount) {
        this.question_totalcount = question_totalcount;
    }

    public Integer getQuestion_no() {
        return question_no;
    }

    public void setQuestion_no(Integer question_no) {
        this.question_no = question_no;
    }

    public String getQuestion_desc() {
        return question_desc;
    }

    public void setQuestion_desc(String question_desc) {
        this.question_desc = question_desc;
    }

    public List<Option> getQuestion_options() {
        return question_options;
    }

    public void setQuestion_options(List<Option> question_options) {
        this.question_options = question_options;
    }

    public String getCorrect_option() {
        return correct_option;
    }

    public void setCorrect_option(String correct_option) {
        this.correct_option = correct_option;
    }

    public String getQuestion_explain() {
        return question_explain;
    }

    public void setQuestion_explain(String question_explain) {
        this.question_explain = question_explain;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "subject_id=" + subject_id +
                ", exam_id=" + exam_id +
                ", question_totalcount=" + question_totalcount +
                ", question_no=" + question_no +
                ", question_desc='" + question_desc + '\'' +
                ", question_options=" + question_options +
                ", correct_option='" + correct_option + '\'' +
                ", question_explain='" + question_explain + '\'' +
                '}';
    }
}
