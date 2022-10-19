package io.gosaas.cloud;

public class CloudItem {
	String ItemNumber;
	String ItemDescription;
	String ItemClass;
	String OrganizationCode;
	String PrimaryUOMValue;

	public CloudItem() {
	}

	public CloudItem(String itemNumber, String itemDescription, String itemClass, String organizationCode,
			String primaryUOMValue) {
		super();
		ItemNumber = itemNumber;
		ItemDescription = itemDescription;
		ItemClass = itemClass;
		OrganizationCode = organizationCode;
		PrimaryUOMValue = primaryUOMValue;
	}

	public String getItemNumber() {
		return ItemNumber;
	}

	public void setItemNumber(String itemNumber) {
		ItemNumber = itemNumber;
	}

	public String getItemDescription() {
		return ItemDescription;
	}

	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}

	public String getItemClass() {
		return ItemClass;
	}

	public void setItemClass(String itemClass) {
		ItemClass = itemClass;
	}

	public String getOrganizationCode() {
		return OrganizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		OrganizationCode = organizationCode;
	}

	public String getPrimaryUOMValue() {
		return PrimaryUOMValue;
	}

	public void setPrimaryUOMValue(String primaryUOMValue) {
		PrimaryUOMValue = primaryUOMValue;
	}
}