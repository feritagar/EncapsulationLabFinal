/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author FA
 */
public class HumanResources {
    private Employee employee;
    
    public void joinEmployee(String firstName, String lastName, String ssn){
        Employee emp = new Employee(firstName,lastName,ssn);
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setSsn(ssn);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
