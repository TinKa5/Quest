package quest.fight;

import quest.entitiesKeeper.Entity;
/** Interface observers which watch fight over.
*/
public interface Observer {
   /**Handling of fight over in every observers.
    * @param hero hero
    * @param enemy enemy
    * @param result of fight for hero
    */
    void onNotify(Entity hero, Entity enemy, Result result);
}
