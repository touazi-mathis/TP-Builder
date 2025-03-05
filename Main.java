public class Main {
    public static void main(String[] args) {
        Commandcafe cafe_noir = new Commandcafe.ConstructeurCommande("Café noir")
            .definirTypedelait("Lait écrémé")
            .definirQuantitedesucre(0)
            .definirChantilly(true)
            .definirSirop(false)
            .definirCaramel(true)
            .constructeur();

        Commandcafe cafe_lait_sucre = new Commandcafe.ConstructeurCommande("Café avec du lait et du sucre")
            .definirTypedelait("Demi-écrémé")
            .definirQuantitedesucre(20)
            .definirChantilly(false)
            .definirSirop(false)
            .definirCaramel(false)
            .construire();

        Commandcafe cafe_gourmand = new Commandcafe.ConstructeurCommande("Café gourmand")
            .definirTypedelait("Lait du soja")
            .definirQuantitedesucre(10)
            .definirChantilly(true)
            .definirSirop(true)
            .definirCaramel(true)
            .construire();
    
        affichercafe();
    }
}