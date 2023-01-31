package lets_grow_more;
import java.util.*;
public class Task2
{
		    static String[] blk;

		    static String turn;

		    static String checkWinner()
		    {
		        for (int a = 0; a < 8; a++) {

		            String line = null;

		            switch (a) {

		            case 0:
		                line = blk[0] + blk[1] + blk[2];
		                break;
		            case 1:

		                line = blk[3] + blk[4] + blk[5];

		                break;

		            case 2:

		                line = blk[6] + blk[7] + blk[8];

		                break;

		            case 3:

		                line = blk[0] + blk[3] + blk[6];

		                break;

		            case 4:

		                line = blk[1] + blk[4] + blk[7];

		                break;

		            case 5:

		                line = blk[2] + blk[5] + blk[8];

		                break;

		            case 6:

		                line = blk[0] + blk[4] + blk[8];

		                break;

		            case 7:

		                line = blk[2] + blk[4] + blk[6];

		                break;

		            }

		            //For X winner

		            if (line.equals("XXX")) {

		                return "X";

		            }

		            // For O winner

		            else if (line.equals("OOO")) {

		                return "O";

		            }

		        }

		        for (int a = 0; a < 9; a++) {

		            if (Arrays.asList(blk).contains( String.valueOf(a + 1))) {

		                break;

		            }

		            else if (a == 8) {

		                return "draw";

		            }

		        }
		 
		       // To enter the X Or O at the exact place on blk.

		        System.out.println(

		            turn + "'s turn; enter to replace slot number  "  + turn + " in:");

		        return null;

		    }
		   
		    static void printblk()

		    {

		        System.out.println("|---|---|---|");

		        System.out.println("| " + blk[0] + " | "+ blk[1] + " | " + blk[2]  + " |");

		        System.out.println("|-----------|");

		        System.out.println("| " + blk[3] + " | " + blk[4] + " | " + blk[5] + " |");

		        System.out.println("|-----------|");

		        System.out.println("| " + blk[6] + " | " + blk[7] + " | " + blk[8] + " |");

		        System.out.println("|---|---|---|");

		    }
		 

		    public static void main(String[] args)

		    {

		        Scanner in = new Scanner(System.in);

		        blk = new String[9];

		        turn = "X";

		        String winner = null;
		 

		        for (int a = 0; a < 9; a++) {

		            blk[a] = String.valueOf(a + 1);

		        }
		        System.out.println("Welcome to play Tic Tac Toe.");

		        printblk();
		 

		        System.out.println("X will player 1. Enter slot num to place X in:");
		 
		        while (winner == null) {

		            int numInput;
		           
		           // Exception handling.
		           // numInput will take input from user like from 1 to 9.
		           // If it is not in range from 1 to 9.
		           // then it will show you an error "Invalid input."

		            try {

		                numInput = in.nextInt();

		                if (!(numInput > 0 && numInput <= 9)) {

		                    System.out.println("Nodefined Number ; choose another number : ");

		                    continue;

		                }

		            }

		            catch (InputMismatchException e) {

		                System.out.println("Notdefined Num ; choose another num:");

		                continue;

		            }

		 
		            if (blk[numInput - 1].equals(

		                    String.valueOf(numInput))) {

		                blk[numInput - 1] = turn;

		                if (turn.equals("X")) {

		                    turn = "O";

		                }

		                else {

		                    turn = "X";

		                }
		 
		                printblk();

		                winner = checkWinner();
		            }

		            else {
		                
		                System.out.println("Slot already taken; re-enter slot number:");
		            }

		        }
		        
		       
		        if (winner.equalsIgnoreCase("draw")) {

		            System.out.println("OOPS! It's draw! Thanks for playing.");
		        }
		       

		        else {

		            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		        }

		      in.close();

		    }
}


