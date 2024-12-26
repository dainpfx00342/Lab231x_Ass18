package funix.lab231x_ass18.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(length = 65000)
    private String text;
}
