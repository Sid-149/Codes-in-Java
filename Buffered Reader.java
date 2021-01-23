import java.io.*;
class buff
{
    public static void main(String args[])
                  throws IOException
    {
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.print("Enter an integer:");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter a String:");
        String b = br.readLine();

        System.out.printf("You have entered integer as " + a +
                          " and string as " + b);
    }
}
