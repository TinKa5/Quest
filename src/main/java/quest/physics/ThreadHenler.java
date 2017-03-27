package quest.physics;

/**
 * For take away handling from main class.
 *
 */
public final class ThreadHenler {
    /** won't be called.*/
    private ThreadHenler() {
}
/**Pause generator.
 * @param time pause length */
  public static void sleep(final long time) {
    try {
      Thread.sleep(time);
      } catch (InterruptedException e) {
      System.out.println("Ошибка Thread.sleep!!");
    }

  }

}

