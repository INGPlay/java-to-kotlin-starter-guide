package com.lannstark.lec07;

import java.io.File;
import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
      JavaFilePrinter javaFilePrinter = new JavaFilePrinter();

      File file = new File(".");
      javaFilePrinter.readFile(file.getAbsolutePath() + "/a.txt");
  }

}
