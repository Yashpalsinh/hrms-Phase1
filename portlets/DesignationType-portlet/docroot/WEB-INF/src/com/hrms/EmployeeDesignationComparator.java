package com.hrms;


import com.liferay.portal.kernel.util.OrderByComparator;
import com.hrms.model.EmployeeDesignation;

//Comparator class to sort the data for search container by default order is desc
public class EmployeeDesignationComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "AboutMe_ ASC";

	public static final String ORDER_BY_DESC = "AboutMe_ DESC";

	String[] ORDER_BY_FIELDS={"designationName"};
	
	public static String col="designationName";

	public EmployeeDesignationComparator() {
		this(false, "designationName");
	}
//constructor which is called from view.jsp to sort with parameter true=asc and false=desc
	public EmployeeDesignationComparator(boolean ascending, String colName) {
		_ascending = ascending;
		col=colName;
		ORDER_BY_FIELDS[0]=col;
		
	}
//method to compare 2 objects
	@Override
	public int compare(Object obj1, Object obj2) {
		EmployeeDesignation employeeDesignation1 = (EmployeeDesignation)obj1;
		EmployeeDesignation employeeDesignation2 = (EmployeeDesignation)obj2;
		
		int value;
		if(col.equals("status")){
			Boolean field1;
			Boolean field2;
			field1=employeeDesignation1.getStatus();
			field2=employeeDesignation2.getStatus();
			value=field1.compareTo(field2);
		}
		
		else{
			String field1;
			String field2;
			field1=employeeDesignation1.getDesignationName();
			field2=employeeDesignation2.getDesignationName();
			value=field1.compareTo(field2);
		}

		 

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}
//setting sorting order
	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}
//getting orderd fields
	
	@Override
	public String[] getOrderByFields() {		
		return ORDER_BY_FIELDS;
	}
//checking the sorting order
	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}