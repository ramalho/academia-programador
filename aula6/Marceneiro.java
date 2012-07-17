public class Marceneiro {
    public static void main(String[] args) {
        int taco = 45;
        int tabua3m = 300;
        int tabua4m = 400;
        int tabua5m = 500;
        int pecas, sobra;
        pecas = tabua3m / taco;
        sobra = tabua3m % taco;
        System.out.print("A tábua de 3m dá para "+pecas+" peças");
        System.out.println(" e sobra "+sobra+"cm.");
        pecas = tabua4m / taco;
        sobra = tabua4m % taco;
        System.out.print("A tábua de 4m dá para "+pecas+" peças");
        System.out.println(" e sobra "+sobra+"cm.");
        pecas = tabua5m / taco;
        sobra = tabua5m % taco;
        System.out.print("A tábua de 5m dá para "+pecas+" peças");
        System.out.println(" e sobra "+sobra+"cm.");
    }
}