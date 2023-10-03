package ctu.cit.se.student.training.models.requests;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CreateUserRequestDto {
    private String email;
    private Integer bornAt;
    public CreateUserRequestDto() {}
    public CreateUserRequestDto(String email, Integer bornAt) {
        this.email = email;
        this.bornAt = bornAt;
    }
}
