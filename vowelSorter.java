package compPro2019;

import java.util.*;
class vowelSorter
{
    String accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence: ");//accepting sentence
        String s=sc.nextLine();//storing sentence
        s=s.toUpperCase();//converting to upper case
        return s;
    }

    boolean isValid(String s)//checking validity of sentence
    {
        if(s.endsWith(".")||s.endsWith("!")||s.endsWith("?"))
            return true;
        else
            return false;
    }

    String spaceRemover(String s)
    {
        s=s.trim();//to remove spaces at the ends
        s=s.substring(0,s.length()-1);//to remove punctuation mark 
        int len=s.length();//claculate length of string
        String w="";//to store new string
        for(int i=0;i<len;i++)//iterating through the string
        {
            char ch=s.charAt(i);//extracting each character
            if(!(ch==' '&&s.charAt(i-1)==' '))//removing extra spaces
                w+=ch;
        }
        return w;
    }

    String[] wordExtract(String s)
    {
        s=s+" ";//to extract last word
        int len=s.length();
        int ctr=0;//to count no. of words
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')//counting no. of words 
                ctr++;
        }
        String arr[]=new String[ctr];//creating an array for words
        String w="";//to store each word
        ctr=0;//for array index
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                arr[ctr++]=w;//putting words into the array
                w="";
            }
            else
                w+=ch;//making the word
        }
        return arr;
    }

    boolean isVowel(char ch)//checking if character is vowel or not
    {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        else
            return false;
    }

    void vowelExt(String arr[])
    {
        String vowel="";//to hold start and end with vowel words
        String con="";//to hold rest of the words
        int ctr=0;//to count no. of words starting and ending with vowel
        for(int i=0;i<arr.length;i++)//iterating through word array
        {
            String s=arr[i];//each word
            if(isVowel(s.charAt(0))&&isVowel(s.charAt(s.length()-1)))//checking if starting and ending is vowel
            {
                vowel+=(s+" ");//putting word in vowel
                ctr++;
            }
            else
                con+=(s+" ");//putting word in con
        }
        System.out.println("Number of words beginning and ending with a vowel: "+ctr);//printing ctr
        System.out.println(vowel+con);//pritning in correct format
    }

    public static void main()
    {
        vowelSorter obj=new vowelSorter();//new object
        String s=obj.accept();//accepting the sentence
        if(obj.isValid(s))//validity codition
        {
            s=obj.spaceRemover(s);//removing extra spaces
            String arr[]=obj.wordExtract(s);//extracting all words
            obj.vowelExt(arr);//starting and ending with vowel classifier
        }
        else
        System.out.println("Invalid format.");//error message
    }
}