package code.navi.mymoney;

import java.security.Timestamp;

public class AssetClassesAndProportion {

    private int equity;
    private int debt;
    private int gold;

    private int equityRatio;
    private int debtRatio;
    private int goldRatio;

    private long createdTimestamp;

    public void applyCommandToAssetClasses(long createdTimestamp, String... values){
        equity = Integer.valueOf(values[0]);
        debt = Integer.valueOf(values[1]);
        gold = Integer.valueOf(values[2]);

        equityRatio = equity / (equity + debt + gold) ;

        debtRatio = debt / (equity + debt + gold) ;

        goldRatio = gold / (equity + debt + gold) ;

    }

    public int getEquity() {
        return equity;
    }

    public int getDebt() {
        return debt;
    }

    public int getGold() {
        return gold;
    }

    public int getEquityRatio() {
        return equityRatio;
    }

    public int getDebtRatio() {
        return debtRatio;
    }

    public int getGoldRatio() {
        return goldRatio;
    }
}
