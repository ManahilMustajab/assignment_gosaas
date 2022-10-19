package io.gosaas.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StructureService {
	@Autowired
	private StructureRepository structureRepository;

	public List<Structure> getAllStructures(int itemId) {
		List<Structure> structure = new ArrayList<>();
		structureRepository.findByItemItemId(itemId).forEach(structure::add);
		return structure;
	}

	public Optional<Structure> getStructure(int id) {
		return (structureRepository.findById(id));
	}

	public void addStructure(Structure structure) {
		structureRepository.save(structure);
		return;
	}

	public void updateStructure(Structure structure) {
		structureRepository.save(structure);
		return;
	}

	public void deleteStructure(int id) {
		structureRepository.deleteById(id);
	}
}
