package main.model;

public class Student {

	private String name;
	private String year;
	private String dorm;
	private String room;
	private String gpa;

	public Student(String name, String year, String dorm, String room, String gpa) {

		this.name = name;
		this.year = year;
		this.dorm = dorm;
		this.room = room;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + ", dorm=" + dorm + ", room=" + room + ", gpa=" + gpa + "]";
	}

}
