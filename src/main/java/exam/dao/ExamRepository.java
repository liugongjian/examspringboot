package exam.dao;

import exam.model.ExamInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExamRepository extends CrudRepository<ExamInfo, Integer> {

    public List<ExamInfo> findBySubjectId(Integer subject_id);

}
