package funix.lab231x_ass18.service;

import funix.lab231x_ass18.model.Contact;
import funix.lab231x_ass18.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepo contactRepo;

    public void saveMessage(Contact contact) {
        // Save the message to the database
        contactRepo.save(contact);
    }
}
