public class Picture implements Drawable {
  private String imageUrl;

  public Picture(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public void draw() {
    System.out.println("menggambar image dari " + imageUrl);
  }

}
