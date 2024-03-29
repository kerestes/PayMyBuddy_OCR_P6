package fr.paymybuddy.spring.api.repositories;

import fr.paymybuddy.spring.api.models.Portefeuille;
import fr.paymybuddy.spring.api.models.TransactionBuddys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Transactional
public interface TransactionBuddyRepository extends JpaRepository<TransactionBuddys, Long> {

    @Query("SELECT tb FROM TransactionBuddys tb where tb.portefeuilleOrigine.user.email = :email or tb.portefeuilleDestination.user.email = :email")
    public List<TransactionBuddys> getTransaction(String email);
}
