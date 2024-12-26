package funix.lab231x_ass18.repository;

import funix.lab231x_ass18.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Integer> {


}
