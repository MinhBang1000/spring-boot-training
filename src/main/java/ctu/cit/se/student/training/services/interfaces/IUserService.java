package ctu.cit.se.student.training.services.interfaces;

import ctu.cit.se.student.training.entities.User;
import ctu.cit.se.student.training.models.requests.CreateUserRequestDto;
import ctu.cit.se.student.training.models.requests.UpdateUserRequestDto;
import ctu.cit.se.student.training.models.responses.CreateUserResponseDto;
import ctu.cit.se.student.training.models.responses.RetrieveUserResponseDto;
import ctu.cit.se.student.training.models.responses.UpdateUserResponseDto;

import java.util.List;

public interface IUserService extends IService<User, Long>{
    User create(User user);
    User update(User user);
    List<User> list();
    User retrieve(Long id);
}
