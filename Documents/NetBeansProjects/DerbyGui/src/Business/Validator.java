/**
 * class contains the methods to validate the information that 
 * the user enters into the text fields for the creation or updating of a customer
 *
 * @author     Jerry Cook
 * @created    June 6, 2017
 */
package Business;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator {
    //check that the needed information is present the in the text field
   public boolean isPresent(JTextComponent c , String FieldName)
   {
       if(c.getText().length() == 0)
       {
           //message dialog method called
           showMessage(c,FieldName + " is a required field.");
           c.requestFocusInWindow();
           return false;
       }
       return true;
   }
   //method to check if email is entered in the correct format
   public boolean isEmail(JTextComponent c, String FieldName)
   {
       Pattern pattern;
       Matcher matcher;
       
       //regex pattern for email
        final String EMAIL_PATTERN = "^[A-Za-z0-9-\\+]+(.\\[_A-Za-z0-9-]+)*@"+
                "[A-Za-z0-9-]+(\\.[.A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(c.getText());
        if(matcher.matches())
            return true;
        else
            //message dialog method called
            showMessage(c,"Invalid Email Address \n"
            +"should be xxxx@xxxx.com format");
        c.requestFocusInWindow();
        return false;
      
   }
   //method check if name is whithin the specified length requirments
   public boolean isValidNameLength(JTextComponent c,int size, String FieldName)
   {
       
       if(c.getText().length() > size)
       {
           //call message dialog if name not in correct format
           showMessage(c,FieldName+" Has to be 15 characters or less");
           c.requestFocusInWindow();
           return false;
       }
      return true;
   }
   //method checks email is within specified length requirement
   public boolean isValidEmailLength(JTextComponent c, int size, String FieldName)
   {
       if(c.getText().length() > size)
       {   //call message method if email not in correct format
           showMessage(c, FieldName +" Has to be 30 characters or less");
           c.requestFocusInWindow();
           return false;
       }
       return true;
   }
   //method to show dialog box specifying the requirments not met.
   private void showMessage(JTextComponent c, String message)
   {
       JOptionPane.showMessageDialog(c,message,"Invalid Entry",
               JOptionPane.ERROR_MESSAGE);
   }
}
