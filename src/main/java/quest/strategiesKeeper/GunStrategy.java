package quest.strategiesKeeper;

import java.util.Random;

import quest.entitiesKeeper.Entity;
/**
 * Strategy for gun attack.
 */
public class GunStrategy extends Strategy {
    /** Up border of value for strike. */
    private static final int UPRANDOM = 10;

    /**
     * Constructor.
     */
  public GunStrategy() {
    setName("Gun");
  }

  @Override
  /**
   * Attack based random values with using Random class.
   * @param enemy
   *            enemy
   */
  public final String attack(final Entity enemy) {
    int health = new Random().nextInt(UPRANDOM);
    enemy.setHealth(enemy.getHealth() - health);
    return (" shoot by " + health + " points");
  }

}
