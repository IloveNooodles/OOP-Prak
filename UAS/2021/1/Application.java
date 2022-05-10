public class Application {
  private Window window;

  public Application(Window window) {
    this.window = window;
  }

  public void run() {
    this.window.draw();
  }
}
