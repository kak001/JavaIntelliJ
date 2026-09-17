package fish;

public class Main {
     public static void main(String[] args) {
        // Peces
         Tuna tuna = null;
         Salmon salmon = null;
         Snook snook = null;

         try {
             tuna = new Tuna("Atun Rojo", 20, 100, 15.2);
             tuna.info();
             tuna.sound();
         } catch (NullPointerException | IllegalArgumentException e) {
             ConsoleColors.message("Error: " + e.getMessage(), ConsoleColors.RED);
         } catch (Exception e) {
             ConsoleColors.message("Error inesperado: " + e.getMessage(), ConsoleColors.RED);
         }
         System.out.println();

         try {
             salmon = new Salmon(null, 4, 80, "Río Tólten");
             salmon.info();
             salmon.sound();
         } catch (NullPointerException | IllegalArgumentException e) {
             ConsoleColors.message("Error: " + e.getMessage(), ConsoleColors.RED);
         } catch (Exception e) {
             ConsoleColors.message("Error inesperado: " + e.getMessage(), ConsoleColors.RED);
         }
         System.out.println();

         try {
             snook = new Snook("Robalo Chileno", 17.5, 100, 1400);
             snook.info();
             snook.sound();
         } catch (NullPointerException | IllegalArgumentException e) {
             ConsoleColors.message("Error: " + e.getMessage(), ConsoleColors.RED);
         } catch (Exception e) {
             ConsoleColors.message("Error inesperado: " + e.getMessage(), ConsoleColors.RED);
         }
         System.out.println();

         // Pescador
         Fisher fisher = null;

         try {
             fisher = new Fisher("kako", 20 , "Chilena");

             fisher.fisherInfo();
             System.out.println();

             fisher.showFish();
             System.out.println();

             if (tuna != null) fisher.fishing(tuna);
             System.out.println();

             if (salmon != null) fisher.fishing(salmon);
             System.out.println();

             if (snook != null) fisher.fishing(snook);
             System.out.println();

             fisher.showFish();
         } catch (NullPointerException | IllegalArgumentException e) {
             ConsoleColors.message("Error: " + e.getMessage(), ConsoleColors.RED);
         } catch (Exception e) {
             ConsoleColors.message("Error inesperado: " + e.getMessage(), ConsoleColors.RED);
         }
     }
}
