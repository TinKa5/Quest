package quest.physics;

import java.util.Scanner;

import quest.entitiesKeeper.Entity;
import quest.entitiesKeeper.EntityCreator;
import quest.fight.FightCreator;
import quest.fight.Result;

/**
 * Main class. Contain dialog and physics mover
 *
 */
public final class MainGame {

    /** Long pause length. */
    private static final int LONGSLEEP = 2000;
    /** Short pause length. */
    private static final int SHORTSLEEP = 500;

    /** won't be called. */
    private MainGame() {
    }

    /**
     * Main method.
     * @param args
     *            system variables
     */
    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("***Quest for children**");
        System.out.println("Choose your hero");
        System.out.println("Kolobok-'k',Space chicken-'c'");
        Button button;
        try {
            button = (Button) Button.valueOf(Button.class, in.next());
        } catch (RuntimeException e) {
            System.out.println("Incorrect input");
            ThreadHenler.sleep(SHORTSLEEP);
            return;
        }

        Entity body = EntityCreator.create(button);

        ThreadHenler.sleep(SHORTSLEEP);
        System.out.println("It is time to go...");
        ThreadHenler.sleep(LONGSLEEP);
        System.out.println("3 days and nights you're on the way....");
        ThreadHenler.sleep(LONGSLEEP);
        System.out.println();
        System.out.println("Time is ripe for first trial");
        System.out.println();
        System.out.println("on the right walk-meet Fox -'f'......"
                + "on the left walk-fight with Wolf-'w'");

        System.out.println("Choose the way, " + body.getName());

        try {
            button = (Button) Button.valueOf(Button.class, in.next());
        } catch (RuntimeException e) {
            System.out.println("Incorrect input");
            ThreadHenler.sleep(SHORTSLEEP);
            return;
        }

        Entity enemy = EntityCreator.create(button);

        System.out.println();
        ThreadHenler.sleep(LONGSLEEP);

        if (new FightCreator().fight(body, enemy) == Result.WIN) {
            System.out.println();
            System.out.println("Congratulate!! You pass this test!");
            System.out
                    .println(body.getStrategy().getName() + " your weapon now");
        } else {
            System.out.println();
            System.out.println("You lose. The end!!");
            return;
        }

        System.out.println();
        ThreadHenler.sleep(SHORTSLEEP);
        System.out.println("It is time to go...");
        ThreadHenler.sleep(LONGSLEEP);
        System.out.println("3 days and nights you're on the way....");
        ThreadHenler.sleep(LONGSLEEP);
        System.out.println();
        System.out.println("Time is ripe for first trial");
        System.out.println();
        System.out.println("on the right walk-meet Bear -'b'......"
                + "on the left walk-fight with Wolf-'w'");

        System.out.println("Choose the way, " + body.getName());

        try {
            button = (Button) Button.valueOf(Button.class, in.next());
        } catch (RuntimeException e) {
            System.out.println("Incorrect input");
            ThreadHenler.sleep(SHORTSLEEP);
            return;
        }

        enemy = EntityCreator.create(button);

        System.out.println();
        ThreadHenler.sleep(LONGSLEEP);

        if (new FightCreator().fight(body, enemy) == Result.WIN) {
            System.out.println();
            System.out.println("Congratulate!! You pass this test!");
            System.out
                    .println(body.getStrategy().getName() + " your weapon now");
        } else {
            System.out.println();
            System.out.println("You lose. The end!!");
            return;
        }

        System.out.println();
        ThreadHenler.sleep(LONGSLEEP);
        System.out.println(
                "It is time to go...!!You should win a victory over Dragon ");
        ThreadHenler.sleep(SHORTSLEEP);
        System.out.println("3 days and nights you're on the way....");
        ThreadHenler.sleep(SHORTSLEEP);
        System.out.println();

        enemy = EntityCreator.create(Button.d);

        ThreadHenler.sleep(LONGSLEEP);
        System.out.println();

        if (new FightCreator().fight(body, enemy) == Result.WIN) {
            System.out.println();
            System.out.println("Congratulate!! You pass this test!");

        } else {
            System.out.println();
            System.out.println("You lose. The end!!");
            return;
        }

        System.out.println();
        System.out.println("Game over");
    }

}
