package RPG;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Personajes
        var warrior = new Warrior("Rex", 25, 125);
        var finalBoss = new FinalBoss("Gwyn", 15, 200);

        System.out.println("EQUIPO");
        warrior.characterInfo();
        System.out.println();

        System.out.println("JEFE");
        finalBoss.characterInfo();
        System.out.println();

        System.out.println("RONDA 1");
        warrior.basicAttack(finalBoss);
        finalBoss.characterStatus();
        System.out.println();

        System.out.println("RONDA 2");
        warrior.receiveDamage(15);
        warrior.characterStatus();
        System.out.println();

        System.out.println("RONDA 3");
        warrior.justiceStrike(finalBoss);
        finalBoss.characterStatus();
        System.out.println();

        System.out.println("RONDA 4");
        finalBoss.poisoning(warrior);
        warrior.characterStatus();
        System.out.println();

        System.out.println("RONDA 5");
        warrior.justiceStrike(finalBoss);
        finalBoss.pasivePoisoning(warrior); // PRIMER TURNO
        finalBoss.characterStatus();
        System.out.println();

        System.out.println("RONDA 6");
        finalBoss.pasivePoisoning(warrior); // SEGUNDO TURNO
        warrior.receiveDamage(75);
        warrior.characterStatus();
        System.out.println();

        System.out.println("RONDA 7");
        finalBoss.pasivePoisoning(warrior); // TERCER Y ULTIMO TURNO
        warrior.justiceStrike(finalBoss);
        finalBoss.characterStatus();
        System.out.println();

        System.out.println("RONDA 8");
        finalBoss.basicAttack(warrior);
        warrior.characterStatus();
        System.out.println();

        System.out.println("RONDA 9");
        warrior.justiceStrike(finalBoss);
        finalBoss.characterStatus();
    }
}
