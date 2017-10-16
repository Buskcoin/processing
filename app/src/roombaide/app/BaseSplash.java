package roombaide.app;

import java.io.File;

import roombaide.app.ui.SplashWindow;
import roombaide.app.ui.Toolkit;


public class BaseSplash {
  static public void main(String[] args) {
    try {
      final boolean hidpi = Toolkit.highResImages();
      final String filename = "lib/about-" + (hidpi ? 2 : 1) + "x.png";
      File splashFile = Platform.getContentFile(filename);
      SplashWindow.splash(splashFile.toURI().toURL(), hidpi);
      SplashWindow.invokeMain("roombaide.app.Base", args);
      SplashWindow.disposeSplash();
    } catch (Exception e) {
      e.printStackTrace();
      // !@#!@$$! umm
      //SplashWindow.invokeMain("roombaide.app.Base", args);
    }
  }
}