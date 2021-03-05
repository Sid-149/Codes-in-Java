public class ReplaceAll 
{

  public static void main(String args[])
 {

    // 1st example - replacing all occurrence of a character in String
    // you can replace single character but you cannot pass a char
    // to this replace() function, it expect a string, so you should
    // pass a single character string as shown below
    String bestseller = "clean code";
    String alternative = bestseller.replaceAll("e", "a");

    System.out.println("orginal string: " + bestseller);
    System.out.println("replaced string: " + alternative);

    // 2nd example - replacing all occurrence of a substring
    String sample = "123 123 123 123 321";
    String replaced = sample.replaceAll("123", "111");
    System.out.println("orginal string: " + sample);
    System.out.println("replaced string: " + replaced);

    // 3rd example - replacement using regular expression
    // the first argument you pass its regular expression
    // you can use this to replace all white space from
    // string as shown below
    String textWithWhitespace = "Java is great";
    String changed = textWithWhitespace.replaceAll("\\s+", "");
    System.out.println("orginal string: " + textWithWhitespace);
    System.out.println("replaced string: " + changed);

  }

}

/*
Output:
javac ReplaceAll.java

java ReplaceAll
original string: clean code
replaced string: claan coda
original string: 123 123 123 123 321
replaced string: 111 111 111 111 321
original string: Java is great
replaced string: Javaisgreat
*/