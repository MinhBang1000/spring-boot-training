package ctu.cit.se.student.training.models.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserResponseDto {
    private Long id;
    private String email;
    private Integer bornAt;
    public CreateUserResponseDto() {}

    public CreateUserResponseDto(Long id, String email, Integer bornAt) {
        this.id = id;
        this.email = email;
        this.bornAt = bornAt;
    }
}
