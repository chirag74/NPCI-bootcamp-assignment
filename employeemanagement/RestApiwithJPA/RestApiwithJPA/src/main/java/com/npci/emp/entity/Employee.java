package com.npci.emp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
	
	@Id		// primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
	@Column(name="empno")
	private Integer empno;
	
	@Column(name = "ENAME")
	private String ename;
	
	@Column(name="JOB")
	private String job;
	
	@Column(name="HIREDATE")
	private Date hiredate;
	
	@Column(name="MANAGERID")
	private Integer managerId;
	
	@Column(name="SALARY")
	private Integer salary;
	
	@Column(name="commission")
	private Integer commission;
	
	@Column(name="DEPTNO")
	private Integer deptNo;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String ename, String job, Date hiredate, Integer managerId, Integer salary, Integer commission,
			Integer deptNo) {
		
		
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public Employee(Integer empno,String ename, String job, Date hiredate, Integer managerId, Integer salary, Integer commission,
			Integer deptNo) {
		
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}


	public Integer getEmpno() {
		return empno;
	}


	public void setEmpno(Integer empno) {
		this.empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Date getHiredate() {
		return hiredate;
	}


	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}


	public Integer getManagerId() {
		return managerId;
	}


	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public Integer getCommission() {
		return commission;
	}


	public void setCommission(Integer commission) {
		this.commission = commission;
	}


	public Integer getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}


	/*@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate
				+ ", managerId=" + managerId + ", salary=" + salary + ", commission=" + commission + ", deptNo="
				+ deptNo + "]";
	}
	*/
	
	
}
