package ctu.cit.se.student.training.repositories;

import ctu.cit.se.student.training.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {}
