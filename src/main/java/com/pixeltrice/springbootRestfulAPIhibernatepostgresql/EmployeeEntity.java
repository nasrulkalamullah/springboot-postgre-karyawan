package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer employeeId;
	    
	    @Column(name = "first_name", nullable = false)
	    private String first_name;
	    
	    @Column(name = "last_name", nullable = false)
	    private String last_name;
	    
	    @Column(name = "email_address", nullable = false)
	    private String emailId;
	 
	    public EmployeeEntity() {
	  
	    }
	 
	    public EmployeeEntity(String first_name, String last_name, String emailId) {
	         this.first_name = first_name;
	         this.last_name = last_name;
	         this.emailId = emailId;
	    }
	 
	   
	        public Integer getEmployeeId() {
	        return employeeId;
	    }
	    public void setId(Integer employeeId) {
	        this.employeeId = employeeId;
	    }
	 
	   	    public String getFirst_Name() {
	        return first_name;
	    }
	    public void setFirst_Name(String first_name) {
	        this.first_name = first_name;
	    }
	 
	   
	    public String getLast_Name() {
	        return last_name;
	    }
	    public void setLast_Name(String last_name) {
	        this.last_name = last_name;
	    }
	 
	   
	    public String getEmailId() {
	        return emailId;
	    }
	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

	    @Override
	    public String toString() {
	        return "Employee [employeeId=" + employeeId + ", name=" + first_name + ", emailId=" + emailId
	       + "]";
	    }
	 
	}