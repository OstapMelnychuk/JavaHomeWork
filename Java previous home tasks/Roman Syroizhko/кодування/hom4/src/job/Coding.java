package job;

public class Coding {

   private StringBuilder word;
   private StringBuilder text;
   private String[] textOut;
   private char[] alphabet;
   private String[] change = new String[26];


    public Coding(String text) {
        this.text=new StringBuilder();
        this.text.append(text);
        this.word = new StringBuilder();
        alphabet = new char[26];
    }

    public void code(){
        String[] textOut = new String[word.length()];
        String str = text.toString().toLowerCase().trim().replace("\n", "");
        char[] in = str.toCharArray();
        textOut = new String[str.length()];
        for(int i = 0; i < in.length; i++){
            for(int j = 0; j < alphabet.length; j++){
                if(in[i] == alphabet[j]){
                    textOut[i] = change[j];
                }
            }
        }
        for(int i = 0; i < textOut.length; i++){
            System.out.print(textOut[i]);
        }


    }

    public void out(){
        for(int i = 0; i < 26; i++){
            change[i] = "" + i;

        }
    }

    public void alph(){
        int index = 0;
        for(int i = 97; i < 123;i++,index++){
            alphabet[index] = (char) i;


        }
    }
}
