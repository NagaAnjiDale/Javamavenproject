package com.example.maven.mavenproject;

public class Employee {

    // COMENT FOR RELEASE PIPELINE

    // check continuous build
        private String empId;
        private String name;
        private String designation;
        private double salary;

        public Employee() {
        }

        // Comment to check CI after enabling in the Pipelines

        // 2 CI test

        // test to check work item try 2


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }
    }
