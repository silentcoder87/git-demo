package com.sarath;


public class Employee {

    private int emp_id;
    private String emp_name;
    private String emp_desig;

    public Employee(){

    }
    public Employee(int emp_id, String emp_name, String emp_desig) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_desig = emp_desig;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_desig() {
        return emp_desig;
    }

    public void setEmp_desig(String emp_desig) {
        this.emp_desig = emp_desig;
    }
}
