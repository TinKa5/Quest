package quest.entitiesKeeper;

import quest.strategiesKeeper.BoxingStrategy;

/**
 * Class for show Wolf objects.
 *
 */
public class Kolobok extends Entity {

    /** Beginner health. */
    private static final int STARTHEALTH = 200;

    /**
     * Constructor.Create and initialize instance of class by values.
     */

    public Kolobok() {
        setName("Kolobok");
        setIsHero(true);
        setHealth(STARTHEALTH);
        setStrategy(new BoxingStrategy());
        welcom();
    }

}
