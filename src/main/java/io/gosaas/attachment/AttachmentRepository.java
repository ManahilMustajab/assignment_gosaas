package io.gosaas.attachment;
import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Integer>{
	public List<Attachment> findByItemItemId(int itemId);

}
