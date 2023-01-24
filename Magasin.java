public class Magasin {

    private String Adresse;
    private ProduitElectronique[] Pelec;
    private ProduitPerissable[] Pperis;

    public Magasin(String Adresse, ProduitElectronique[] Pelec, ProduitPerissable[] Pperis) {
        this.Adresse = Adresse;
        this.Pelec = Pelec;
        this.Pperis = Pperis;
    }

    public void afficherMagasin() {
        System.out.println("Adresse du Magasin: " + Adresse);
        for (int i = 0; i < Pperis.length; i++)
            Pperis[i].toString();

        for (int i = 0; i < Pelec.length; i++)
            Pelec[i].toString();
    }

    public boolean VerifProduitElectronique(ProduitElectronique id) {
        if (this.id == Pelec.id) return true;
        else return false;
    }

    public boolean VerifProduitPerissable(ProduitPerissable PP) {
        return this.id == Pperis.;
    }
}

