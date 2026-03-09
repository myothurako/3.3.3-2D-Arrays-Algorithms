/*
 * Activity 3.3.3
*/
public class Numbers2D
{
  public static void main(String[] args)
  {
    int[][] numbers = { {1,5,3,8,-3,0,3},
                      {4,4,8,0,3,-1,1}, 
                      {0,3,8,4,-2,7, 6} };


    int sum = 0;
    int count = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int negCount = 0;
    for (int[] row : numbers)
    {
        for (int value : row){
        sum += value;
        count++;
        if (value < min) 
            {
                min = value;
            }
        if (value > max)
            {
                max = value;
            }
        if (value < 0) 
            {
                negCount++;
            }
    }
  }
  double average = (double) sum/count; 

  System.out.println("SUM: " + sum);
  System.out.println("AVERAGE: " + average);
  System.out.println("MIN VALUE: " + min);
  System.out.println("MAX VALUE: " + max);
  System.out.println("COUNT OF (-) NUMBERS: " + negCount);
}
}
