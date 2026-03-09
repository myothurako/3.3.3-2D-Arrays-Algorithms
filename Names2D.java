/*
 * Activity 3.3.3
*/
public class Names2D
{
  public static void main(String[] args)
  {
    String[][] names = {{"Ari", "Avery", "Ash", "Aman"},
                        {"Brynn", "Bodie", "Bo", "Barrie"},
                        {"Cris", "Carter", "Cali", "Ari"}};
    
    //loop through 2d array, copy it
    //if 2d array is equals to copy
    //duplicate found
    //else
    //duplicate not found
public boolean hasDuplicate(String[][] names){
    for (String[] row : names){
        for (String n : row){
            for (String[] row2 : names){
                for (String n2 : row2){
                    if (n.equals(n2)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
    }
}
    System.out.print("Determine if there are duplicate names:" + hasDuplicate());
    System.out.println("\nAccess consecutive pairs of elements in each row:");
    
    
    System.out.println("\nReverse the order of the elements in second column:");
    
    
    System.out.println("\nShift an element in a row: Shift the first name in the first row left to the last name in the row:");
   
   
    System.out.println("\nShift an element in a column: Shift the last name in the first row down to the last row:");
   


}
}