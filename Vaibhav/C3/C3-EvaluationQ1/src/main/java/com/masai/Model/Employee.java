package com.masai.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer empId;
   private String empName;
   private String empAddress;
   private  Integer salary;

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public String getEmpAddress() {
      return empAddress;
   }

   public void setEmpAddress(String empAddress) {
      this.empAddress = empAddress;
   }

   public Integer getSalary() {
      return salary;
   }

   public void setSalary(Integer salary) {
      this.salary = salary;
   }

   public Integer getEmpId() {
      return empId;
   }

   public void setEmpId(Integer empId) {
      this.empId = empId;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "empId=" + empId +
              ", empName='" + empName + '\'' +
              ", empAddress='" + empAddress + '\'' +
              ", salary=" + salary +
              '}';
   }
}
