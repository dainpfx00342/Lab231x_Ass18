package funix.lab231x_ass18.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class BlogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false,length = 65000)
    private String content;

    @Column
    private String imageUrl;

    @Column
    private String iconClass;

    @Column(nullable = false)
    private LocalDate publishDate;

    @Column(columnDefinition = "integer default 0")
    private int likes = 0;

    @Column
    private int comments = 0;

    @Column
    private int shares = 0;
}
