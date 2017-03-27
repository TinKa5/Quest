package quest.fight;

import quest.entitiesKeeper.Entity;
import quest.strategiesKeeper.Strategy;

/**
 * Listen result of battle from FightCreator class. If hero win he take
 * weapon his adversary
 *
 */

public class ChangerWeapon implements Observer {

  /**
   * For hero change value property "strategy" as his enemy value if hero win.
   * @param hero hero
   * @param enemy enemy
   * @param result
   *          result battle, element enum Result
   */
   // @Override
  public final void onNotify(final Entity hero, final Entity enemy,
          final Result result) {
    if ((hero.getIsHero()) && (result == Result.WIN)) {
      Class<?> c = enemy.getStrategy().getClass();
      try {
        Object obj = c.newInstance();
        hero.setStrategy((Strategy) obj);
      } catch (Exception  e) {
        e.printStackTrace();

      }

    }
  }

}
