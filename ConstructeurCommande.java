public static class ConstructeurCommande {
    private String type_de_cafe;
    private String type_de_lait;
    private int quantite_de_sucre;
    private boolean chantilly;
    private boolean sirop;
    private boolean caramel;

    private ConstructeurCommande(String type_de_cafe) {
        this.type_de_cafe = type_de_cafe;
    }

    private ConstructeurCommande definirTypedelait(String type_de_lait) {
        this.type_de_lait = type_de_lait;
        return this;
    }

    private ConstructeurCommande definirQuantitedesucre(int quantite_de_sucre) {
        this.quantite_de_sucre = quantite_de_sucre;
        return this;
    }

    private ConstructeurCommande definirChantilly(boolean chantilly) {
        this.chantilly = chantilly;
        return this;
    }

    private ConstructeurCommande definirSirop(boolean sirop) {
        this.sirop = sirop;
        return this;
    }

    private ConstructeurCommande definirCaramel(boolean caramel) {
        this.caramel = caramel;
        return this;
    }
    
    
}