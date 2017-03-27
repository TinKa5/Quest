package quest.strategiesKeeper;

import java.util.Random;

import quest.entitiesKeeper.Entity;
/**
 * Strategy for fire attack.
 */
public class FireStrategy extends Strategy {
    /** Up border of value for strike. */
    private static final int UPRANDOM = 20;

    /**
     * Constructor.
     */
  public FireStrategy() {
    setName("Fire");
  }

  @Override
  /**
   * Attack based random values with using Random class.
   * @param enemy
   *            enemy
   */
  public final String attack(final Entity enemy) {
    int health = new Random().nextInt(UPRANDOM) + UPRANDOM;
    enemy.setHealth(enemy.getHealth() - health);
    return (" fire attack by " + health + " points");
  }

}
