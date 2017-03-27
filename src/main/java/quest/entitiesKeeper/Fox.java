package quest.entitiesKeeper;

import quest.strategiesKeeper.GunStrategy;

/**
 * Class for show Fox objects.
 *
 */
public class Fox extends Entity {

    /** Beginner health. */
    private static final int STARTHEALTH = 20;

    /**
     * Constructor.Create and initialize instance of class by values.
     */
    public Fox() {
        setName("Fox");
        setIsHero(false);
        setHealth(STARTHEALTH);
        setStrategy(new GunStrategy());
        welcom();
    }

}

