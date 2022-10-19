package io.gosaas.cloud;

public class AffectedObjects {
	String changeNotice;
	String changeName;
	String changeDescription;
	String affectedItemNumber;

	public AffectedObjects(String changeNotice, String changeName, String changeDescription,
			String affectedItemNumber) {
		super();
		this.changeNotice = changeNotice;
		this.changeName = changeName;
		this.changeDescription = changeDescription;
		this.affectedItemNumber = affectedItemNumber;
	}

	public AffectedObjects() {
	}

	public String getChangeNotice() {
		return changeNotice;
	}

	public void setChangeNotice(String changeNotice) {
		this.changeNotice = changeNotice;
	}

	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public String getChangeDescription() {
		return changeDescription;
	}

	public void setChangeDescription(String changeDescription) {
		this.changeDescription = changeDescription;
	}

	public String getAffectedItemNumber() {
		return affectedItemNumber;
	}

	public void setAffectedItemNumber(String affectedItemNumber) {
		this.affectedItemNumber = affectedItemNumber;
	}
}
