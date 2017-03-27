package quest.entitiesKeeper;

import quest.strategiesKeeper.Strategy;

/**
 * It is superclass for all entity in the game.
 *
 */
public class Entity {

    /** Name entity. */
    private String name;
    /** current health. */
    private int health;
    /** marker of hero. */
    private boolean isHero;
    /** current strategy. */
    private Strategy strategy;

    /**
     * Imitate one attack by strategy which saved in property "strategy".
     * @param enemy
     *            show who is attacked
     */
    public final void attack(final Entity enemy) {
        System.out.print("**" + this.name + strategy.attack(enemy));
    }

    /**
     * Output greeting appropriate entity.
     */
    public final void welcom() {
        String s;
        if (isHero) {
            s = "Hello! I'm " + name + ". And I'll be your hero now";
        } else {
            s = "Hello! I'm " + name
                    + ". And i want to kill and eat you for dinner ";
        }
        System.out.println(s);
    }

    /**
     * Name getter.
     * @return name
     */
    public final String getName() {
        return name;
    }

    /**
     * Name setter.
     * @param nameEntity
     *            is name entity
     */
    public final void setName(final String nameEntity) {
        name = nameEntity;
    }

    /**
     * Health getter.
     * @return current health
     */
    public final int getHealth() {
        return health;
    }

    /**
     * Health setter.
     * @param newhealth
     *            is current health value
     */
    public final void setHealth(final int newhealth) {
        this.health = newhealth;
    }

    /**
     * IsHero getter.
     * @return is it hero
     */
    public final boolean getIsHero() {
        return isHero;
    }

    /**
     * IsHero setter.
     * @param isHeroEntity
     *            is marker hero
     */
    public final void setIsHero(final boolean isHeroEntity) {
        isHero = isHeroEntity;
    }

    /**
     * Strategy setter.
     * @param strategyEntity
     *            is current strategy of attack.
     */
    public final void setStrategy(final Strategy strategyEntity) {
        strategy = strategyEntity;
    }

    /**
     * Strategy getter.
     * @return current strategy
     */
    public final Strategy getStrategy() {
        return strategy;
    }

}
