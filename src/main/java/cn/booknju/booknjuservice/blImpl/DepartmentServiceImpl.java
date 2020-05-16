package cn.booknju.booknjuservice.blImpl;

import cn.booknju.booknjuservice.bl.DepartmentService;
import cn.booknju.booknjuservice.mapper.DepartmentMapper;
import cn.booknju.booknjuservice.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getAllDpt();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDptById(id);
    }
}
