package department;

public class adminDepartment extends superDepartment{

	String departmentName() {
		return "Admin Department";
	}
	
	String getTodaysWork() {
		return "Complete your documents submission";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}

}
