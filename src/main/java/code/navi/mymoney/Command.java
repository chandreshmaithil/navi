package code.navi.mymoney;

public interface Command {
    String commandName = null;
    int arguments = 0;

    String validateCommand(String commandWithParams);
    String[] tokenizeCommandAndArguments(String commandWithParams);
    String executeCommand(String commandWithParams);
}
