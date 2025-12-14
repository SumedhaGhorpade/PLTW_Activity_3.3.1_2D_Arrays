package step14;

import java.util.Arrays;


/*
 * Activity 3.3.1
 */
public class InitList2D {
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 

    for (int r = 0; r < 4; r++) {
      System.out.println(Arrays.toString(board[r])); // show object references
    }

 }
}