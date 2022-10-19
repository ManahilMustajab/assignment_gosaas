package io.gosaas.structure;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StructureRepository extends CrudRepository<Structure, Integer> {
	public List<Structure> findByItemItemId(int itemId);
}
