package funix.lab231x_ass18.service;

import funix.lab231x_ass18.model.AboutMe;
import funix.lab231x_ass18.repository.AboutMeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeService {

    @Autowired
    private AboutMeRepo aboutMeRepo;

    public AboutMe getAboutMe() {
        return aboutMeRepo.findFirstByOrderByIdAsc();
    }
}
