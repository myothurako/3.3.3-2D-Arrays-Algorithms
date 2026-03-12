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

    System.out.print("Determine if there are duplicate names: " + Names2D.hasDuplicate(names));

    System.out.println("\nAccess consecutive pairs of elements in each row:"); 
    consecutivePairs(names);
    
    System.out.println("\nReverse the order of the elements in second column:");
    reverseSecondColumn(names);
    
    System.out.println("\nShift an element in a row: Shift the first name in the first row left to the last name in the row:");
   shiftFirstRow(names);
   
    System.out.println("\nShift an element in a column: Shift the last name in the first row down to the last row:");
    Names2D.shiftColumnDown(names);
  }

  public static void printArray(String[][] names){
    for (int r = 0; r < names.length; r++){
        for (int c = 0; c < names[r].length; c++){
            System.out.print(names[r][c] + " ");
        }
        System.out.println();
    }
}

    //loop through 2d array, copy it
    //if 2d array is equals to copy
    //duplicate found
    //else
    //duplicate not found
public static boolean hasDuplicate(String[][] names){
    for (int r1 = 0; r1 < names.length; r1++){
        for (int c1 = 0; c1 < names[r1].length; c1++){
            
            for (int r2 = r1; r2 < names.length; r2++){
                for (int c2 = 0; c2 < names[r2].length; c2++){
                    
                    if (r1 == r2 && c2 <= c1){
                        continue;
                    }
                    
                    if (names[r1][c1].equals(names[r2][c2])){
                        return true;
                    }
                }
            }
        }
    }
    return false;
}

//loop through and then print out the names but at c, add one
public static void consecutivePairs(String[][] names){
for (int r = 0; r < names.length; r++){
    for (int c = 0; c < names[r].length - 1; c++){
        System.out.println(names[r][c] + " , " + names[r][c + 1]);
    }
}
}
// swap first and last element
// move inward
// repeat until middle reached
public static void reverseSecondColumn(String[][] names){
    int col = 1;
    
    int top = 0;
    int bottom = names.length - 1;
    
    while (top < bottom){
        String temp = names[top][col];
        names[top][col] = names[bottom][col];
        names[bottom][col] = temp;
        
        top++;
        bottom--;
    }
    printArray(names);
}

// save first element
// shift all elements left by one
// place saved element at last index

public static void shiftFirstRow(String[][] names){

    String temp = names[0][0];

    for (int c = 0; c < names[0].length - 1; c++){
        names[0][c] = names[0][c + 1];
    }

    names[0][names[0].length - 1] = temp;

    printArray(names);
}

// set column = last column index
// save first row value

// for each row except last
//     move next row value up
// end loop

// place saved value in last row


public static void shiftColumnDown(String[][] names){

    int col = names[0].length - 1;

    String temp = names[0][col];

    for (int r = 0; r < names.length - 1; r++){
        names[r][col] = names[r + 1][col];
    }

    names[names.length - 1][col] = temp;

    printArray(names);
}
}
