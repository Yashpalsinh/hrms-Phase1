package com.hrms;


import com.liferay.portal.kernel.util.OrderByComparator;
import com.hrms.model.EmployeeDepartment;

//Comparator class to sort the data for search container by default order is desc
public class EmployeeDepartmentComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "AboutMe_ ASC";

	public static final String ORDER_BY_DESC = "AboutMe_ DESC";

	String[] ORDER_BY_FIELDS={"departmentName"};
	
	public static String col="departmentName";

	public EmployeeDepartmentComparator() {
		this(false, "departmentName");
	}
//constructor which is called from view.jsp to sort with parameter true=asc and false=desc
	public EmployeeDepartmentComparator(boolean ascending, String colName) {
		_ascending = ascending;
		col=colName;
		ORDER_BY_FIELDS[0]=col;
		
	}
//method to compare 2 objects
	@Override
	public int compare(Object obj1, Object obj2) {
		EmployeeDepartment employeeDepartment1 = (EmployeeDepartment)obj1;
		EmployeeDepartment employeeDepartment2 = (EmployeeDepartment)obj2;
		
		int value;
		if(col.equals("status")){
			Boolean field1;
			Boolean field2;
			field1=employeeDepartment1.getStatus();
			field2=employeeDepartment2.getStatus();
			value=field1.compareTo(field2);
		}
		
		else{
			String field1;
			String field2;
			field1=employeeDepartment1.getDepartmentName();
			field2=employeeDepartment2.getDepartmentName();
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