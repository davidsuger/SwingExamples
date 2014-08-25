package swing14.ComboBoxes;

import java.util.EventObject;

public class FormEvent extends EventObject {
	private String name;
	private String occupation;
	private int ageCategory;
	private String empCat;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation, int ageCategory, String empCat) {
		super(source);
		this.name = name;
		this.occupation = occupation;
		this.setAgeCategory(ageCategory);
		this.setEmpCat(empCat);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occuption) {
		this.occupation = occuption;
	}

	public int getAgeCategory() {
		return ageCategory;
	}

	public void setAgeCategory(int ageCategory) {
		this.ageCategory = ageCategory;
	}

	public String getEmploymentCategory() {
		return empCat;
	}

	public void setEmpCat(String empCat) {
		this.empCat = empCat;
	}
}
