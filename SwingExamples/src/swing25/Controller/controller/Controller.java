package swing25.Controller.controller;

import swing25.Controller.gui.FormEvent;
import swing25.Controller.model.AgeCategory;
import swing25.Controller.model.Database;
import swing25.Controller.model.EmploymentCategory;
import swing25.Controller.model.Gender;
import swing25.Controller.model.Person;

public class Controller {
	Database db = new Database();

	public void addPerson(FormEvent e) {
		String name = e.getName();
		String occupation = e.getOccupation();
		int ageCat = e.getAgeCategory();
		String empCat = e.getEmploymentCategory();
		boolean usCitizen = e.isUsCitizen();
		String taxId = e.getTaxId();
		String gender = e.getGender();

		AgeCategory ageCategory = null;
		switch (ageCat) {
		case 0:
			ageCategory = AgeCategory.child;
			break;
		case 1:
			ageCategory = AgeCategory.adult;
			break;
		case 2:
			ageCategory = AgeCategory.senior;
			break;
		}

		EmploymentCategory empCategory;
		if (empCat.equals("employed")) {
			empCategory = EmploymentCategory.employed;
		} else if (empCat.equals("self-employed")) {
			empCategory = EmploymentCategory.selfEmployed;
		} else if (empCat.equals("unemployed")) {
			empCategory = EmploymentCategory.unemployed;
		} else {
			empCategory = EmploymentCategory.other;
			System.err.println(empCat);
		}

		Gender genderCat;
		if (gender.equals("male")) {
			genderCat = Gender.male;
		} else {
			genderCat = Gender.female;
		}

		Person person = new Person(name, occupation, ageCategory, empCategory, usCitizen, taxId, genderCat);
		db.addPerson(person);
	}
}
