package exam.model;

import java.util.List;

public class SubjectAndExam {
    private SubjectInfo subjectInfo;
    private List<ExamInfo> examInfos;

    public SubjectAndExam(SubjectInfo subjectInfo, List<ExamInfo> examInfos) {
        this.subjectInfo = subjectInfo;
        this.examInfos = examInfos;
    }

    public SubjectInfo getSubjectInfo() {
        return subjectInfo;
    }

    public void setSubjectInfo(SubjectInfo subjectInfo) {
        this.subjectInfo = subjectInfo;
    }

    public List<ExamInfo> getExamInfos() {
        return examInfos;
    }

    public void setExamInfos(List<ExamInfo> examInfos) {
        this.examInfos = examInfos;
    }
}
