package io.gosaas.attachment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.gosaas.item.Item;

@Entity
@Table(name = "assignmentTableAttachment", schema = "assignmentDb")
public class Attachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attachmentid")
	private int attachmentId;

	@Column(name = "attachmentitle")
	private String attachmenTitle;

	@Column(name = "attachmentdescription")
	private String attachmentDescription;

	@Lob
	@Column(name = "attachmentdata")
	private byte[] attachmentData;

	@ManyToOne
	@JoinColumn(name = "itemId")
	private Item item;

	public Attachment() {
	}

	public Attachment(String attachmentTitle, String attachmentDescription, byte[] attachmentData, int itemId) {
		super();

		this.attachmenTitle = attachmentTitle;
		this.attachmentDescription = attachmentDescription;
		this.attachmentData = attachmentData;
		this.item = new Item(itemId, "", "", "", "", "", "");
	}

	public int getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getAttachmenTitle() {
		return attachmenTitle;
	}

	public void setAttachmenTitle(String attachmentTitle) {
		this.attachmenTitle = attachmentTitle;
	}

	public String getAttachmentDescription() {
		return attachmentDescription;
	}

	public void setAttachmentDescription(String attachmentDescription) {
		this.attachmentDescription = attachmentDescription;
	}

	public byte[] getAttachmentData() {
		return attachmentData;
	}

	public void setAttachmentData(byte[] attachmentData) {
		this.attachmentData = attachmentData;
	}

}
