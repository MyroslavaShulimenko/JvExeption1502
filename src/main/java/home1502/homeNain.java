package home1502;

public class homeNain {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(verifyLoginAndPassword("wer_11","qwe123","qwe123"));
        System.out.println(verifyLoginAndPassword("wer=11","qwe123","qwe123"));
     //   System.out.println(verifyLoginAndPassword("wer_11","qwe1211","qwe123"));
     //  System.out.println(verifyLoginAndPassword("wer_11","qwe1211","qwe1223"));

    }
    public static boolean verifyLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Wrong login");
        }

        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password");
        }


        return true;
    }
}
