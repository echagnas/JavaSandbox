import adventure.Personnage;
import adventure.implementations.Chevalier;
import adventure.implementations.Reine;
import adventure.implementations.Roi;
import adventure.implementations.Troll;
import canard.Canard;
import canard.behaviors.vol.implementations.PropulsionAReaction;
import canard.implementations.Colvert;
import canard.implementations.PrototypeCanard;
import gui.Board;
import inputstreamdecorator.MinusInputStream;
import meteo.Meteo;
import starbuzz.Boisson;
import starbuzz.boissons.Espresso;
import starbuzz.ingredients.Chantilly;
import starbuzz.ingredients.Chocolat;

import java.io.*;

public class Simulator {
    public static void main(String[] args) {
        //exampleStrategyPattern();
        //exampleStrategyPattern2();
        //exampleObserverPattern();
        //exampleGui();
        //exampleDecoratorStrategy();
        exampleDecoratorStrategy2();
    }

    static void exampleStrategyPattern() {
        System.out.println("========= STRATEGY PATTERN =============");
        Canard colvert = new Colvert();
        colvert.afficher();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        System.out.println("-------------------------");

        Canard proto = new PrototypeCanard();
        proto.afficher();
        proto.effectuerCancan();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        System.out.println("mais maintenant...");
        proto.effectuerVol();

        System.out.println("-------------------------");
    }

    static void exampleStrategyPattern2() {
        System.out.println("========= STRATEGY PATTERN 2 ===========");
        Personnage roi = new Roi();
        Personnage reine = new Reine();
        Personnage chevalier = new Chevalier();
        Personnage troll = new Troll();

        System.out.println("--------- ROI -------------");
        roi.combattre();
        System.out.println("--------- REINE -----------");
        reine.combattre();
        System.out.println("--------- CHEVALIER -------");
        chevalier.combattre();
        System.out.println("--------- TROLL -----------");
        troll.combattre();
    }

    static void exampleObserverPattern() {
        System.out.println("========= OBSERVER PATTERN =============");
        Meteo meteo = new Meteo();
        meteo.addObserver((o, arg) -> {
            System.out.println("Nouvelle température :"+arg);
        });
        meteo.setTemperature(23);
        meteo.setTemperature(24);
    }

    static void exampleGui() {
        System.out.println("========= EXAMPLE GUI ==================");
        Board.main(null);
    }

    static void exampleDecoratorStrategy() {
        System.out.println("========= DECORATOR STRATEGY ===========");
        Boisson espresso = new Espresso();
        espresso = new Chocolat(espresso);
        espresso = new Chocolat(espresso);
        espresso = new Chantilly(espresso);
        System.out.println("Boisson : "+espresso.getDescription()+" => "+espresso.cout()+" €");
    }

    static void exampleDecoratorStrategy2() {
        System.out.println("========= DECORATOR STRATEGY 2 ==========");
        int c;
        try {
            InputStream in = new MinusInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while((c = in.read()) > 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

