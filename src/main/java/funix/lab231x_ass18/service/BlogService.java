package funix.lab231x_ass18.service;

import funix.lab231x_ass18.model.BlogEntry;
import funix.lab231x_ass18.repository.BlogEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogEntryRepo blogEntryRepo;

    public List<BlogEntry> getAllBlogEntries() {
        return blogEntryRepo.findAll();
    }

    public List<BlogEntry> get4BlogEntries() {
        return blogEntryRepo.findTop4ByOrderByPublishDate();
    }


}
