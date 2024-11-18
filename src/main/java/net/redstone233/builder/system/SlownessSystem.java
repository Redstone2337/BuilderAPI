package net.redstone233.builder.system;

import net.redstone233.builder.apis.Slowness;

/**
 * 迟缓高锤属性
 *
 * @version 0.1 Alpha
 */
public class SlownessSystem implements Slowness {

    private int damage;
    private float speed;
    private int duration;
    private int amplifier;

    public SlownessSystem(Builder builder) {
        this.damage = builder.damage;
        this.speed = builder.speed;
        this.duration = builder.duration;
        this.amplifier = builder.amplifier;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public int getAmplifier() {
        return this.amplifier;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void setAmplifier(int amplifier) {
        this.amplifier = amplifier;
    }

    /**
     * 构建器类。
     */
    public static class Builder {
        private int damage;
        private float speed;
        private int duration;
        private int amplifier;

        /**
         * 攻击伤害构建器
         *
         * @param damage 攻击伤害
         * @return 构建器本体
         */
        public Builder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        /**
         * 攻击速度构建器
         *
         * @param speed 攻击速度
         * @return 构建器本体
         */
        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        /**
         * 药水构建器(持续时间)
         *
         * @param duration 持续时间
         * @return 构建器本体
         */
        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        /**
         * 药水构建器(药水等级)
         *
         * @param amplifier 药水等级
         * @return 构建器本体
         */
        public Builder setAmplifier(int amplifier) {
            this.amplifier = amplifier;
            return this;
        }

        /**
         * 武器构建器
         *
         * @return 构建器本体
         */
        public SlownessSystem build() {
            return new SlownessSystem(this);
        }
    }


}
