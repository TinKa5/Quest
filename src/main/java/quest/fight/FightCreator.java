package quest.fight;

import java.util.ArrayList;

import quest.entitiesKeeper.Entity;
import quest.sound.Sound;

/**
 * Imitation battle.
 *
 */
public class FightCreator {
  /**
   * Array listeners by result battle.
   */
  private static ArrayList<Observer> observers;

  /**
   * Imitation battle. Adversaries attack each other
   * @param player1
   *          player1
   * @param player2
   *          player2
   * @return Result battle. Element enum Result WIN or LOSE
   */
  public final Result fight(final Entity player1, final Entity player2) {

    observers = new ArrayList<Observer>();
    observers.add(new ChangerWeapon());
    observers.add(new Sound());

    while (true) {

      player2.attack(player1);

      if (player1.getHealth() < 0) {
        if (player1.getIsHero()) {

          notify(player1, player2, Result.LOSE);
          return Result.LOSE;
        } else {
          notify(player2, player1, Result.WIN);
          return Result.WIN;
        }
      }

      player1.attack(player2);

      if (player2.getHealth() < 0) {
        if (player2.getIsHero()) {
          notify(player2, player1, Result.LOSE);
          return Result.LOSE;
        } else {
          notify(player1, player2, Result.WIN);
          return Result.WIN;
        }
      }

    }

  }

  /**Information all observers about fight over.
   * @param hero hero
   * @param enemy enemy
   * @param result result
   */
  private void notify(final Entity hero, final Entity enemy,
          final Result result) {
    for (Observer element : observers) {
      element.onNotify(hero, enemy, result);
    }
  }
}
