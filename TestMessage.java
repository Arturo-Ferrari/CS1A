
public class TestMessage {
   public static void main(String [] args)
   {
      Message bob = new Message();
      Message joab = new Message("I've made a huge mistake", "Joab");
      String authormutate = "abba dabba doo dilly dally abel dober dabble diddle daddle babble boo";
      System.out.println(bob.toString());
      System.out.println(joab.toString());
      System.out.println("\rtesting Message accessors: " + "\n" + bob.getAuthor() + "\r" + bob.getMessage());
      System.out.println("\rtesting Message mutators: ");
      bob.setAuthor(authormutate);
      System.out.println(bob.toString());
      bob.setAuthor("Jorge");
      System.out.println(bob.toString());      
   }
}
