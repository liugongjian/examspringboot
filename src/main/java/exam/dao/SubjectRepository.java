package exam.dao;


import exam.model.ExamInfo;
import exam.model.SubjectInfo;
import exam.model.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SubjectRepository extends CrudRepository<SubjectInfo,Long> {

    public SubjectInfo findBySubjectId(int subject_id);

    @Query(value = "select * from subject_info",nativeQuery = true)
    public List<SubjectInfo> getSubjects();

}
