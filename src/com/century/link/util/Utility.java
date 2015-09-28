/**
 * 
 */
package com.century.link.util;

import com.century.link.model.EmployeeType;

/**
 * Utility class holding maximum allocation value of a warrant.
 * 
 * @author Tauseef Riaz
 *
 */
public interface Utility {
	public static final long DEVELOPER_ALLOCATION_VALUE = 1000l;
	public static final long TESTER_ALLOCATION_VALUE = 500l;
	public static final long MANAGER_ALLOCATION_VALUE = 300l;

	/**
	 * Utility method for getting value based on the ALLOCATION warrant
	 * {@link EmployeeType} passed to it
	 * 
	 * @param allocation
	 * @return
	 */
	public static long getMaximumAllocationValue(EmployeeType allocation) {
		long allocationValue = 0;
		switch (allocation) {
		case DEVELOPER:
			allocationValue = DEVELOPER_ALLOCATION_VALUE;
			break;
		case TESTER:
			allocationValue = TESTER_ALLOCATION_VALUE;
			break;
		case MANAGER:
			allocationValue = MANAGER_ALLOCATION_VALUE;
			break;

		default:
			throw new IllegalArgumentException("No possible upper bound of warrant available for employee.");
		}

		return allocationValue;
	}

	
}
