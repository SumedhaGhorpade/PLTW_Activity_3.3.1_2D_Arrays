package step15;

/*
 * Activity 3.3.1
 */
public class InitList2D
{
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 
    
    for (int r = 0; r < 4; r++)
    {
      for (int c = 0; c < 2; c++)
      {
        System.out.println(board[r][c]);
      }
    }
  }
}