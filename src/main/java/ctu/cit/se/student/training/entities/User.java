package ctu.cit.se.student.training.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private Integer bornAt;
    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Post> posts = new ArrayList<>();
    public User(String email, Integer bornAt) {
        this.email = email;
        this.bornAt = bornAt;
    }

    public User(Long id, String email, Integer bornAt) {
        this.id = id;
        this.email = email;
        this.bornAt = bornAt;
    }
}
