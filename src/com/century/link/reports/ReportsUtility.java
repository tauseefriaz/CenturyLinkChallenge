/**
 * 
 */
package com.century.link.reports;

import org.junit.Assert;

import com.century.link.model.Department;
import com.century.link.model.Employee;
import com.century.link.model.EmployeeType;

/**
 * @author Tauseef Riaz
 *
 */
public class ReportsUtility {
	/**
	 * Gets expenses based on the employee's allocation passed to it
	 * 
	 * @param emp
	 * @return
	 */
	public static double getExpensesByEmployee(Employee emp) {
		double expenses = 0d;
		if (emp.getAllocation().equals(EmployeeType.DEVELOPER))
			return getExpensesByEmployee(emp);

		if (emp.getAllocation().equals(EmployeeType.TESTER))
			return getExpensesByEmployee(emp);

		if (emp.getAllocation().equals(EmployeeType.MANAGER))
			return getExpensesForManager(emp);

		return expenses;
	}

	/**
	 * Gets expenses for a manager
	 * 
	 * @param emp
	 * @return
	 */
	public static double getExpensesForManager(Employee emp) {
		Assert.assertNotNull(emp);
		double expenses = emp.getWarrant().getAmount();

		for (Employee empLocal : emp.getListEmployees()) {
			expenses += empLocal.getWarrant().getAmount();
		}

		return expenses;
	}

	/**
	 * Gets expenses of a department
	 * 
	 * @param emp
	 * @return
	 */
	public static double getExpensesForDepartment(Department dept) {
		double expenses = 0d;

		for (Employee empLocal : dept.getListEmps()) {
			expenses += getExpensesForManager(empLocal);
		}

		return expenses;
	}

}
