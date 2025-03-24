package com.hStrings;

class Student {
    private String name;
    private String usn;
    private String college;
    private int cgpa;

    public Student(String name, String usn, String college, int cgpa) {
        this.name = name;
        this.usn = usn;
        this.college = college;
        this.cgpa = cgpa;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
    
}

class StudentImplementation {

	public Student getStudentInfo(String str) {
        String[] parts = str.split("[@#-]");
        String name = parts[0];
        String usn = parts[1];
        String college = parts[2];
        int cgpa = Integer.parseInt(parts[3]);

        return new Student(name, usn, college, cgpa);
    }

    public String getStudentSection(Student s) {
        String usnLastThreeDigits = s.getUsn().substring(s.getUsn().length() - 3);
        int lastThreeDigits = Integer.parseInt(usnLastThreeDigits);

        if (lastThreeDigits >= 1 && lastThreeDigits <= 60) {
            return "A";
        } else if (lastThreeDigits >= 61 && lastThreeDigits <= 120) {
            return "B";
        } else if (lastThreeDigits >= 121 && lastThreeDigits <= 180) {
            return "C";
        } else {
            return "Z";
        }
    }
}

public class StudentSpecification {
	public static void main(String[] args) {
		StudentImplementation impl = new StudentImplementation();

        String inputStr = "Amit Rai@1PC16CS046-ALU#8";

        Student student = impl.getStudentInfo(inputStr);

        System.out.println("Name: " + student.getName());
        System.out.println("USN: " + student.getUsn());
        System.out.println("College: " + student.getCollege());
        System.out.println("CGPA: " + student.getCgpa());

        String section = impl.getStudentSection(student);
        System.out.println("\nSection: " + section);
	}

}
