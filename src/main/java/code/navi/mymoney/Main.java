package code.navi.mymoney;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

       String filePath = "src/main/resources/portfolio_input.txt";
     //  CommandFileReader.readFile(args[0]);
       CommandFileReader.readFile(filePath);
    }
}
