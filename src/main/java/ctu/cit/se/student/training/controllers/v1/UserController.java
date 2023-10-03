package ctu.cit.se.student.training.controllers.v1;

import ctu.cit.se.student.training.entities.User;
import ctu.cit.se.student.training.models.requests.CreateUserRequestDto;
import ctu.cit.se.student.training.models.responses.CreateUserResponseDto;
import ctu.cit.se.student.training.models.responses.RetrieveUserResponseDto;
import ctu.cit.se.student.training.services.imples.UserService;
import ctu.cit.se.student.training.services.interfaces.IUserService;
import ctu.cit.se.student.training.utilities.mappers.interfaces.IModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IModelMapper<CreateUserRequestDto, User> userRequestMapper;
    @Autowired
    private IModelMapper<CreateUserResponseDto, User> userResponseMapper;
    @Autowired
    private IModelMapper<RetrieveUserResponseDto, User> userRetrieveMapper;
    @PostMapping("")
    public ResponseEntity<CreateUserResponseDto> createUserApi(@RequestBody CreateUserRequestDto createUserRequestDto) {
        return new ResponseEntity<>(
                this.userResponseMapper.inverseTo(
                        this.userService.create(this.userRequestMapper.mappingTo(createUserRequestDto))
                ),HttpStatus.CREATED);
    }
    @GetMapping("")
    public ResponseEntity<List<RetrieveUserResponseDto>> listUserApi() {
        return new ResponseEntity<>(
                this.userService.list().stream().map(user -> {
                    return this.userRetrieveMapper.inverseTo(user);
                }).collect(Collectors.toList()),
                HttpStatus.OK
        );
    }
}
