package code.navi.mymoney;

public class AllocateCommand implements Command{

    String commandName = null;
    int arguments = 0;


    @Override
    public String validateCommand(String commandWithParams) {
        return null;
    }

    @Override
    public String[] tokenizeCommandAndArguments(String commandWithParams) {
        return new String[0];
    }

    @Override
    public String executeCommand(String commandWithParams) {
        return null;
    }
}