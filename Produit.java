public class Produit {

    protected String id;
    protected String nom;
    protected double prixAchat;
    protected double prixVente;

    public Produit(String id, String nom, double prixAchat, double prixVente){

        this.id=id;
        this.nom=nom;
        this.prixAchat=prixAchat;
        this.prixVente=prixVente;
    }

    public double reductionPrix(int reduction){
        return prixVente=prixVente*reduction;
    }
    public double augmenterPrix(int augmentation){
        return prixVente=prixVente*(1+augmentation/100);
    }
    public String toString() {
        return "Produit " +" iD: " + id + " nom: " + nom + " prixAchat: " + prixAchat + " prixVente: " + prixVente;
    }
}
