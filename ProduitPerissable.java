import java.util.Scanner;
public class ProduitPerissable extends Produit {
    Scanner scanner = new Scanner(System.in);
    private double stockPeris;
    private String DateLimite;

    public ProduitPerissable(String iD, String nom, double prixAchat, double prixVente, double stockPeris, String DateLimite) {
        super(iD, nom, prixAchat, prixVente);
        this.stockPeris = stockPeris;
        this.DateLimite = DateLimite;
    }
    public String getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public double getPrixAchat(){
        return prixAchat;
    }
    public double getPrixVente(){
        return prixVente;
    }
    public double getStockPeris(){
        return stockPeris;
    }
    public String getDateLimite(){
        return DateLimite;
    }
    public String setId(){
        System.out.print("Entrer le nouveau ID");
        String id = scanner.next();
        this.id=id;
        return this.id;
    }
    public String setNom() {
        System.out.print("Entrer le nouveau nom");
        String nom = scanner.next();
        this.nom=nom;
        return this.nom;
    }
    public double setPrixVente() {
        System.out.print("Entrer le nouveau prix de vente");
        double prixVente = scanner.nextDouble();
        this.prixVente=prixVente;
        return this.prixVente;
    }
    public double setPrixAchat() {
        System.out.print("Entrer le nouveau prix d'achat");
        double prixAchat = scanner.nextDouble();
        this.prixAchat=prixAchat;
        return this.prixAchat;
    }
    public double setStockPeris(){
        System.out.print("Entrer la nouvelle quantité en stock");
        double stockPeris = scanner.nextDouble();
        this.stockPeris=stockPeris;
        return this.stockPeris;
    }
    public String setDateLimite(){
        System.out.print("Entrer la nouvelle date limite");
        String DateLimite = scanner.next();
        this.DateLimite=DateLimite;
        return this.DateLimite;
    }

    public double remplirStockPP(int qt){
        stockPeris+=qt;
        return prixAchat*qt;
    }
    public double VendrePP(double qt){
        if(qt<=stockPeris) {
            stockPeris -= qt;
            return qt * prixVente;
        }
        else
            System.out.println("Stock insuffisant. Vente non réussite");
        return 0;
    }
    public String toString() {
        return super.toString()+"Quantité en stock: "+stockPeris+"Date limite: "+DateLimite;
    }
}
