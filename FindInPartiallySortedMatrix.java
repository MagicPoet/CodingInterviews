/**
 * Created by use
 * r on 2017/3/16.
 */
public class FindInPartiallySortedMatrix {
     static boolean Find (int[]matrix,int rows, int columns, int numbers) {
        boolean found = false;
        if( matrix != null && rows > 0 && columns > 0 ) {
            int row = 0;
            int column = columns - 1;
            while(row < rows && column > 0) {
                if(matrix[row * columns + column] == numbers ) {
                    found = true;
                    break;
                }
                else if(numbers < matrix[row * columns + column]) {
                    column--;
                } else {
                    row++;
                }
            }
        }
        return found;
    }

    public static void main(String args[]) {
        int[] array = {1,2,8,9,2,4,9,12,4,7,10,13,6,8,11,15};
        System.out.println(Find(array,4,4,8));
    }
}
