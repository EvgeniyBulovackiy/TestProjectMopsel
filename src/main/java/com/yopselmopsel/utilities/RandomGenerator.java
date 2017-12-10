package com.yopselmopsel.utilities;

import java.util.Random;

/**
 * Class for random generating
 */
public class RandomGenerator {

  /**
   * Generates a random {@link Integer} with the specified minimum and maximum value.
   * @param min - minimum generated value.
   * @param max - maximum generated value.
   * @return random {@link Integer}.
   */
  public static int generateRandom(int min, int max){
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
  }
}
