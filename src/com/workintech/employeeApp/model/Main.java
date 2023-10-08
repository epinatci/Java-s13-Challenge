package com.workintech.employeeApp.model;

import com.workintech.employeeApp.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan plan1 = new Healthplan(1,"A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2,"B Sigorta", Plan.BASIC);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] healthPlans = new String[3];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

        Employee employee = new Employee(1, "Ali Veli", "ali@veli.com", "1234", healthPlans);

        employee.addHealthPlan(0,"C Sigorta");
        employee.addHealthPlan(2,"A Sigorta");

        Employee developer = new Employee(2, "Mehmet Ali", "mehmet@test.com", "1234", healthPlans);

        String[] developerNames = new String[5];
        developerNames[0]= developer.getFullName();

        System.out.println("---------------------");

        Company company = new Company(1,"workintech", 100000000, developerNames);
        company.addEmployee(0,"Anıl Ensari" );
        company.addEmployee(5,"Anıl Ensari" );
        company.addEmployee(1,"Anıl Ensari" );
        System.out.println(company);
    }

}
