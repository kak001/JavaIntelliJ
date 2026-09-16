package Fish;

public class Main {
     public static void main(String[] args) {
        // Peces
        var tuna = new Tuna("Atun Rojo", 20, 100, 15.2);
        var salmon = new Salmon("Salmon Chinook (Rey)", 4, 80, "Río Tólten");
        var snook = new Snook("Robalo Chileno", 17.5, 100, 1400);

        tuna.info();
        System.out.println();

        tuna.sound();
        System.out.println();

        salmon.info();
        System.out.println();

        salmon.sound();
        System.out.println();

        snook.info();
        System.out.println();

        snook.sound();
        System.out.println();

        // Pescador
        var fisher = new Fisher("kako", 20, "Chilena");

        fisher.fisherInfo();
        System.out.println();

        fisher.showFish();
        System.out.println();

        fisher.fishing(tuna);
        System.out.println();

        fisher.fishing(salmon);
        System.out.println();

        fisher.fishing(snook);
        System.out.println();

        fisher.showFish();
    }
}
