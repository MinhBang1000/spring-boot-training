package ctu.cit.se.student.training.utilities.mappers.user;

import ctu.cit.se.student.training.entities.User;
import ctu.cit.se.student.training.models.responses.CreateUserResponseDto;
import ctu.cit.se.student.training.models.responses.RetrieveUserResponseDto;
import ctu.cit.se.student.training.utilities.mappers.interfaces.IModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RetrieveUserResponseMapper implements IModelMapper<RetrieveUserResponseDto, User> {

    @Override
    public User mappingTo(RetrieveUserResponseDto source) {
        return new User(source.getId(), source.getEmail(), source.getBornAt());
    }

    @Override
    public RetrieveUserResponseDto inverseTo(User result) {
        return new RetrieveUserResponseDto(result.getId(), result.getEmail(), result.getBornAt());
    }
}
