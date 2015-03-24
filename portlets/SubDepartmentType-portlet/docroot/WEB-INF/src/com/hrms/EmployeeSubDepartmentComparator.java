package com.hrms;


import com.hrms.model.EmployeeSubDepartment;
import com.liferay.portal.kernel.util.OrderByComparator;

//Comparator class to sort the data for search container by default order is desc
public class EmployeeSubDepartmentComparator extends OrderByComparator {

	public static final String ORDER_BY_ASC = "AboutMe_ ASC";

	public static final String ORDER_BY_DESC = "AboutMe_ DESC";

	String[] ORDER_BY_FIELDS={"subDepartmentName"};
	
	public static String col="subDepartmentName";

	public EmployeeSubDepartmentComparator() {
		this(false, "subDepartmentName");
	}
//constructor which is called from view.jsp to sort with parameter true=asc and false=desc
	public EmployeeSubDepartmentComparator(boolean ascending, String colName) {
		_ascending = ascending;
		col=colName;
		ORDER_BY_FIELDS[0]=col;
		
	}
//method to compare 2 objects
	@Override
	public int compare(Object obj1, Object obj2) {
		EmployeeSubDepartment employeeSubDepartment1 = (EmployeeSubDepartment)obj1;
		EmployeeSubDepartment employeeSubDepartment2 = (EmployeeSubDepartment)obj2;
		
		int value;
		if(col.equals("status")){
			Boolean field1;
			Boolean field2;
			field1=employeeSubDepartment1.getStatus();
			field2=employeeSubDepartment2.getStatus();
			value=field1.compareTo(field2);
		}
		
		else{
			String field1;
			String field2;
			field1=employeeSubDepartment1.getSubDepartmentName();
			field2=employeeSubDepartment2.getSubDepartmentName();
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