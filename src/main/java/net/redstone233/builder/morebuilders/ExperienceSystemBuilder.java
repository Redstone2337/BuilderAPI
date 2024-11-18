package net.redstone233.builder.morebuilders;

/**
 * 经验系统类，用于管理玩家的等级和经验值。
 *
 * @version 0.1 Alpha
 */
public class ExperienceSystemBuilder {

    private int level;
    private int experience;
    private int experienceToNextLevel;
    private double experienceMultiplier;

    // 私有构造函数，只能通过建造者来创建对象
    private ExperienceSystemBuilder(Builder builder) {
        this.level = builder.level;
        this.experience = builder.experience;
        this.experienceToNextLevel = builder.experienceToNextLevel;
        this.experienceMultiplier = builder.experienceMultiplier;
    }

    /**
     * 获取玩家的等级。
     *
     * @return 当前等级
     */
    public int getLevel() {
        return level;
    }

    /**
     * 获取玩家的当前经验值。
     *
     * @return 当前经验值
     */
    public int getExperience() {
        return experience;
    }

    /**
     * 获取达到下一级所需的经验值。
     *
     * @return 达到下一级所需的经验值
     */
    public int getExperienceToNextLevel() {
        return experienceToNextLevel;
    }

    /**
     * 获取经验值的倍率。
     *
     * @return 经验值倍率
     */
    public double getExperienceMultiplier() {
        return experienceMultiplier;
    }

    /**
     * 增加玩家的经验值，并在达到升级条件时自动升级。
     *
     * @param exp 要增加的经验值
     */
    public void addExperience(int exp) {
        this.experience += (int) (exp * experienceMultiplier);
        while (this.experience >= this.experienceToNextLevel) {
            this.experience -= this.experienceToNextLevel;
            this.level++;
            this.experienceToNextLevel = calculateNextLevelExperience();
        }
    }

    /**
     * 计算下一个等级所需的经验值。
     *
     * @return 下一个等级所需的经验值
     */
    private int calculateNextLevelExperience() {
        return (int) (experienceToNextLevel * experienceMultiplier);
    }

    /**
     * 建造者类，用于创建经验系统对象。
     */
    public static class Builder {
        private int level;
        private int experience;
        private int experienceToNextLevel;
        private double experienceMultiplier;

        /**
         * 设置玩家的等级。
         *
         * @param level 玩家的等级
         * @return Builder对象，用于链式调用
         */
        public Builder level(int level) {
            this.level = level;
            return this;
        }

        /**
         * 设置玩家的当前经验值。
         *
         * @param experience 玩家的当前经验值
         * @return Builder对象，用于链式调用
         */
        public Builder experience(int experience) {
            this.experience = experience;
            return this;
        }

        /**
         * 设置达到下一级所需的经验值。
         *
         * @param experienceToNextLevel 达到下一级所需的经验值
         * @return Builder对象，用于链式调用
         */
        public Builder experienceToNextLevel(int experienceToNextLevel) {
            this.experienceToNextLevel = experienceToNextLevel;
            return this;
        }

        /**
         * 设置经验值的倍率。
         *
         * @param experienceMultiplier 经验值倍率
         * @return Builder对象，用于链式调用
         */
        public Builder experienceMultiplier(double experienceMultiplier) {
            this.experienceMultiplier = experienceMultiplier;
            return this;
        }

        /**
         * 构建并返回经验系统对象。
         *
         * @return 构建好的经验系统对象
         */
        public ExperienceSystemBuilder build() {
            return new ExperienceSystemBuilder(this);
        }
    }
}