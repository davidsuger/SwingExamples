package swing14.WorkingWithListData;

import java.util.EventObject;

public class FormEvent extends EventObject {
	private String name;
	private String occupation;
	private int ageCategory;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation,
			int ageCategory) {
		super(source);
		this.name = name;
		this.occupation = occupation;
		this.setAgeCategory(ageCategory);
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
}
