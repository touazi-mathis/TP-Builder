class Commandcafe {

    private String type_de_cafe;
    private String type_de_lait;
    private int quantite_de_sucre;
    private boolean chantilly;
    private boolean sirop;
    private boolean caramel;


    // Constructeur par défaut
    private Commandcafe(){
        this.type_de_cafe = "type de cafe";
        this.type_de_lait = "type de lait";
        this.quantite_de_sucre = 10;
        this.chantilly = false;
        this.sirop = false;
        this.caramel = false;
    }

    // Constructeur avec paramètres
    private Commandcafe(String type_de_cafe, String type_de_lait, int quantite_de_sucre, boolean chantilly, boolean sirop, boolean caramel){
        this.type_de_cafe = type_de_cafe;
        this.type_de_lait = type_de_lait;
        this.quantite_de_sucre =  quantite_de_sucre;
        this.chantilly = chantilly;
        this.sirop = sirop;
        this.caramel = caramel;
    }

    // Getters
    public String getTypedecafe(){
        return this.type_de_cafe;
    }

    public String getTypedelait(){
        return this.type_de_lait;
    }

    public int getQuantitedesucre(){
        return this.quantite_de_sucre;
    }

    public boolean getChantilly(){
        return this.chantilly;
    }

    public boolean getSirop(){
        return this.sirop;
    }

    public boolean getCaramel(){
        return this.caramel;
    }


    //public String toString(){
    //    return "Voici le café : le type de café est " + getTypedecafe() + ", le type de lait est " + getTypedelait() + ", la quantite de sucre est " + getQuantitedesucre() + ", le cafe a-t-il de la chantilly ? : " + getChantilly() + ", le cafe a-t-il du sirop ? : " + getChantilly() + ", le cafe a-t-il du caramel ? : " + getCaramel() + "."
    //}



    private void affichercafe() {
        System.out.println("le type de café : " + type_de_cafe);
        System.out.println("le type de lait : " + type_de_lait);
        System.out.println("La quantité de sucre : " + quantite_de_sucre);
        System.out.println("La chantilly : " + chantilly);
        System.out.println("Le sirop : " + sirop);
        System.out.println("Le caramel : " + caramel);
    }

    public Commandcafe construire() {
        return new Commandcafe(this);
    }
}