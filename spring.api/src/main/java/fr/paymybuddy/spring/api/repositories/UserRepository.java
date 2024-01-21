package fr.paymybuddy.spring.api.repositories;

import fr.paymybuddy.spring.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findOneByEmail(String email);
}
