package quest.sound;

import java.awt.Toolkit;

import quest.fight.Result;

/**
 * Realization interface Runnable for class listener Sound.
 */
class SoundRunnable implements Runnable {
    /** Fight result. */
    private final Result result;

    /**
     * Constructor.
     * @param resultFight
     *            Fight result
     */
    SoundRunnable(final Result resultFight) {
        this.result = resultFight;
    }

    /** Play sound in new string. */
    public void run() {

        if (result == Result.WIN) {

            Toolkit.getDefaultToolkit().beep();
        }

        if (result == Result.LOSE) {
            Toolkit.getDefaultToolkit().beep();
            Toolkit.getDefaultToolkit().beep();

        }
    }

}
