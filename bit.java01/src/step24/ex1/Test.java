package step24.ex1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class Test {
  static ArrayList<String> classnames = new ArrayList<>();
  
  public static void main(String[] args) throws Exception {
    File file = new File("./bin");
    displayFilename(file);
  }

  private static void displayFilename(File dir) {
    if (!dir.isDirectory()) {
      return;
    }
    
    File[] files = dir.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        if (pathname.isDirectory())
          return true;
        if (pathname.getName().endsWith(".class") && !pathname.getName().contains("$"))
          return true;
        return false;
      }
    });
    
    for (File file : files) {
      if (file.isDirectory()) {
        displayFilename(file);
      } else {
        String path = file.getAbsolutePath().replaceAll("\\\\", "/")
                                            .replaceAll(".class", "");
        int pos = path.indexOf("./bin/");
        //classnames.add(path.substring(pos + 6).replaceAll("/", "."));
        System.out.println(path.substring(pos + 6).replaceAll("/", "."));
      }
    }
  }
  
  

}






