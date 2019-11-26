package Core4;

public class Kod {
    private StringBuilder text;
    private int key;
    private StringBuilder textOut;
    private char[] alphabet;

    public Kod(StringBuilder text, int key) {
        this.text = new StringBuilder();
        this.text.append(text);
        this.key = key;
        this.textOut = new StringBuilder();
        this.alphabet = new char[26];


    }


    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public StringBuilder getTextOut() {
        return textOut;
    }

    public void setTextOut(StringBuilder textOut) {
        this.textOut = textOut;
    }

    public char[] getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(char[] alphabet) {
        this.alphabet = alphabet;
    }

    public String code(){
        int index = 0;
        String str = text.toString().toLowerCase().trim().replace("/n","");
        text = new StringBuilder().append(str);
     //   text.append(text.toString().toLowerCase().trim().replace("/n",""));

        char[] arr = text.toString().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < alphabet.length; j++ ){
                if (arr[i] == alphabet[j]){
                    index = j;
                }
            }

            if (arr[i] < 97 || arr [i] > 122) {
                textOut.append(arr[i]);
            }else if (arr[i] + key > 122){
                textOut.append(alphabet[key - (123 - arr[i])]);
            } else {
                textOut.append(alphabet[key + index]);
            }
        }
        return textOut.toString();
    }

    private void initializeAlphabet(){
        int index = 0;
        for (int i = 97; i < 123; index++) {
            alphabet[index] = (char) i;
        }
    }
}
