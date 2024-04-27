package com.wubai.mapper;

import com.wubai.entity.Teacher;

public interface TeacherMapper {
    int insertTeacher(Teacher teacher);
    Teacher queryById(String tId);
}
