package dao;

import basic.CourseEntity;

public class CourseDao extends GenericDao<CourseEntity, Long> {

    public CourseDao() {
        super(CourseEntity.class);
    }
}
