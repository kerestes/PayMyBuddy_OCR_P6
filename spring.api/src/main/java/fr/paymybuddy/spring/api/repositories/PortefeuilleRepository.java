package fr.paymybuddy.spring.api.repositories;

import fr.paymybuddy.spring.api.models.Portefeuille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PortefeuilleRepository extends JpaRepository<Portefeuille, Long> {

    @Query("SELECT p FROM Portefeuille p WHERE p.user.email = :email")
    public Optional<Portefeuille> getPortefeuilleByEmail(String email);
}
