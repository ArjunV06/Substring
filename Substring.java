//Arjun Vasudevan
import java.util.*;
public class Substring
{
    public static void main(String[] args)
    {
        //System.out.print("Enter the word flashlight --> ");
        Scanner in = new Scanner(System.in);
        //String flashlight = in.next();
        String flashlight = "flashlight";
        String f = String.valueOf(flashlight.charAt(0));
        String l = String.valueOf(flashlight.charAt(1));
        String a = String.valueOf(flashlight.charAt(2));
        String s = String.valueOf(flashlight.charAt(3));
        String h = String.valueOf(flashlight.charAt(4));
        //String l = String.valueOf(flashlight.charAt(5));
        String i = String.valueOf(flashlight.charAt(6));
        String g = String.valueOf(flashlight.charAt(7));
        //String h = String.valueOf(flashlight.charAt(8));
        String t = String.valueOf(flashlight.charAt(9));
        System.out.print("\nPart 1\n=================\n");
        System.out.println(flashlight.substring(0,5));
        System.out.println(flashlight.substring(5));
        System.out.println(flashlight.substring(2,5));
        System.out.println(flashlight.substring(0,1) + flashlight.substring(6));
        System.out.println(flashlight.substring(0,3) + flashlight.substring(7,8));
        System.out.println(flashlight.substring(0,1) + flashlight.substring(6,7) + flashlight.substring(9));
        System.out.println(flashlight.substring(4,5) + flashlight.substring(6,9));
        System.out.println(flashlight.substring(7,8) + flashlight.substring(2,4));
        System.out.println(flashlight.substring(0,1) + flashlight.substring(2,4) + flashlight.substring(9));
        System.out.println(flashlight.substring(3,5) + flashlight.substring(2,3) + flashlight.substring(0,1) + flashlight.substring(9));
        System.out.println("\nPart 2\n=================");
        System.out.println(flashlight.substring(5) + "s");
        System.out.println(flashlight.substring(5) + "er");
        System.out.println(flashlight.substring(5) + "ning");
        System.out.println("en" + flashlight.substring(6) + "ened");

        
        /*System.out.println(a+s+h);
        System.out.println(f+l+i+g+h+t);
        System.out.println(f+l+a+g);
        System.out.println(f+i+t);
        System.out.println(h+i+g+h); //not the right method, he wants us to use substring...;(
        System.out.println(g+a+s);
        System.out.println(f+a+s+t);
        System.out.println(s+h+a+f+t);
        //System.out.println(write("thisisverylong"));
        */

        
    }
   /*static String write(String result)
    {
        String original = "flashlight";
        char[] orig = new char[original.length()];
        char[] res = new char[result.length()];
        for(int i = 0; i<orig.length; i++)
        {
            orig[i]=original.charAt(i);
            //System.out.println(orig[i]);
        }
        for(int i = 0; i<res.length; i++)
        {
            res[i]=result.charAt(i);
            //System.out.println(res[i]);
        }
        int larger = (orig.length==res.length)? orig.length : (orig.length>res.length)? orig.length : res.length;
        int smaller = (orig.length==res.length)? orig.length : (orig.length<res.length)? orig.length : res.length;
        System.out.println(larger);
        for(int i = 0; i<larger; i++)
        {
            for(int j = 0; j<smaller; j++)
            {
                char origChar = orig[i];
            }
            
            
        }
        //keep going through the orig array, if it does not equal what we have at res, remove it
        return original;
    } //no point in doing this for the lab, no way for anyone to know if I just return result or actually calculate!
    */
}