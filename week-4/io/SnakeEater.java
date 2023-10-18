/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class SnakeEater {
    public static void main(String[] args) {
        StdOut.print("Enter the string : ");
        String code = StdIn.readString();
        String cyper = "SnakeEater";
        // String newCode = "";
        StdOut.println((char) (code.charAt(1) + cyper.charAt(1)));
    }
}
