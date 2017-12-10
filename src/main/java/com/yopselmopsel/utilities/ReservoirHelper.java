package com.yopselmopsel.utilities;

/**
 * Class for working with reservoir
 */
public class ReservoirHelper {
  private final static int BUCKET_1L = 1;
  private final static int BUCKET_2L = 2;
  private final static int BUCKET_5L = 5;
  private final static int BUCKET_10L = 10;

  /**
   * Gets the number of existing ways to filling the reservoir with all buckets help.
   * @param reservoirVolume - volume of reservoir.
   * @return - number of existing ways in {@link Integer}.
   */
  public int getAllMethodsOfPouringWithAllBuckets(int reservoirVolume){
    int count = 0;

    int reservoirFor1L = 0;
    while (reservoirFor1L < reservoirVolume){

      int reservoirFor2L = reservoirFor1L;
      while (reservoirFor2L < reservoirVolume){

        int reservoirFor5L = reservoirFor2L;
        while (reservoirFor5L < reservoirVolume){

          int reservoirFor10L = reservoirFor5L;
          while (reservoirFor10L < reservoirVolume){

            reservoirFor10L = reservoirFor10L + BUCKET_10L;
            if (reservoirFor10L == reservoirVolume){
              count++;
            }
          }

          reservoirFor5L = reservoirFor5L + BUCKET_5L;
          if (reservoirFor5L == reservoirVolume){
            count++;
          }
        }

        reservoirFor2L = reservoirFor2L + BUCKET_2L;
        if (reservoirFor2L == reservoirVolume){
          count++;
        }
      }

      reservoirFor1L = reservoirFor1L + BUCKET_1L;
      if (reservoirFor1L == reservoirVolume){
        count++;
      }
    }

    return count;
  }
}

