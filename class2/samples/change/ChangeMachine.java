import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChangeMachine {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter an amount of money:");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cents = Integer.valueOf(bufferedReader.readLine());
        System.out.println("You entered " + cents + " cents.");

        //TODO: Make Change!

    }

}
