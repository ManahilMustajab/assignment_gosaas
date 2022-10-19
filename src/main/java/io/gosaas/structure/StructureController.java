package io.gosaas.structure;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.gosaas.item.Item;

@RestController
public class StructureController {
	@Autowired
	private StructureService structureService;
	Logger logger = LoggerFactory.getLogger(StructureController.class);

	// API for getting all structure belonging to an item
	@RequestMapping("/items/{id}/structures")
	public List<Structure> getALllStructures(@PathVariable int id) {
		logger.trace("getting All structures for item " + id + " ...");
		return structureService.getAllStructures(id);
	}

	// API to get a structure of an item
	@RequestMapping("/items/{itemId}/structures/{id}")
	public Optional<Structure> getStructure(@PathVariable int id) {
		logger.trace("returning a structure for item " + id + " ...");
		return structureService.getStructure(id);
	}

	// API to add structure to an item
	@RequestMapping(method = RequestMethod.POST, value = "/items/{itemId}/structures")
	public void addStructure(@RequestBody Structure structure, @PathVariable int itemId) {
		structure.setItem(new Item(itemId, "", "", "", "", "", ""));
		logger.trace("adiindg structure for item " + itemId + " ...");
		structureService.addStructure(structure);
	}

	// API to update a structure
	@RequestMapping(method = RequestMethod.PUT, value = "/items/{itemId}/structures/{id}")
	public void updateStructure(@RequestBody Structure structure, @PathVariable int itemId) {
		structure.setItem(new Item(itemId, "", "", "", "", "", ""));
		logger.trace("updating structure foe item id " + itemId + " ...");
		structureService.updateStructure(structure);
	}

	// API to delete a structure of an item
	@RequestMapping(method = RequestMethod.DELETE, value = "/items/{itemId}/structures/{id}")
	public void deleteStructure(@PathVariable int id) {
		logger.trace("deleting structure...");
		structureService.deleteStructure(id);
	}

}
