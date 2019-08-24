package relationship.filter;

import basic.SubjectEntity;
import dao.OfferedDao;

import java.util.List;
import java.util.stream.Collectors;

public class OfferedFilter {
    private OfferedDao offeredDao;

    public OfferedFilter() {
        offeredDao = new OfferedDao();
    }

    public List fromCourse(Long course) {
        List<SubjectEntity> list = offeredDao.all();

        return list.stream().filter(o -> course.equals(o.getCourse()))
                .collect(Collectors.toList());
    }

    public List fromCourseToStudent(Long course, Long Student) {
        List offerFromCourse = fromCourse(course);

//        List offerToStudent = offerFromCourse.
        return null;
    }
}
