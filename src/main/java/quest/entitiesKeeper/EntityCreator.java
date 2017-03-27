package quest.entitiesKeeper;

import quest.physics.Button;
/**
 * Creator entities.
 *
 */

public final class EntityCreator {
    /** won't be called.*/
    private EntityCreator() {
    }
   /**
     * Create entity.
     * @param button
     *            which input user
     * @return inheritors Entity class
     */
    public static Entity create(final Button button) {
        switch (button) {
        case k:
            return new Kolobok();
        case c:
            return new Chicken();
        case f:
            return new Fox();
        case w:
            return new Wolf();
        case b:
            return new Bear();
        case d:
            return new Dragon();

        default:
            return null;

        }
    }

}
