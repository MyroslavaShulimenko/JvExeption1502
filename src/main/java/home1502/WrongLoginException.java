package home1502;

public class WrongLoginException extends Throwable {
    public WrongLoginException(String wrong_login) {
        super(wrong_login);
    }

   /* public static void main (String[] args) {

        try {

            throw new WrongLoginException("Invalid Login Credentials");

        } catch (WrongLoginException wle) {

            System.out.println("Error: " + wle);   // print out the error message.

        } finally {

            System.out.println("Program Terminated");   // print out that program is terminated after catch block is executed.

        }   // end of try-catch-finally block.*/

    }  // end of main method.