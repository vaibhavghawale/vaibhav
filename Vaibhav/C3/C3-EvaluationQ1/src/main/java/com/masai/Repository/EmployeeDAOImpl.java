package com.masai.Repository;


import com.masai.Model.Employee;
import com.masai.utlity.EMUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    EntityManager em= EMUtil.provideEM();
    @Override
    public boolean insertEmployeeDetails(Employee emp) {
      em.getTransaction().begin();
      em.persist(emp);
      em.getTransaction().commit();

     return true;
    }

    @Override
    public List getAllEmployeeDetails() {

        String jpql = "from Employee";

        Query q = em.createQuery(jpql);


        List<Employee>  allemps= q.getResultList();


            return allemps;
    }

    @Override
    public Employee findEmployee(int empId) {
     Employee employee=  em.find(Employee.class,empId);

     return employee;
    }

    @Override
    public String deleteEmployeeDetailsById(int empId) {

        Employee employee=  em.find(Employee.class,empId);
        if(employee!=null){
            em.remove(employee);
            em.close();
           return "Employee Removed";

        }else return null;

    }

}
