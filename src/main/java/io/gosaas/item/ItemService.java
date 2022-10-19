package io.gosaas.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}

	public Optional<Item> getItem(int id) {
		return (itemRepository.findById(id));
	}

	public void addItem(Item item) {
		itemRepository.save(item);
	}

	public void updateItem(Item item) {
		itemRepository.save(item);
		return;
	}

	public void deleteItem(int id) {
		itemRepository.deleteById(id);
	}

}
