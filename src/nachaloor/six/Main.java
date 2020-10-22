/*
Rohit Nachaloor
AP CSA
10/13/2020
*/

package nachaloor.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //connects to database and starts up the menu of the program
        DatabaseConnection.connect();
        System.out.println("Do you want to: ");
        System.out.println("1. Check your grades");
        System.out.println("2. Add a grade to the grade book");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (Integer.parseInt(reader.readLine()) == 1)  {
            gradesCheck();
        } else {
            addGrades();
        }
    }
}
