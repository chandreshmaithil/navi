package code.navi.mymoney;

public class ChangeCommand implements Command{
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