package io.gosaas.attachment;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.gosaas.item.ItemController;

@RestController
public class AttachmentController {
	@Autowired
	AttachmentService attachmentService;
	Logger logger = LoggerFactory.getLogger(ItemController.class);

	// API to add an attachment for an item
	@RequestMapping(method = RequestMethod.POST, value = "/items/{itemId}/attachments")
	public Attachment AddAttachment(@RequestParam("file") MultipartFile file, @PathVariable int itemId)
			throws IOException {
		logger.trace("Attachment added for item Id " + itemId + " ...");
		return attachmentService.store(file, itemId);
	}

	// API to get all attachments for an item
	@RequestMapping("/items/{itemId}/attachments")
	public List<Attachment> getAllAttachments(@PathVariable int itemId) {
		logger.trace("returning All Attachment for item " + itemId + " ...");
		return attachmentService.getAllAttachments(itemId);
	}

	// API to delete a particular attachment of an item against it's specified Id
	@RequestMapping(method = RequestMethod.DELETE, value = "/items/{itemId}/attachments/{id}")
	public void deleteAttachment(@PathVariable int id) {
		attachmentService.deleteAttachment(id);
	}

	// APi to get a particular attachment(with specified ID) of an item
	@RequestMapping("/items/{itemId}/attachments/{id}")
	public ResponseEntity<byte[]> getAttachment(@PathVariable int id) {
		Attachment fileDownload = attachmentService.getAttachmentById(id);
		logger.trace("downloading attachment...");
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION,
						"attachment; filename=\"" + fileDownload.getAttachmenTitle() + "\"")
				.body(fileDownload.getAttachmentData());
	}

}
