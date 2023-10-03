package ctu.cit.se.student.training.services.imples;

import ctu.cit.se.student.training.entities.User;
import ctu.cit.se.student.training.repositories.IUserRepository;
import ctu.cit.se.student.training.services.interfaces.IUserService;
import ctu.cit.se.student.training.exceptions.ExceptionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public User retrieve(Long id){
        return this.userRepository.findById(id).get();
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> list() {
        return this.userRepository.findAll();
    }

}
