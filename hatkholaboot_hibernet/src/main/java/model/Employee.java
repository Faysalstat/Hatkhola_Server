package model;
// Generated Feb 17, 2019 12:11:32 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="emp"
    ,catalog="hatkhola"
)
public class Employee  implements java.io.Serializable {


     private Long id;
     private String employeeId;
     private String employeeName;
     private String address;
     private double salary;

    public Employee() {
    }

	
    public Employee(String employeeId, String employeeName, String address, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.salary = salary;
    }
  
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }


    
 

    
    @Column(name="employeeId", nullable=false)
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    
    @Column(name="name", nullable=false)
    public String getEmployeeName() {
        return this.employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    @Column(name="address", nullable=false)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="salary", nullable=false, precision=22, scale=0)
    public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }


 




}


