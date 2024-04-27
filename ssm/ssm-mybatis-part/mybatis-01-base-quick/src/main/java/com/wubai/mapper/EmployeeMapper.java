package com.wubai.mapper;

import com.wubai.Employee;

public interface EmployeeMapper {

    Employee queryById (Integer id);
    int deleteById (Integer id);


}
