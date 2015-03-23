create table HRMS_Candidate (
	candidateId LONG not null primary key,
	employeeDepartmentId LONG,
	employeeDesignationId LONG,
	title VARCHAR(75) null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	dateOfBirth DATE null,
	nationality VARCHAR(75) null,
	maritalStatus INTEGER,
	street1 VARCHAR(75) null,
	street2 VARCHAR(75) null,
	street3 VARCHAR(75) null,
	city VARCHAR(75) null,
	zip LONG,
	countryId LONG,
	personalEmail VARCHAR(75) null,
	currentCtc LONG,
	expectedCtc LONG,
	noticePeriod VARCHAR(75) null,
	resumeId LONG,
	resumePath VARCHAR(75) null,
	employeeProofId LONG,
	proofNumber VARCHAR(75) null,
	gender INTEGER,
	status BOOLEAN,
	shortListed BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_CandidateQualification (
	candidateQualificationId LONG not null primary key,
	candidateId LONG,
	degreeName VARCHAR(75) null,
	mainSubject VARCHAR(75) null,
	university VARCHAR(75) null,
	score VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeAchivement (
	employeeAchivementId LONG not null primary key,
	achivedBy LONG,
	groupId LONG,
	companyId LONG,
	achivementDate DATE null,
	achivementTitle VARCHAR(75) null,
	achivementDiscription VARCHAR(75) null,
	status BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeAttendance (
	attendanceId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	attendanceDate DATE null,
	signinTime DATE null,
	signoutTime DATE null,
	totalTime DATE null,
	approved BOOLEAN,
	approvedBy LONG,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeComplaint (
	employeeComplaintId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	complaintTitle VARCHAR(75) null,
	complaintDiscription VARCHAR(75) null,
	complaintFrom LONG,
	complaintDate DATE null,
	status BOOLEAN,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeDepartment (
	employeeDepartmentId LONG not null primary key,
	departmentName VARCHAR(75) null,
	status BOOLEAN
);

create table HRMS_EmployeeDesignation (
	employeeDesignationId LONG not null primary key,
	designationName VARCHAR(75) null,
	status BOOLEAN
);

create table HRMS_EmployeeLanguageDetail (
	employeeLanguageDetailId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	languageName VARCHAR(75) null,
	read_ BOOLEAN,
	write_ BOOLEAN,
	speak BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeLeave (
	employeeLeaveId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	year INTEGER,
	leavesCarriedOver INTEGER,
	leavesTakenThisYear INTEGER,
	remainingLeaves INTEGER,
	leaveId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeMaster (
	employeeMasterId LONG not null primary key,
	employeeId VARCHAR(75) null,
	userId LONG,
	gender INTEGER,
	dateOfBirth DATE null,
	joiningDate DATE null,
	leavingDate DATE null,
	maritalStatus INTEGER,
	nationality VARCHAR(75) null,
	employeeDesignationId INTEGER,
	employeeDepartmentId INTEGER,
	employeeSubDepartmentId INTEGER,
	employeeTypeId INTEGER,
	recruitedOnBasisOf VARCHAR(75) null,
	recruitedBy LONG,
	createBy INTEGER,
	modifiedBy INTEGER
);

create table HRMS_EmployeeMst (
	employeeMstId LONG not null primary key,
	employeeId VARCHAR(75) null,
	userId LONG,
	gender INTEGER,
	dateOfBirth DATE null,
	joiningDate DATE null,
	leavingDate DATE null,
	maritualStatus INTEGER,
	nationality VARCHAR(75) null,
	employeeDesignationId INTEGER,
	employeeDepartmentId INTEGER,
	employeeTypeId INTEGER,
	employeeProofId INTEGER,
	proofNumber VARCHAR(75) null,
	createBy INTEGER,
	modifiedBy INTEGER
);

create table HRMS_EmployeePreviousCompany (
	employeePreviousCompanyId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	companyName VARCHAR(75) null,
	jobTitle VARCHAR(75) null,
	jobDiscription VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeProof (
	employeeproofNo LONG not null primary key,
	proofId LONG,
	userId LONG,
	expirationDate DATE null
);

create table HRMS_EmployeeQualification (
	employeeQualificationId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	degreeName VARCHAR(75) null,
	specialization VARCHAR(75) null,
	university VARCHAR(75) null,
	score VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeSubDepartment (
	employeeSubDepartmentId LONG not null primary key,
	subDepartmentName VARCHAR(75) null,
	employeeDepartmentId LONG,
	status BOOLEAN
);

create table HRMS_EmployeeTimesheet (
	timesheetId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	taskTitle VARCHAR(75) null,
	taskDescription VARCHAR(75) null,
	taskFileId LONG,
	taskFilePath VARCHAR(75) null,
	taskStarttime DATE null,
	taskEndtime DATE null,
	taskDate DATE null,
	duration DATE null,
	taskCompleted BOOLEAN,
	billable BOOLEAN,
	billed BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_EmployeeType (
	employeeTypeId LONG not null primary key,
	employeeTypeName VARCHAR(75) null,
	status BOOLEAN
);

create table HRMS_EmployeeWarning (
	employeeWarningId LONG not null primary key,
	warningTo LONG,
	groupId LONG,
	companyId LONG,
	warningDate DATE null,
	warningSubject VARCHAR(75) null,
	status BOOLEAN,
	warningBy LONG,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_Interview (
	InterviewId LONG not null primary key,
	candidateId LONG,
	jobLibraryId LONG,
	roundNumber LONG,
	roundType VARCHAR(75) null,
	InterviewerId LONG,
	interviewDate DATE null,
	result BOOLEAN,
	remarks VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_JobLibrary (
	jobLibraryId LONG not null primary key,
	employeeDepartmentId LONG,
	jobTitle VARCHAR(75) null,
	jobDescription VARCHAR(75) null,
	responsibility VARCHAR(75) null,
	qualifications VARCHAR(75) null,
	numberOfPosition INTEGER,
	experience VARCHAR(75) null,
	salaryStartRange LONG,
	salaryEndRange LONG,
	benefits VARCHAR(75) null,
	reportsToId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_Leave (
	leaveId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	leaveName VARCHAR(75) null,
	leaveType VARCHAR(75) null,
	leavesAllowedPerYear INTEGER,
	carryOver BOOLEAN,
	encachement BOOLEAN,
	Status BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_LeavesApplied (
	appliedLeaveId LONG not null primary key,
	userId LONG,
	groupId LONG,
	companyId LONG,
	entitlement VARCHAR(75) null,
	leaveFrom DATE null,
	leaveTo DATE null,
	approvalStatus VARCHAR(75) null,
	leaveId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_Offer (
	OferrId LONG not null primary key,
	candidateId LONG,
	employeeDepartmentId LONG,
	employeeDesignationId LONG,
	employeeTypeId LONG,
	salary LONG,
	joiningDate DATE null,
	createDate DATE null,
	modifiedDate DATE null,
	createBy LONG,
	modifiedBy LONG
);

create table HRMS_Proof (
	proofId LONG not null primary key,
	proofType VARCHAR(75) null,
	status BOOLEAN
);