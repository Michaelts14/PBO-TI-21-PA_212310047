class Students {
	int npm,semester;
	String fullName,className;
	Double gpa;
	
	int getNPM(int paramNPM) {
		npm = paramNPM;
		return npm;
	}
	
	String getFullName(String paramFullName) {
		fullName = paramFullName;
		return fullName;
	}
	
	String getClassName(String paramClassName) {
		className = paramClassName;
		return className;
	}
	
	int getSemester(int paramSemester) {
		semester = paramSemester;
		return semester;
	}
	
	Double getGPA(Double paramGPA) {
		gpa = paramGPA;
		return gpa;
	}
}