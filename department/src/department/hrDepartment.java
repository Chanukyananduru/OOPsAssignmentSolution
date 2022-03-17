package department;

public class hrDepartment extends superDepartment {

	String departmentName() {
		return "HR Department";
	}
	
	String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String doActivity() {
		return "Team lunch";
	}

}
