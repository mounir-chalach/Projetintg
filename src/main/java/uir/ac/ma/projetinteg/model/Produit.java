package uir.ac.ma.projetinteg.model;
import javax.persistence.*;


@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
    @Column(name = "NomProduit")
    private String nomProduit;
    @Column(name = "description")
    private String description;
    @Column(name = "Prix")
    private double prix;
    @Column(name = "QStock")
    private int quantiteEnStock;

    public Produit() {
    }

    public Produit(int id, Utilisateur utilisateur, Categorie categorie, String nomProduit, String description, double prix, int quantiteEnStock) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.categorie = categorie;
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }
}
