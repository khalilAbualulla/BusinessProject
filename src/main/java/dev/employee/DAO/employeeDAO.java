package dev.employee.DAO;
import  dev.employee.entites.employee;
import java.util.List;
public interface employeeDAO {
    employee  creatEmployee(employee employee);
    employee getEmployeeById(int id);
    List<employee> getAllEmployees();
    employee update(employee employee);
    boolean deletEmployeeByID(int id);

}
