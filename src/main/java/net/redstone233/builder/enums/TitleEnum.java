package net.redstone233.builder.enums;

import net.redstone233.builder.system.Title;

/**
 * 定义一组预设的称号。
 */
public enum TitleEnum {
    VIP("VIP", "§4VIP"),
    LEGEND("LEGEND", "§6Legend"),
    NEWBIE("NEWBIE", "§cNewbie");

    private final Title title;

    TitleEnum(String id, String displayName) {
        this.title = new Title(id, displayName);
    }

    /**
     * 获取枚举值对应的称号对象。
     *
     * @return 称号对象。
     */
    public Title getTitle() {
        return title;
    }
}
