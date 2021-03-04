class parse
{
public static void main(String args[])
{
int firstArg;
if (args.length > 0) 
    {
        firstArg = Integer.parseInt(args[0]);
    } 
        System.out.println("Argument " + args[0] + " must be an integer.");
       
    

}
}

/*
OUTPUT:
javac parse.java
java parse 23
Argument 23 must be an integer.
*/