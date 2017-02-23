
/**
 *
 * @author bartmoelans
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
javac Main.java
java -Xrs -Xmx262144k Main
java -Xrs -Xmx262144k Main > output.txt
*/
public class Main {

    /**
     * Replace XXX with name of exercise
     */
    private static class XXX {

        /**
         * Functions to print debugging info during testing, before sending in,
         * comment body out
         *
         * @param s
         */
        private void myDebug(String s) {
            System.out.println("DEBUG: " + s);
        }

        private void myDebug(int[] array) {
            myDebug(array, "");
        }

        private void myDebug(int[] array, String indent) {
            String arrayString = "[";
            for (int i = 0; i < array.length; i++) {
                arrayString += i + "=>" + array[i] + "; ";
            }
            arrayString += "]";

            myDebug(indent + arrayString);
        }

        private void myDebug(int[][] matrix) {
            myDebug(matrix, "");
        }

        private void myDebug(int[][] matrix, String indent) {
            for (int rij = 0; rij < matrix.length; rij++) {
                String arrayString = "Rij " + rij + ": [";
                for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                    arrayString += kolom + "=>" + matrix[rij][kolom] + "; ";
                }
                arrayString += "]";
                myDebug(indent + arrayString);
            }
        }

        private void myDebug(char[][] matrix) {
            myDebug(matrix, "");
        }

        private void myDebug(char[][] matrix, String indent) {
            for (int rij = 0; rij < matrix.length; rij++) {
                String arrayString = "Rij " + rij + ": [";
                for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
                    arrayString += kolom + "=>" + matrix[rij][kolom] + "; ";
                }
                arrayString += "]";
                myDebug(indent + arrayString);
            }
        }

        //// END DEBUG CODE ///////////

        //// BEGING HELP FUNCTIONS ////
         private int[] toIntArray(String input, String split) {
            StringTokenizer st = new StringTokenizer(input, split);
            int[] output = new int[st.countTokens()];
            int i = 0;
            while (st.hasMoreTokens()) {
                output[i] = Integer.parseInt(st.nextToken());
                i++;
            }
            return output;
        }

        //// END HELP FUNCTIONS ////
        public XXX() {
        }

        /**
         * This function will read the input en write the output
         * @param sc 
         */
        private void parseInput(Scanner sc) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }

    /**
     * The first line is what you need for the game engine
     * The second line is for debugging purposes
     * 
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new java.io.File("...."));
        XXX oplosser;
        oplosser = new XXX();
        oplosser.parseInput(sc);
    }
}
