/**
 * 
 */
package com.century.link.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.century.link.util.Utility;

/**
 * @author Tauseef Riaz
 *
 */
public class Employee {
	private List<Employee> listEmployees  = new ArrayList<>();
	private String employeeName;
	private String employeeId;
	private Allocation warrant;
	private EmployeeType employeeType;

	/**
	 * @param listEmployees
	 * @param employeeName
	 * @param employeeId
	 * @param warrant
	 * @param type
	 */
	public Employee(String employeeName, String employeeId,
			EmployeeType employeeType, double warrantValue) {
		super();
		// Get the maximum allocation value based on the allocation
		long allocationValue = Utility.getMaximumAllocationValue(employeeType);
		
		Assert.assertTrue("Allocation value exceeds limit", warrantValue <= allocationValue);
		
		// Set warrant verifying possible warrant value
		this.warrant = new Allocation(warrantValue);
		
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeType = employeeType;
	}
	
	public void addEmployee(Employee emp)
	{
		//Check if employee is null or not
		Assert.assertNotNull("Null employee not allowed to be added", emp!=null);

		//Check if employee already exists in the list
		Assert.assertFalse("Existing employee not allowed to be added to the list", listEmployees.contains(emp));
		
		//Check if employee is a manager before adding it to the list
		Assert.assertTrue("Non managers are not allowed to have sub-ordinates", employeeType.equals(EmployeeType.MANAGER));
				
		
		//Add employee to the list of sub-ordinates
		listEmployees.add(emp);
	}

	/**
	 * @return the allocation
	 */
	public EmployeeType getAllocation() {
		return employeeType;
	}

	/**
	 * @param allocation
	 *            the allocation to set
	 */
	public void setAllocation(EmployeeType allocation) {
		this.employeeType = allocation;
	}

	/**
	 * @return the listEmployees
	 */
	public List<Employee> getListEmployees() {
		return new ArrayList<>(listEmployees);
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the warrant
	 */
	public Allocation getWarrant() {
		return warrant;
	}

	/**
	 * @param warrant
	 *            the warrant to set
	 */
	public void setWarrant(Allocation warrant) {
		this.warrant = warrant;
	}
}
