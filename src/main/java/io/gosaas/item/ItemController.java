package io.gosaas.item;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	@Value("${structureUrl}")
	private String structureUrl;
	@Value("${attachmentUrl}")
	private String attcahmentUrl;
	Logger logger = LoggerFactory.getLogger(ItemController.class);
	@Autowired
	private ItemService itemService;

	// get method for all items
	@RequestMapping("/items")
	public List<Item> getALllItems() {
		logger.trace("returning all Items in DB...");
		return itemService.getAllItems();
	}

	// get method for an item
	@RequestMapping("/items/{ItemId}")
	public Optional<Item> getItem(@PathVariable int ItemId) {
		logger.trace("returning single Item against it Id in DB...");
		return itemService.getItem(ItemId);
	}

//page redirection for structure page of an item against it's Id
	@RequestMapping("/redirectToStructure/{itemId}")
	public Item redirectToStructure(@PathVariable int itemId) {
		String redirectUrl = structureUrl + itemId;
		Item i = new Item(1, redirectUrl, "", "", "", "", "");
		logger.trace("redirecting to structure Page...");
		return i;
	}

	// page redirection for structure page of an item against it's Id
	@RequestMapping("/redirectToAttachment/{itemId}")
	public Item redirectToAttachment(@PathVariable int itemId) {
		String redirectUrl = attcahmentUrl + itemId;
		Item i = new Item(1, redirectUrl, "", "", "", "", "");
		logger.trace("redirecting to attachment page against it's item Id in DB...");
		return i;
	}

	// method to add a single item to DB
	@RequestMapping(method = RequestMethod.POST, value = "/items")
	public void addItem(@RequestBody Item item) {
		logger.trace("adding an item to DB...");
		itemService.addItem(item);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/items/{itemId}")
	public void updateItem(@RequestBody Item item) {
		logger.trace("updating item details w.rt its item Id in DB...");
		itemService.updateItem(item);
	}

	// method to delete an item from db
	@RequestMapping(method = RequestMethod.DELETE, value = "/items/{itemId}")
	public void deleteItem(@PathVariable int itemId) {
		logger.trace("deleting an item from Db ...");
		itemService.deleteItem(itemId);
	}

//method to update the cloud sync status of an item after its synched on Cloud
	@RequestMapping(method = RequestMethod.PUT, value = "/changeSyncStatus/{itemId}")
	public String UpdateItemSyncStatus(@PathVariable int itemId) {
		Optional<Item> item = itemService.getItem(itemId);
		item.get().setItemSyncStatus("true");
		itemService.updateItem(item.get());
		logger.trace("item Sync status for cloud set to true...");
		return "Status Updated";
	}

	// method to update ChangeOrder Number against an item
	@RequestMapping(method = RequestMethod.PUT, value = "/setCONumber/{itemId}")
	public String UpdateCONumber(@PathVariable int itemId, @RequestBody String CONumber) {
		Optional<Item> item = itemService.getItem(itemId);
		item.get().setChangeOrderId(CONumber);
		itemService.updateItem(item.get());
		logger.trace("Changeorder Number added for item " + itemId + " is " + CONumber + " ...");
		return "Status Updated";
	}

	// method to update 'has attachment 'status of an item if it has an attachment
	@RequestMapping(method = RequestMethod.PUT, value = "/changeAttachmentStatus/{itemId}")
	public String UpdateAttachmentStatus(@PathVariable int itemId) {
		Optional<Item> item = itemService.getItem(itemId);
		item.get().setAttachmentStatus("true");
		itemService.updateItem(item.get());
		logger.trace("Attachment status for item " + itemId + " set to true...");
		return "Status Updated";
	}

	// method to update 'has structure' status of an item if it has a structure
	@RequestMapping(method = RequestMethod.PUT, value = "/changeStructureStatus/{itemId}")
	public String UpdateStructureStatus(@PathVariable int itemId) {
		Optional<Item> item = itemService.getItem(itemId);
		item.get().setStructureStatus("true");
		itemService.updateItem(item.get());
		logger.trace("Structure status for item " + itemId + " set to true...");
		return "Status Updated";
	}

}
