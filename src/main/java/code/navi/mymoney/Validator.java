package code.navi.mymoney;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Validator {

    private static Set<String> commands = new HashSet<String>();

    public static String validate(StringTokenizer commandWithParamsSeparated)
    {
        if(commandWithParamsSeparated.countTokens()!=4){
            return "INVALID NUMBER OF ARGUMENTS";
        }

       String inputCommand = commandWithParamsSeparated.nextToken().trim();

        commands.addAll(Arrays.asList("ALLOCATE",
                "SIP",
                "CHANGE",
                "BALANCE",
                "REBALANCE"));

        if(commands.contains(inputCommand)){
            System.out.println(inputCommand);
            return "VALID COMMAND";
        }

        return "VALID NUMBER OF ARGUMENTS";

    }
}
