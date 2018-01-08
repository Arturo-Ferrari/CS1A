public class Message 
{
   final static int MAX_MSG_LENGTH = 1000000;
   final static int MAX_NAME_LENGTH = 42;
   final static String DEFAULT_AUTHOR = "John Doe";
   final static String DEFAULT_MESSAGE = "You've got mail.";
   final static String LONG_NAME = "Name is too long.";
   final static String LONG_MESSAGE = "Message is too long.";
   private String message;
   private String author;

   Message() 
   {
      message = DEFAULT_MESSAGE;
      author = DEFAULT_AUTHOR;
   }
   Message(String msg, String Author) 
   {
      message = msg;
      author = Author;
   }
   //Accessors for message and author members
   public String getMessage() 
   {
      String msg = message;
      return msg;
   }
   public String getAuthor() 
   {
      String authorname = author;
      return authorname;
   }
   //Mutators for message and author members
   public void setMessage(String newMessage) 
   {
      if (newMessage.length() <= MAX_MSG_LENGTH)
      {
         message = newMessage;
      }
      else
      {
         message = validMessage();
      }
   }
   public void setAuthor(String newAuthor) 
   {
      if (newAuthor.length() <= MAX_NAME_LENGTH)
      {
         author = newAuthor;
      }
      else
      {
         author = validAuthor();
      }
   }
   //validation helpers
   private static String validMessage() 
   {
      return LONG_MESSAGE;   
   }
   private static String validAuthor() 
   {
      return LONG_NAME;
   }
   //a formatted return String
   public String toString() 
   {
      return "\r" + "Author: " + author + "\n" + "Message -----------------" + "\n" + message; 
   }
}