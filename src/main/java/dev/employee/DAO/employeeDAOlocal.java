package dev.employee.DAO;
import  dev.employee.entites.employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class employeeDAOlocal  implements employeeDAO {

    private Map<Integer,employee>employeeTable=new HashMap<>();
    private int idMaker;
    @Override
    public employee creatEmployee(employee employee) {
        employee.setEmployeeId(idMaker);
        idMaker++;
        employeeTable.put(employee.getEmployeeId(),employee);
        System.out.println(employeeTable.values());
        return employee;
    }

    @Override
    public employee getEmployeeById(int id) {
        return employeeTable.get(id);
    }

    @Override
    public List<employee> getAllEmployees() {
        return (List<employee>) employeeTable.values();
    }

    @Override
    public employee update(employee employee) {
        return null;
    }

    @Override
    public boolean deletEmployeeByID(int id) {
        return false;
    }
}
