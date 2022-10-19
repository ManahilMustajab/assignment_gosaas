package io.gosaas.cloud;

public class ChangeOrder {
	String ChangeNotice;
	String ChangeName;
	String ChangeDescription;

	public ChangeOrder() {
	}

	public ChangeOrder(String changeNotice, String changeName, String changeDescription) {
		super();
		ChangeNotice = changeNotice;
		ChangeName = changeName;
		ChangeDescription = changeDescription;
	}

	public String getChangeNotice() {
		return ChangeNotice;
	}

	public void setChangeNotice(String changeNotice) {
		ChangeNotice = changeNotice;
	}

	public String getChangeName() {
		return ChangeName;
	}

	public void setChangeName(String changeName) {
		ChangeName = changeName;
	}

	public String getChangeDescription() {
		return ChangeDescription;
	}

	public void setChangeDescription(String changeDescription) {
		ChangeDescription = changeDescription;
	}
}
