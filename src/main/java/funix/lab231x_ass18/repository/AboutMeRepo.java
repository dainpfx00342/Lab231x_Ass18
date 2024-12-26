package funix.lab231x_ass18.repository;

import funix.lab231x_ass18.model.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutMeRepo extends JpaRepository<AboutMe, Long> {
       AboutMe findFirstByOrderByIdAsc();
}
