package io.gosaas.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignmentTableItem", schema = "assignmentDb")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itemId")
	private int itemId;
	@Column(name = "itemName")
	private String itemName;
	@Column(name = "itemDescription")
	private String itemDescription;
	@Column(name = "itemSyncStatus")
	private String itemSyncStatus;
	@Column(name = "changeOrderId")
	private String changeOrderId;
	@Column(name = "attachmentStatus")
	private String attachmentStatus;
	@Column(name = "structureStatus")
	private String structureStatus;

	public Item() {
	}

	public Item(int itemId, String itemName, String itemDescription, String itemSyncStatus, String changeOrderId,
			String attachmentStatus, String structureStatus) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemSyncStatus = itemSyncStatus;
		this.attachmentStatus = attachmentStatus;
		this.structureStatus = structureStatus;
		this.changeOrderId = changeOrderId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemSyncStatus() {
		return itemSyncStatus;
	}

	public void setItemSyncStatus(String itemSyncStatus) {
		this.itemSyncStatus = itemSyncStatus;
	}

	public String getAttachmentStatus() {
		return attachmentStatus;
	}

	public String getChangeOrderId() {
		return changeOrderId;
	}

	public void setChangeOrderId(String changeOrderId) {
		this.changeOrderId = changeOrderId;
	}

	public void setAttachmentStatus(String attachmentStatus) {
		this.attachmentStatus = attachmentStatus;
	}

	public String getStructureStatus() {
		return structureStatus;
	}

	public void setStructureStatus(String structureStatus) {
		this.structureStatus = structureStatus;
	}
}
