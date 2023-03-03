package SubString;

import java.util.ArrayList;


class Main
{
    public static void main(String[] args) 
    {
        String sentence = "howhowhowhow";
        ArrayList<String> repeatingSubstring = FindRepeatingSubstring.findRepeatingSubstring(sentence);
//        System.out.println(repeatingSubstring);

        for(int i=0;i<repeatingSubstring.size()-1;i++)
        {
            String currentString= repeatingSubstring.get(i);
            String nextString = repeatingSubstring.get(i+1);
            if(nextString.length()>currentString.length())
            {
                if(nextString.contains(currentString))
                {
                    repeatingSubstring.remove(currentString);
                    i--;
                  }
            }
          else
          {
                if(currentString.contains(nextString))
                {
                    repeatingSubstring.remove(nextString);
                    i--;
                }
            }
        }
        System.out.println("The repeating substring is: " + repeatingSubstring);

    }
}
