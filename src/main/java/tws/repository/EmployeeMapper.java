package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
 
 int insertEmployee(@Param("employee") Employee employee);

 List<Employee> getEmployeeList();
 
 Employee getEmployeeById(@Param("id") int id);
 
 int updateEmployee(@Param("id") int id, @Param("employee") Employee employee);
 
 int deleteEmployee(@Param("id") int id);
}