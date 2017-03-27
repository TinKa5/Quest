package quest.sound;

import quest.entitiesKeeper.Entity;
import quest.fight.Observer;
import quest.fight.Result;

/**
 * Listen result of battle from FightCreator class
 *  and do sound react. Do this in new stream. Use
 * SoundRunnable realization for Runnable
 */
public class Sound implements Observer {

  //@Override
    /**Start new stream for sound escort fight.
     * @param hero hero
     * @param enemy enemy
     * @param result fight result*/
  public final void onNotify(final Entity hero, final Entity enemy,
          final Result result) {

    Thread t = new Thread(new SoundRunnable(result));
    t.start();

  }

}

