package com.yopselmopsel;

import com.yopselmopsel.utilities.ReservoirHelper;
import com.yopselmopsel.utilities.RandomGenerator;

public class Main {

  public static void main(String[] args) {
    int reservoir = RandomGenerator.generateRandom(10, 200);
    ReservoirHelper executor = new ReservoirHelper();
    int methods = executor.getAllMethodsOfPouringWithAllBuckets(reservoir);

    System.out.println(String.format("If reservoir will be with volume %1s litre(s) then will needed %2s method(s) to pouring it",
      reservoir, methods));
  }
}
