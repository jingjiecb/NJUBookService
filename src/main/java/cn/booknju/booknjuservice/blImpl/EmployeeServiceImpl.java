package cn.booknju.booknjuservice.blImpl;

import cn.booknju.booknjuservice.bl.EmployeeService;
import cn.booknju.booknjuservice.mapper.DepartmentMapper;
import cn.booknju.booknjuservice.mapper.EmployeeMapper;
import cn.booknju.booknjuservice.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    //自动员工ID分配，初始员工编号1001
    private static Integer iniId=1001;

    @Override
    public void save(Employee employee) {
        while (employeeMapper.getEmpById(iniId)!=null) iniId++;
        if (employee.getId()==null) employee.setId(iniId++);
        employeeMapper.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public List<Employee> getAll() {
//        System.out.println("info===> 业务逻辑层开始处理请求");
        return employeeMapper.getAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @Override
    public void delete(Integer id) {
        employeeMapper.delete(id);
    }
}
