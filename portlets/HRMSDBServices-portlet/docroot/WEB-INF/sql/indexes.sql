create index IX_A35CE23A on HRMS_EmployeeAchivement (createBy);
create index IX_DBB01447 on HRMS_EmployeeAchivement (modifiedBy);

create index IX_90E410B3 on HRMS_EmployeeAttendance (createBy);
create index IX_84258880 on HRMS_EmployeeAttendance (modifiedBy);

create index IX_1E7B231B on HRMS_EmployeeComplaint (createBy);
create index IX_841A0E8 on HRMS_EmployeeComplaint (modifiedBy);

create index IX_55879284 on HRMS_EmployeeDepartment (employeeDepartmentId);
create index IX_92A6EF1B on HRMS_EmployeeDepartment (status);

create index IX_75CF59E6 on HRMS_EmployeeDesignation (status);

create index IX_D7941D13 on HRMS_EmployeeLanguageDetail (createBy);
create index IX_DF03FCE0 on HRMS_EmployeeLanguageDetail (modifiedBy);

create index IX_9E52A12C on HRMS_EmployeeMaster (createBy);
create index IX_F031DEB9 on HRMS_EmployeeMaster (modifiedBy);
create index IX_C3F4B1FF on HRMS_EmployeeMaster (userId);

create index IX_5779D11 on HRMS_EmployeeMst (userId);

create index IX_B45E0D36 on HRMS_EmployeePreviousCompany (createBy);
create index IX_B1127043 on HRMS_EmployeePreviousCompany (modifiedBy);

create index IX_5DC644DF on HRMS_EmployeeQualification (createBy);
create index IX_A14B61AC on HRMS_EmployeeQualification (modifiedBy);

create index IX_52E3060A on HRMS_EmployeeSubDepartment (employeeDepartmentId);
create index IX_AD679AF0 on HRMS_EmployeeSubDepartment (employeeDepartmentId, status);
create index IX_10A46521 on HRMS_EmployeeSubDepartment (status);

create index IX_1BFC16A2 on HRMS_EmployeeTimesheet (createBy);
create index IX_A953CEAF on HRMS_EmployeeTimesheet (modifiedBy);
create index IX_45490CF5 on HRMS_EmployeeTimesheet (userId);

create index IX_17A7994C on HRMS_EmployeeWarning (createBy);
create index IX_68294ED9 on HRMS_EmployeeWarning (modifiedBy);