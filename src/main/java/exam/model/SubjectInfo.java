package exam.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="subject_info")
public class SubjectInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "subject_price")
    private float subjectPrice;

    @Column(name = "subject_desc")
    private String subjectDesc;

    @Column(name = "subject_rating")
    private String subjectRating;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subject_id) {
        this.subjectId = subject_id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subject_name) {
        this.subjectName = subject_name;
    }

    public float getSubjectPrice() {
        return subjectPrice;
    }

    public void setSubjectPrice(float subjectPrice) {
        this.subjectPrice = subjectPrice;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public String getSubjectRating() {
        return subjectRating;
    }

    public void setSubjectRating(String subjectRating) {
        this.subjectRating = subjectRating;
    }

    @Override
    public String toString() {
        return "SubjectInfo{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", subjectPrice=" + subjectPrice +
                ", subjectDesc='" + subjectDesc + '\'' +
                ", subjectRating='" + subjectRating + '\'' +
                '}';
    }
}
