package uir.ac.ma.projetinteg.model;

import javax.persistence.*;

@Entity
@Table(name = "Categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "NomCategorie")
    private String nomCategorie;


    public int getId() {
        return id;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
