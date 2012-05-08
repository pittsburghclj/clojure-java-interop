package com.benizi.interop;
import java.util.Map;

public class Simple {

  public Simple() {
    this(3);
  }
  public Simple(int guesstimate) {
    this.approximatePi = guesstimate;
  }

  public int approximatePi() { return 3; }
  public int approximatePi;

  public void giveYou(String first, String second) {
    System.out.print("I'll give you ");
    System.out.print(first);
    System.out.print(" ");
    System.out.println(second);
  }

  public void judgeCloseness(Map<String,Integer> testmap) {
    for (String k : testmap.keySet()) {
      System.out.print("[");
      System.out.print(k);
      System.out.print("]=");
      System.out.println(Math.abs(approximatePi - testmap.get(k)));
    }
  }

  public class Inner {
    public static final int someValue = 42;
  }
}
