import java.util.ArrayList;
import java.util.HashSet;

public class FindRepeatingSubstring 
{
    public static ArrayList<String> findRepeatingSubstring(String sentence)
    {
        sentence = sentence.toLowerCase();
        int lengthOfTheSentence = sentence.length();
        HashSet<String> substrings = new HashSet<>();

        ArrayList<String> ans = new ArrayList<>();


        for (int i = 0; i < lengthOfTheSentence-1; i++) 
        {
            for (int j = i+1; j <= lengthOfTheSentence; j++) 
            {
                String substring = sentence.substring(i, j);
                if (substrings.contains(substring)&&substring.length()>=2 )
                {

                    if(!ans.contains(substring))
                        ans.add(substring);
                }

                else if(!substring.contains(" "))
                    substrings.add(substring);
            }
        }

        return ans;
    }
}
