package funix.lab231x_ass18.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AboutMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private byte age;

    @Column
    private String description;

    @Column
    private String hobby;

    @Column
    private String imageUrl;
}
