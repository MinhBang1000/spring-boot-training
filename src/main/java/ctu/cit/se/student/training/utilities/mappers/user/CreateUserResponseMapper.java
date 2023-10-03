package ctu.cit.se.student.training.utilities.mappers.user;

import ctu.cit.se.student.training.entities.User;
import ctu.cit.se.student.training.models.requests.CreateUserRequestDto;
import ctu.cit.se.student.training.models.responses.CreateUserResponseDto;
import ctu.cit.se.student.training.utilities.mappers.interfaces.IModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateUserResponseMapper implements IModelMapper<CreateUserResponseDto, User> {

    @Override
    public User mappingTo(CreateUserResponseDto source) throws NullPointerException{
        return new User(source.getEmail(), source.getBornAt());
    }

    @Override
    public CreateUserResponseDto inverseTo(User result) throws NullPointerException{
        return new CreateUserResponseDto(result.getId(), result.getEmail(), result.getBornAt());
    }
}
