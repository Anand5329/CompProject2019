package projects;
import java.util.*;
class caeserCipher
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String str=sc.nextLine();//storing sentence in str
        String finalSent="";//to store the resultant sentence
        if(str.length()>3 && str.length()<100)//checking for validity
        {
            for(int i=0;i<str.length();i++)//iterating through the string
            {
                char c=str.charAt(i);//storing character in c
                if(c>=65 && c<=90)//checking if c is a capital alphabet
                {
                    if(c<=77)//checking if c is before 'M'
                        c=(char)(c+13);//going forward by 13 places
                    else
                        c=(char)(c-13);//going backward by 13 places
                    finalSent+=c;//adding c to the required sentence
                }
                else if(c>=97 && c<=122)//checking if c is a small alphabet
                {
                    if(c<=109)//checking if c is before 'm'
                        c=(char)(c+13);//going forward by 13 places
                    else
                        c=(char)(c-13);//going backward by 13 places
                    finalSent+=c;//adding c to the required sentence
                }
                else
                finalSent+=c;
            }
            //displaying:
            System.out.println("The cipher text is:");
            System.out.println(finalSent);
        }
        else
        System.out.println("Invalid Length.");
    }
}
