package ctu.cit.se.student.training.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String title;
    @Column(nullable = false)
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    private User author;
    @ManyToMany(mappedBy = "posts")
    @JsonIgnore
    private List<Tag> tags = new ArrayList<>();
}
