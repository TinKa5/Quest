package quest.entitiesKeeper;

import quest.strategiesKeeper.GunStrategy;

/**
 * Class for show Dragon objects.
 *
 */
public class Wolf extends Entity {
    /** Beginner health. */
    private static final int STARTHEALTH = 12;

    /**
     * Constructor.Create and initialize instance of class by values.
     */
    public Wolf() {
        setName("Wolf");
        setIsHero(false);
        setHealth(STARTHEALTH);
        setStrategy(new GunStrategy());
        welcom();

    }

}
