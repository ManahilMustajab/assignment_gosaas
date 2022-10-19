package io.gosaas.attachment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AttachmentService {
	@Autowired
	AttachmentRepository attachmentRepo;

	// to store an attachment for an item
	public Attachment store(MultipartFile file, int itemId) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		String fileType = file.getContentType().toString();
		Attachment attachment = new Attachment(fileName, fileType, file.getBytes(), itemId);
		return attachmentRepo.save(attachment);
	}

	// deleting an attachment associated to an item
	public void deleteAttachment(int id) {
		attachmentRepo.deleteById(id);
	}

	// getting attachment By Id
	public Attachment getAttachmentById(int id) {
		return attachmentRepo.findById(id).get();
	}

	// getting all items attached to a specific item
	public List<Attachment> getAllAttachments(int itemId) {
		List<Attachment> attachments = new ArrayList<>();
		attachmentRepo.findByItemItemId(itemId).forEach(attachments::add);
		return attachments;
	}

}
