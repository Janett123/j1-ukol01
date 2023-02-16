package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        nakresliPrasatko(zofka);
    }

    private static void nakresliPrasatko(Turtle zofka) {
        nakresliCtverec(zofka);

        nakresliStrechu(zofka);

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

    private static void nakresliStrechu(Turtle zofka) {
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
