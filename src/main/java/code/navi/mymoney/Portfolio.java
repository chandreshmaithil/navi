package code.navi.mymoney;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;

public class Portfolio {

    private String portfolioName;
    private UUID portfolioId = UUID.randomUUID();

    List assetAllocation = new LinkedList<AssetClassesAndProportion>();

    public void savePortfolio()
    {
        Portfolios.setUserPortfolios(portfolioName+portfolioId, assetAllocation);
    }

    public static void allocate(String commandWithParams)
    {
        System.out.println("allocate");
        StringTokenizer commandWithParamsSeparated = new StringTokenizer(commandWithParams, " ");
        System.out.println(commandWithParamsSeparated.countTokens());
        String validationResult = Validator.validate(commandWithParamsSeparated);
        System.out.println(validationResult);
        AssetClassesAndProportion assetClasses =new AssetClassesAndProportion();
        assetClasses.applyCommandToAssetClasses( System.currentTimeMillis(), CommandParamsTokenizer.tokenize(commandWithParams) );
    }

    public static void sip(String commandWithParams)
    {
        System.out.println("sip");
    }

    public static void change(String commandWithParams)
    {
        System.out.println("change");
    }


    public static void balance(String commandWithParams)
    {
        System.out.println("balance");
    }

    public static void rebalance()
    {
        System.out.println("rebalance");
    }
  }



