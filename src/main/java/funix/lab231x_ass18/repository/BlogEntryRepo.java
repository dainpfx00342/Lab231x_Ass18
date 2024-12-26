package funix.lab231x_ass18.repository;

import funix.lab231x_ass18.model.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogEntryRepo extends JpaRepository<BlogEntry, Long> {
    List<BlogEntry> findTop4ByOrderByPublishDate();


}
