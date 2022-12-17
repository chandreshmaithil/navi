package code.navi.mymoney;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandFileReader {
    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = null;
        try
        {
            Path path = Paths.get(filePath);
            reader = Files.newBufferedReader(path);
            String commandWithParams = reader.readLine();


            while ((commandWithParams!=null) && (commandWithParams.trim()!="REBALANCE") ) {

                System.out.println(commandWithParams);

                if (commandWithParams.contains("ALLOCATE")){
                    Portfolio.allocate(commandWithParams);
                }

                else if (commandWithParams.contains("SIP")){
                    Portfolio.sip(commandWithParams);
                }

                else if (commandWithParams.contains("CHANGE")){
                    Portfolio.change(commandWithParams);
                }

                else if (commandWithParams.contains("BALANCE")){
                    Portfolio.balance(commandWithParams);
                }

                else {
                    System.out.println("BAD COMMAND !!!");
                }

                if (commandWithParams.trim()!="REBALANCE") {
                    commandWithParams = reader.readLine();
                }
            }
            Portfolio.rebalance();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null)
                reader.close();
        }
    }
}
