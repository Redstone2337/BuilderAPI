package net.redstone233.builder.system;

/**
 * 表示玩家的称号。
 */
public class Title {
    private final String id;
    private final String displayName;

    /**
     * 创建一个新的称号。
     *
     * @param id          称号的唯一标识符。
     * @param displayName 称号的显示名称。
     */
    public Title(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }
}
