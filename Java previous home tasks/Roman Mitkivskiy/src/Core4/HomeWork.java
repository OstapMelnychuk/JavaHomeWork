package Core4;


public class HomeWork {
     private String inText;
     private String coding;
     private String codmess;

    public HomeWork(String inText) {
        this.inText = inText;
        this.codmess = "";
    }

    public void Cod() {
        String str = inText.toLowerCase().trim().replace(" ", "");
        char[] mess = str.toCharArray();
        for (int i = 0; i < mess.length; i++) {
            if (mess[i] == 'A' || mess[i] == 'a') {
                coding = "*-";
            } else if (mess[i] == 'B' || mess[i] == 'b') {
                coding = "-***";
            } else if (mess[i] == 'C' || mess[i] == 'c') {
                coding = "-*-*";
            } else if (mess[i] == 'D' || mess[i] == 'd') {
                coding = "-**";
            } else if (mess[i] == 'E' || mess[i] == 'e') {
                coding = "*";
            } else if (mess[i] == 'F' || mess[i] == 'f') {
                coding = "**-*";
            } else if (mess[i] == 'G' || mess[i] == 'g') {
                coding = "--*";
            } else if (mess[i] == 'H' || mess[i] == 'h') {
                coding = "****";
            } else if (mess[i] == 'I' || mess[i] == 'i') {
                coding = "**";
            } else if (mess[i] == 'J' || mess[i] == 'j') {
                coding = "*---";
            } else if (mess[i] == 'K' || mess[i] == 'k') {
                coding = "-*-";
            } else if (mess[i] == 'L' || mess[i] == 'l') {
                coding = "*-";
            } else if (mess[i] == 'M' || mess[i] == 'm') {
                coding = "--";
            } else if (mess[i] == 'N' || mess[i] == 'n') {
                coding = "-*";
            } else if (mess[i] == 'O' || mess[i] == 'o') {
                coding = "---";
            } else if (mess[i] == 'P' || mess[i] == 'p') {
                coding = "*--*";
            } else if (mess[i] == 'Q' || mess[i] == 'q') {
                coding = "--*-";
            } else if (mess[i] == 'R' || mess[i] == 'r') {
                coding = "*-*";
            } else if (mess[i] == 'S' || mess[i] == 's') {
                coding = "***";
            } else if (mess[i] == 'T' || mess[i] == 't') {
                coding = "-";
            } else if (mess[i] == 'U' || mess[i] == 'u') {
                coding = "-";
            } else if (mess[i] == 'V' || mess[i] == 'v') {
                coding = "***-";
            } else if (mess[i] == 'W' || mess[i] == 'w') {
                coding = "*--";
            } else if (mess[i] == 'X' || mess[i] == 'x') {
                coding = "--";
            } else if (mess[i] == 'Y' || mess[i] == 'y') {
                coding = "-*--";
            } else if (mess[i] == 'Z' || mess[i] == 'z') {
                coding = "--**";
            } else if (mess[i] == ' ') {
                coding = " / ";
            } else {
                System.out.println(("Error!Unknown symbol!"));
            }
            codmess = codmess + coding + " | ";

        }
    }
    public void Out(){
        System.out.println(inText);
        System.out.println();
        System.out.println("Codding message: " + codmess);

    }

}
