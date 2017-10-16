import roombaide.core.PApplet;


// TODO This is code for testing; remove before final release

public class WriteSVG extends PApplet {

//  public String sketchRenderer() {
//    return "roombaide.svg.PGraphicsSVG";
//  }


//  public String sketchOutputPath() {
//    return "/Users/fry/Desktop/frame-####.svg";
//  }


  public void settings() {
    size(600, 400, SVG, desktopPath("frame-####.svg"));
//    frameRate(1);
  }

  public void roboLoop() {
    background(random(255));
    stroke(random(255));
    strokeWeight(20);
    line(random(width), random(height), random(width), random(height));
    if (frameCount == 5) exit();
//    exit();
  }

  static public void main(String[] args) {
    PApplet.main(new String[] { "WriteSVG" });
  }
}