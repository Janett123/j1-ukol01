package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

    /*
        nakresliPrasatko(zofka);

        // posunutí doprava k nakreslení osmiúhelníku
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();

        nakresliOsmiuhelnik(zofka);

        // posunutí doprava k nakreslení osmiúhelníku
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();

        nakresliKruh(zofka);

        // posunutí doprava k nakreslení sluníčka
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        nakresliSlunicko(zofka);
        */


        //posun na kraj
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(500);
        zofka.penDown();
        zofka.turnRight(90);

        nakresliCtverec(zofka);

        zofka.turnLeft(90);

        nakresliStrechu(zofka);

        zofka.turnLeft(150);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(190);
        zofka.penDown();






    }

    private static void nakresliStrechu(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(100);
        }
    }


    private static void nakresliSlunicko(Turtle zofka) {
        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(30);         //kruh
            zofka.move(20);
            zofka.turnRight(90);        //paprsek
            zofka.move(20);
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(20);
            zofka.penDown();
            zofka.turnRight(90);        //zpět do původní polohy
        }
    }

    private static void nakresliKruh(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(20);
            zofka.move(20);
        }
    }

    private static void nakresliOsmiuhelnik(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.turnLeft(45);
            zofka.move(50);
        }
    }

    private static void nakresliPrasatko(Turtle zofka) {
        nakresliCtverec(zofka);

        nakresliHlavu(zofka);

        zofka.turnRight(105);

        nakresliNohu(zofka);

        // pohyb dozadu k dokreslení zadní nohy
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(135);
        zofka.move(100);            // je na konci čtverce
        zofka.turnRight(135);
        zofka.penDown();

        nakresliNohu(zofka);
    }

    private static void nakresliNohu(Turtle zofka) {
        zofka.move(30);             // kreslení nohy levá část
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(90);        //kreslení nohy pravá část
        zofka.penDown();
        zofka.move(30);
    }

    private static void nakresliHlavu(Turtle zofka) {
        for (int i = 0; i < 2; i++) {
            zofka.turnLeft(120);
            zofka.move(100);
        }
    }

    private static void nakresliCtverec(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(100);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
