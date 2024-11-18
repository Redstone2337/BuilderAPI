package net.redstone233.builder.apis;

/**
 * 货币转换接口，定义货币转换的方法。
 *
 * @version 0.1 Alpha
 */
public interface CurrencyConverter {
    void convertCopperToSilver(int copperToConvert);
    void convertSilverToGold(int silverToConvert);
    void convertGoldToSilver(int goldToConvert);
    void convertSilverToCopper(int silverToConvert);
    void convertGoldToCopper(int goldToConvert);
    void printBalance();
}
