package quest.entitiesKeeper;


import quest.strategiesKeeper.GunStrategy;

/**
 * Class for show Chicken objects.
 *
 */
public class Chicken extends Entity {
    /** Beginner health. */
    private static final int STARTHEALTH = 20;

    /**
     * Constructor.Create and initialize instance of class by values.
     */
    public Chicken() {
        setName("Space Chicken");
        setIsHero(true);
        setHealth(STARTHEALTH);
        setStrategy(new GunStrategy());
        welcom();
    }

}
