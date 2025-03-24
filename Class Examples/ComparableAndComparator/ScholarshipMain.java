package ComparableAndComparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private String collegeName;
    private float percentage;
    private float scholarship;

    public Student(String name, String collegeName, float percentage) {
        this.name = name;
        this.collegeName = collegeName;
        this.percentage = percentage;
        this.scholarship = 0; 
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    public String getCollegeName() { 
    	return collegeName; 
    }
    public void setCollegeName(String collegeName) { 
    	this.collegeName = collegeName; 
    }

    public float getPercentage() { 
    	return percentage; 
    }
    public void setPercentage(float percentage) { 
    	this.percentage = percentage; 
    }

    public float getScholarship() { 
    	return scholarship; 
    }
    public void setScholarship(float scholarship) { 
    	this.scholarship = scholarship; 
    }
}

class Portal {
    ArrayList<Student> studentList = new ArrayList();

    public void assignScholarship() {
        for (Student s : studentList) {
            if (s.getPercentage() >= 91) {
                s.setScholarship(10000);
            } else if (s.getPercentage() >= 81) {
                s.setScholarship(5000);
            } else {
                s.setScholarship(0);
            }
        }
    }

    public float totalScholarship() {
        float total = 0;
        for (Student s : studentList) {
            total += s.getScholarship();
        }
        return total;
    }

    public String totalMaxScholarshipOfCollege() {
        Map<String, Float> collegeScholarshipMap = new HashMap<>();
        for (Student s : studentList) {
            collegeScholarshipMap.put(
                s.getCollegeName(),
                collegeScholarshipMap.getOrDefault(s.getCollegeName(), 0.0f) + s.getScholarship()
            );
        }

        String maxCollege = null;
        float maxScholarship = 0;
        for (Map.Entry<String, Float> e : collegeScholarshipMap.entrySet()) {
            if (e.getValue() > maxScholarship) {
                maxScholarship = e.getValue();
                maxCollege = e.getKey();
            }
        }

        return maxCollege;
    }
}

public class ScholarshipMain {
	public static void main(String[] args) {
		Portal obj = new Portal();
        obj.studentList.add(new Student("Steve", "IIT", 89));
        obj.studentList.add(new Student("Bob", "NIT", 94));
        obj.studentList.add(new Student("Alice", "Abcd", 59));

        obj.assignScholarship();
        System.out.println(obj.totalScholarship()); // Output: 15000.0
        System.out.println(obj.totalMaxScholarshipOfCollege()); // Output: NIT
    
	}

}
