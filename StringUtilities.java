
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String answer = baseValue + valueToBeAdded;
        return answer;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversedString = "";
        for (int i = valueToBeReversed.length() -1; i >= 0;i-- ){
        reversedString = reversedString + valueToBeReversed.charAt(i);
        }
        
        return reversedString;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Integer wordLength = Math.round((word.length() / 2));
        //Integer middleCharNum = Math.round(wordLength);
        //int i = middleCharNum;
        
        Character answer = word.charAt(wordLength);
        return answer;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String answer = " ";
        for (int i = 0; i >= value.length() -1; i--){
            StringBuilder charRemove = new StringBuilder(value);
            if (value.charAt(i) == charToRemove){
                charRemove.deleteCharAt(i);
                answer = charRemove.toString();
            } else{
            answer += answer.replace(answer.charAt(i), value.charAt(i));
        
        }
            }
            return answer;
        }
        
    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] last = sentence.split(" ");
        
        String lastWord = last[last.length-1];
        return lastWord;
        
        
    }
}
