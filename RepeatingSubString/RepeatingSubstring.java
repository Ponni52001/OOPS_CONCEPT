package SubString;

public class RepeatingSubstring {
    public void findRepeatingSubstring(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            char[] word1 = array[i].toCharArray();
            for (int j = i + 1; j < array.length; j++) {
                char[] word2 = array[j].toCharArray();
                int count = 0;
                int start = 0;
                boolean output = false;
                int z = 0;
                for (int k = 0; k < word2.length & z < word1.length; k++) {
                    if (word2[k] == word1[z]) {
                        if (!output) {
                            start = z;
                            output = true;
                        }
                        z++;
                        count++;
                    } else {
                        z++;
                        k--;
                    }
                }

                if (count >= 2) {

                    while (count > 0) {
                        System.out.print(word1[start]);
                        start++;
                        count--;
                    }

                    System.out.print(" ");
                }

            }
        }

    }
}
