package regexCNP;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

/* Name of the class has to be “Main” only if the class is public. */
class CNPregex {
    private static String regularExpression = "[12](0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])(19|20)\\d{2}[0-9]{4}";
    
    /* 
    *CNP = 1 or 2 and next 6 (8 if the year is complete) digits are for
    *MMDDYYYY, where MM is month on 2 digits, DD day on 2 digits and
    *YYYY is year on 4 digits.
    *---------------------------------------------------------------------------   
    *    S  MM DD YYYY LLLL -> when LLLL are the last 4 caracters of cnp
    *    1   2  2    4    4 = 13 caracters;
    *---------------------------------------------------------------------------
    * S = [12] 1 or 2;
    * MM = (0[1-9]|1[012]) (01 to 09) or (10,11,12);
    * DD = (0[1-9]|[12][0-9]|3[01]) (01 to 09) or (10 to 19) 
                              -> or ( 20 - 29) or (30,31);
    * YYYY = (19/20) \\d{2} YY = 19 or 20 and the next 
                            YY is d{2}(anydigit, 2 digits) 00 - 99;
    * LLLL = {4}[0-9] = LLLL;
    *
    * Let's try : 1123120041234 or 2010920098722 or mymomhascnp2010920098722 
    * This is just a exercise with regexExpresion, this CNP is different.
    */
    
    public static void main(String [] args){
       int count = 0;
            /*
            Scanner scannerRegex = new Scanner(System.in);
            System.out.println("Insert regex or pattern to be searched: ");
            read the regular expresion
            String regex = scannerRegex.next();
            create a pattern using introduced regular expresion
            */
        Pattern pattern = Pattern.compile(regularExpression);
            // read the source string using a new Scanner object
        Scanner scannerSourceString = new Scanner(System.in);
        System.out.println("Insert source string(with spaces or not): ");
        String source = scannerSourceString.nextLine();
            // NextLine(to read all line)
        source = source.replace(" ",""); 
            // Replace spaces from source.
            /*
            System.out.println(source);
            */
        // create the matcher as result of applying regex on source stringt
        Matcher matcher = pattern.matcher(source);
        boolean found = false;
        // if the regular expression or pattern was found
        while (matcher.find()) {
        String result;
        result = String.format("I found text \"%s\" starting at " +
        "index %d until index %d.",
        matcher.group(),
        matcher.start(),
        matcher.end());
        count++;
        System.out.println(result);
        found = true;
        }
        
        // if regular expression or pattern was not found in source string
        if (!found) {
        System.out.println("No match found :(");
        }
        
        System.out.println("I found " + count + " CNPs!"); 
    }
}
    
    