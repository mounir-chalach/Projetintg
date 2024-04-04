package uir.ac.ma.projetinteg.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    // Getters and setters
}


