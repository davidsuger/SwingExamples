package swing16.CheckBoxes;

import java.util.EventObject;

public class FormEvent extends EventObject {
	private String name;
	private String occupation;
	private int ageCategory;
	private String empCat;
	private boolean usCitizen;
	private String taxId;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation, int ageCategory, String empCat, String taxId,
			boolean usCitizen) {
		super(source);
		this.name = name;
		this.occupation = occupation;
		this.setAgeCategory(ageCategory);
		this.setEmpCat(empCat);
		this.setTaxId(taxId);
		this.setUsCitizen(usCitizen);
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

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
}
