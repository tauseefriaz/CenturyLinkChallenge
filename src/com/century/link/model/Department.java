/**
 * 
 */
package com.century.link.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

/**
 * @author Tauseef Riaz
 *
 */
public class Department {
	private List<Employee> listEmps = new ArrayList<>();
	private String departmentName;
	private String departmentLocation;
	
	/**
	 * @param listEmps
	 * @param departmentName
	 * @param departmentLocation
	 */
	public Department(String departmentName, String departmentLocation) {
		super();
//		this.listEmps = listEmps;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
	
	/**
	 * 
	 * @param emp
	 * @param departmentName
	 * @param departmentLocation
	 */
	public Department(Employee emp, String departmentName, String departmentLocation) {
		super();
		this.listEmps = new ArrayList<>(Arrays.asList(emp));
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
	
	/**
	 * @return the listEmps
	 */
	public List<Employee> getListEmps() {
		return new ArrayList<>(listEmps);
	}
	
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the departmentLocation
	 */
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	
	/**
	 * @param departmentLocation the departmentLocation to set
	 */
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	/**
	 * Adds a new employee to the list of sub-ordinates of the current employee
	 * 
	 * @param emp
	 */
	public void addEmployee(Employee emp)
	{
		//Check if employee is null
		Assert.assertNotNull(emp);
		
		//Check if employee already exists in the list
		Assert.assertFalse(listEmps.contains(emp));
				
		
		//Add employee to the list of employees of the department
		listEmps.add(emp);
	}
}
