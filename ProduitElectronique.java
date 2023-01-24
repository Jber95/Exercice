import java.util.Scanner;
public class ProduitElectronique extends Produit {
    Scanner scanner = new Scanner(System.in);
    private int stockElectro;
    private int dureeGarantie;

    public ProduitElectronique(String id, String nom, double prixAchat, double prixVente,int stockElectro, int dureeGarantie){
        super(id,nom,prixAchat,prixVente);
        this.stockElectro=stockElectro;
        this.dureeGarantie=dureeGarantie;
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
    public int getStockElectro(){
        return stockElectro;
    }
    public int getDureeGarantieureeGarantie(){
        return dureeGarantie;
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
    public int setStockElectro(){
        System.out.print("Entrer la nouvelle quantité en stock");
        int stockElectro = scanner.nextInt();
        this.stockElectro=stockElectro;
        return this.stockElectro;
    }
    public int setDureeGarantie(){
        System.out.print("Entrer la nouvelle durée de garantie");
        int dureeGarantie = scanner.nextInt();
        this.dureeGarantie=dureeGarantie;
        return this.dureeGarantie;
    }
    public double remplirStockPE(int qt){
        stockElectro+=qt;
        return prixAchat*qt;
    }
    public double vendrePE(int qt){
        if(qt<=stockElectro) {
            stockElectro -= qt;
            return qt * prixVente;
        }
        else
            System.out.println("Stock insuffisant. Vente non réussite");
        return 0;
    }

    public String toString() {
        return super.toString()+"Quantité en stock: "+stockElectro+"Durée Garantie: "+dureeGarantie;
    }
}
