package fr.paymybuddy.spring.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.paymybuddy.spring.api.models.DTO.CarteDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "cartes")
public class Carte {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_portefeuille")
    private Portefeuille portefeuille;

    @Column(name = "nom_carte")
    private String nomCarte;

    @Column(name = "numero_carte")
    private String numCarte;

    @Column(name = "mois_carte")
    private Date moisCarte;

    private int cryptogramme;

    public Carte(){

    }

    public Carte(CarteDTO carteDTO){
        this.id = carteDTO.getId();
        this.portefeuille = new Portefeuille(carteDTO.getPortefeuille());
        this.nomCarte = carteDTO.getNomCarte();
        this.numCarte = carteDTO.getNumCarte();
        this.moisCarte = carteDTO.getMoisCarte();
        this.cryptogramme = carteDTO.getCryptogramme();
    }
}
