package ctu.cit.se.student.training.models.requests;

import lombok.Builder;
import lombok.Data;
import org.hibernate.sql.Update;

@Data
@Builder
public class UpdateUserRequestDto {
    private Long id;
    private String email;
    private Integer bornAt;
    public UpdateUserRequestDto() {}
    public UpdateUserRequestDto(Long id, String email, Integer bornAt) {
        this.email = email;
        this.bornAt = bornAt;
        this.id = id;
    }
}
