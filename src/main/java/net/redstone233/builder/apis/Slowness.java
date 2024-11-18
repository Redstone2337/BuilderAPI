package net.redstone233.builder.apis;

/**
 * 迟缓高锤接口
 *
 * @version 0.1 Alpha
 */
public interface Slowness {
    default void setSlownessValue(int damage,float speed,int duration,int amplifier) {
        this.setDamage(damage);
        this.setSpeed(speed);
        this.setDuration(duration);
        this.setAmplifier(amplifier);
    }

    int getDamage();

    float getSpeed();

    int getDuration();

    int getAmplifier();

    void setDamage(int damage);

    void setSpeed(float speed);

    void setDuration(int duration);

    void setAmplifier(int amplifier);
}