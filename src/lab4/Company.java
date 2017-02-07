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
public class Company {

    private HumanResourcesDepartment hrd;

    public Company() {
        hrd = new HumanResourcesDepartment();
    }

    public void joinEmployee(String firstName, String lastName, String ssn) {
        hrd.joinEmployee(firstName, lastName, ssn);
        hrd.outputReport(ssn);

    }

    public HumanResourcesDepartment getHrd() {
        return hrd;
    }

    public void setHrd(HumanResourcesDepartment hrd) {
        this.hrd = hrd;
    }

}
