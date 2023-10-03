package ctu.cit.se.student.training.utilities.mappers.user;

import ctu.cit.se.student.training.entities.User;
import ctu.cit.se.student.training.models.requests.CreateUserRequestDto;
import ctu.cit.se.student.training.utilities.mappers.interfaces.IModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateUserRequestMapper implements IModelMapper<CreateUserRequestDto, User> {

    @Override
    public User mappingTo(CreateUserRequestDto source) throws NullPointerException{
        return new User(source.getEmail(), source.getBornAt());
    }

    @Override
    public CreateUserRequestDto inverseTo(User result) throws NullPointerException{
        return new CreateUserRequestDto(result.getEmail(), result.getBornAt());
    }
}
