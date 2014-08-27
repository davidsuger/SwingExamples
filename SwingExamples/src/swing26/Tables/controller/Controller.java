package swing26.Tables.controller;

import swing26.Tables.gui.FormEvent;
import swing26.Tables.model.AgeCategory;
import swing26.Tables.model.Database;
import swing26.Tables.model.EmploymentCategory;
import swing26.Tables.model.Gender;
import swing26.Tables.model.Person;



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
