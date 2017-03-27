package quest.entitiesKeeper;
import quest.strategiesKeeper.BoxingStrategy;

/**
 * Class for show Bear objects.
 *
 */
public class Bear extends Entity {
    /** Beginner health. */
    private static final int STARTHEALTH = 20;

    /**
     * Constructor.Create and initialize instance of class by values.
     */
    public Bear() {
        setName("Bear");
        setIsHero(false);
        setHealth(STARTHEALTH);
        setStrategy(new BoxingStrategy());
        welcom();
    }
}
