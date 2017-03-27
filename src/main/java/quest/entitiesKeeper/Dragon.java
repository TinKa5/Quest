package quest.entitiesKeeper;

import quest.strategiesKeeper.FireStrategy;

/**
 * Class for show Dragon objects.
 *
 */
public class Dragon extends Entity {
    /** Beginner health. */
    private static final int STARTHEALTH = 10;

    /**
     * Constructor.Create and initialize instance of class by values.
     */
    public Dragon() {
        setName("Dragon");
        setIsHero(false);
        setHealth(STARTHEALTH);
        setStrategy(new FireStrategy());
        welcom();
    }

}
