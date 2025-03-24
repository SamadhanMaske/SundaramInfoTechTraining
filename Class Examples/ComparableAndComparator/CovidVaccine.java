package ComparableAndComparator;

import java.util.ArrayList;

class Vaccine{
	private int age;
	private float dosage;
	public Vaccine() {}
	public Vaccine(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	
}

class VaccinationCamp{
	ArrayList<Vaccine> list = new ArrayList<>();
	
	public ArrayList<Vaccine> getList() {
		return list;
	}
	
	public void setList(ArrayList<Vaccine> list) {
		this.list = list;
	}
	Vaccine v = new Vaccine();
	public void assignVaccine() {
		for (Vaccine vaccine : list) {
            int age = vaccine.getAge();
            if (age >= 45) {
                vaccine.setDosage(250f);
            } else if (age >= 20) {
                vaccine.setDosage(200f);
            } else {
                vaccine.setDosage(100f);
            }
        }
	}
	
	public float vaccineInjected() {
		float totalDosage = 0.0f;
        for (Vaccine vaccine : list) {
            totalDosage += vaccine.getDosage();
        }
        return totalDosage;
	}
}

public class CovidVaccine {

	public static void main(String[] args) {
		VaccinationCamp vc = new VaccinationCamp();
		ArrayList<Vaccine> list = vc.getList();
		list.add(new Vaccine(49));
		list.add(new Vaccine(26));
		list.add(new Vaccine(19));
		vc.assignVaccine();
		float totalDosage = vc.vaccineInjected();
		System.out.println(totalDosage);
	}

}
