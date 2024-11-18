package net.redstone233.builder.manager;

/**
 * 管理游戏中的所有称号。
 */
import net.redstone233.builder.system.Title;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TitleManager {
    private final Map<String, Title> titles = new HashMap<>();
    private final Map<UUID, Title> playerTitles = new HashMap<>();

    /**
     * 注册一个称号。
     *
     * @param title 要注册的称号。
     */
    public void registerTitle(Title title) {
        titles.put(title.getId(), title);
    }

    /**
     * 根据ID获取称号。
     *
     * @param id 称号的ID。
     * @return 对应的称号对象。
     */
    public Title getTitleById(String id) {
        return titles.get(id);
    }

    /**
     * 给玩家授予一个称号。
     *
     * @param playerId 玩家的UUID。
     * @param title    要授予的称号。
     */
    public void awardTitle(UUID playerId, Title title) {
        playerTitles.put(playerId, title);
    }

    /**
     * 获取玩家的称号。
     *
     * @param playerId 玩家的UUID。
     * @return 玩家的称号。
     */
    public Title getPlayerTitle(UUID playerId) {
        return playerTitles.get(playerId);
    }

    /**
     * 动态添加一个新的称号。
     *
     * @param title 要添加的称号。
     */
    public void addTitle(Title title) {
        titles.put(title.getId(), title);
    }

    /**
     * 更新现有的称号。
     *
     * @param id      称号的ID。
     * @param newTitle 新的称号。
     */
    public void updateTitle(String id, Title newTitle) {
        titles.put(id, newTitle);
    }
}
