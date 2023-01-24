public class StockTest {
    public static void main(String[] args) {
        ProduitElectronique[] Pelec= new ProduitElectronique[2];
        Pelec[0]=new ProduitElectronique("123","Frigidaire",300,500,30,60);
        Pelec[1]=new ProduitElectronique("456","Four",299,450,40,60);

        ProduitPerissable[] Pperis = new ProduitPerissable[2];
        Pperis[0]=new ProduitPerissable("789","Banane",0.30,0.99,80,"15 Février");
        Pperis[1]=new ProduitPerissable("101112","Pomme",0.20,0.89,70,"20 Février");

        Magasin A1 = new Magasin("1234 Rue Jarry",Pelec,Pperis);


   System.out.println(Pelec[0].augmenterPrix(5));
   System.out.println(Pelec[0].reductionPrix(5));
   System.out.println(Pelec[0].remplirStockPE(15));
   System.out.println(Pelec[0].vendrePE(6));

   System.out.println(Pperis[0].remplirStockPP(6));
   System.out.println(Pperis[0].VendrePP(8));


    }
}