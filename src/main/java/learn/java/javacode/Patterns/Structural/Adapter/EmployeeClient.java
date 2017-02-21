package learn.java.javacode.Patterns.Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dvorop on 21.02.2017.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        // get employee from DB
        Employee employeeFromDB = new EmployeeDB("1234","John","Wick", "john@wick.com");
        employees.add(employeeFromDB);

        //  get emploeey from LDAP
        //  we should implement adapter to this part
        EmployeeLdap employeeFromLdap =
                new EmployeeLdap("chewie","Solo","Han","han@solo.com");

        //  adapter
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        return employees;
    }
}