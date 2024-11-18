package net.redstone233.builder.morebuilders;

import net.redstone233.builder.apis.CurrencyConverter;

/**
 * 货币系统类，实现了货币转换接口。
 *
 * @version 0.1 Alpha
 */
public class CurrencySystemBuilder implements CurrencyConverter {

    private int copperCoins;
    private int silverCoins;
    private int goldCoins;

    public CurrencySystemBuilder(Builder builder) {
        this.copperCoins = builder.copperCoins;
        this.silverCoins = builder.silverCoins;
        this.goldCoins = builder.goldCoins;
    }

    @Override
    public void convertCopperToSilver(int copperToConvert) {
        int silver = copperToConvert / 100;
        this.copperCoins -= copperToConvert;
        this.silverCoins += silver;
    }

    @Override
    public void convertSilverToGold(int silverToConvert) {
        int gold = silverToConvert / 100;
        this.silverCoins -= silverToConvert;
        this.goldCoins += gold;
    }

    @Override
    public void convertGoldToSilver(int goldToConvert) {
        int silver = goldToConvert * 100;
        this.goldCoins -= goldToConvert;
        this.silverCoins += silver;
    }

    @Override
    public void convertSilverToCopper(int silverToConvert) {
        int copper = silverToConvert * 100;
        this.silverCoins -= silverToConvert;
        this.copperCoins += copper;
    }

    @Override
    public void convertGoldToCopper(int goldToConvert) {
        int copper = goldToConvert * 10000;
        this.goldCoins -= goldToConvert;
        this.copperCoins += copper;
    }

    @Override
    public void printBalance() {
        System.out.println("当前货币持有情况：");
        System.out.println("铜币：" + this.copperCoins + " 枚");
        System.out.println("银币：" + this.silverCoins + " 枚");
        System.out.println("金币：" + this.goldCoins + " 枚");
    }

    /**
     * 构建器类。
     */
    public static class Builder {
        private int copperCoins;
        private int silverCoins;
        private int goldCoins;

        /**
         * 铜币构建器，设置铜币数量
         *
         * @param copperCoins 铜币数量
         * @return 构建器本体
         */
        public Builder setCopperCoins(int copperCoins) {
            this.copperCoins = copperCoins;
            return this;
        }

        /**
         * 银币构建器，设置银币数量
         *
         * @param silverCoins 银币数量
         * @return 构建器本体
         */
        public Builder setSilverCoins(int silverCoins) {
            this.silverCoins = silverCoins;
            return this;
        }

        /**
         * 金币构建器，设置金币数量
         *
         * @param goldCoins 金币数量
         * @return 构建器本体
         */
        public Builder setGoldCoins(int goldCoins) {
            this.goldCoins = goldCoins;
            return this;
        }

        /**
         * 货币构建器
         *
         * @return 构建器本体
         */
        public CurrencySystemBuilder build() {
            return new CurrencySystemBuilder(this);
        }
    }
}
