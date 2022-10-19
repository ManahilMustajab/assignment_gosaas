package io.gosaas.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.gosaas.item.Item;

@Entity
@Table(name = "assignmentTableStructure", schema = "assignmentDb")
public class Structure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "structureid")
	private int StructureId;
	@Column(name = "structurename")
	private String StructureName;
	@Column(name = "structuredescription")
	private String StructureDescription;
	@Column(name = "structurequantity")
	private String StructureQuantity;
	@ManyToOne
	@JoinColumn(name = "itemId")
	private Item item;

	public Structure() {
	}

	public Structure(int structureId, String structureName, String structureDescription, String structureQuantity,
			int itemId) {
		super();
		StructureId = structureId;
		StructureName = structureName;
		StructureDescription = structureDescription;
		StructureQuantity = structureQuantity;
		this.item = new Item(itemId, "", "", "", "", "", "");
	}

	public int getStructureId() {
		return StructureId;
	}

	public void setStructureId(int structureId) {
		StructureId = structureId;
	}

	public String getStructureName() {
		return StructureName;
	}

	public void setStructureName(String structureName) {
		StructureName = structureName;
	}

	public String getStructureDescription() {
		return StructureDescription;
	}

	public void setStructureDescription(String structureDescription) {
		StructureDescription = structureDescription;
	}

	public String getStructureQuantity() {
		return StructureQuantity;
	}

	public void setStructureQuantity(String structureQuantity) {
		StructureQuantity = structureQuantity;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return item;
	}
}
