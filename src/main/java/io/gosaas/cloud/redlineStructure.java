package io.gosaas.cloud;

public class redlineStructure {
	String changeNotice;
	String ComponentItemNumber;
	String structureQuantity;

	public redlineStructure() {
	}

	public redlineStructure(String changeNotice, String componentItemNumber, String structureQuantity) {
		super();
		this.changeNotice = changeNotice;
		ComponentItemNumber = componentItemNumber;
		this.structureQuantity = structureQuantity;
	}

	public String getStructureQuantity() {
		return structureQuantity;
	}

	public void setStructureQuantity(String structureQuantity) {
		this.structureQuantity = structureQuantity;
	}

	public String getChangeNotice() {
		return changeNotice;
	}

	public void setChangeNotice(String changeNotice) {
		this.changeNotice = changeNotice;
	}

	public String getComponentItemNumber() {
		return ComponentItemNumber;
	}

	public void setComponentItemNumber(String componentItemNumber) {
		ComponentItemNumber = componentItemNumber;
	}

}
