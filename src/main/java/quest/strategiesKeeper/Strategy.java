package quest.strategiesKeeper;

import quest.entitiesKeeper.Entity;

/**
 * It is superclass for classes which describe concrete strategies of attack.
 *
 */
public abstract class Strategy {
  /**
   * Name strategy.
   */
 private String name;

  /**
   * Describe strategy or attack.
   * @param enemy
   *          enemy
   * @return String - result attack
   */
  public abstract String attack(Entity enemy);
 /**Name setter.
   * @param nameStrategy Name strategy
   */
  public final void setName(final String nameStrategy) {
      name = nameStrategy;
  }
  /**Name getter.
   * @return Name strategy
   */
  public final String getName() {
      return name;
  }
  }
