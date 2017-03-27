package quest.strategiesKeeper;

import java.util.Random;

import quest.entitiesKeeper.Entity;

/**
 * Strategy for box attack.
 */
public class BoxingStrategy extends Strategy {
    /** Up border of value for strike. */
    private static final int UPRANDOM = 10;

    /**
     * Constructor.
     */
    public BoxingStrategy() {
        setName("Karate skill");
    }

    @Override
    /**
     * Attack based random values with using Random class.
     * @param enemy
     *            enemy
     */
    public final String attack(final Entity enemy) {

        int health = Math.floorDiv(new Random().nextInt(UPRANDOM), 2);
        enemy.setHealth(enemy.getHealth() - health);
        return (" strike by" + health + " pionts");
    }

}
