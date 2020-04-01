package exam.model;


import javax.persistence.*;

@Entity
@Table(name="exam_info")
public class ExamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id")
    private int examId;

    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "total_question")
    private int totalQuestion;

    public int getExamId() {
        return examId;
    }

    public void setExamId(int exam_id) {
        this.examId = exam_id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subject_id) {
        this.subjectId = subject_id;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int total_question) {
        this.totalQuestion = total_question;
    }
}
