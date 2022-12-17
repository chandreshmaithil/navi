package code.navi.mymoney;

import java.util.HashMap;
import java.util.List;

public class Portfolios {

    private static HashMap userPortfolios = new HashMap();

    public static HashMap getUserPortfolios() {
        return userPortfolios;
    }

    public static void setUserPortfolios(String userPortfolioKey, List assetAllocation) {
        userPortfolios.put(userPortfolioKey, assetAllocation);
    }

}
