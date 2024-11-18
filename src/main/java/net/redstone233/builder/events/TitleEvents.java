package net.redstone233.builder.events;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.redstone233.builder.manager.TitleManager;
import net.redstone233.builder.system.Title;

/**
 * 处理游戏中的称号事件。
 */
public class TitleEvents {
    private final TitleManager titleManager;

    /**
     * 构造函数，初始化称号事件。
     *
     * @param titleManager 称号管理器。
     */
    public TitleEvents(TitleManager titleManager) {
        this.titleManager = titleManager;

        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (!world.isClient) {
                String blockId = world.getBlockState(pos).getBlock().toString();
                if (blockId.equals("grass_block")) {
                    ServerPlayerEntity playerEntity = (ServerPlayerEntity) player;
                    titleManager.awardTitle(playerEntity.getUuid(),titleManager.getTitleById("VIP"));
                }
            }
            return ActionResult.PASS;
        });
    }

    /**
     * 在客户端展示玩家的称号。
     *
     * @param player 玩家实体。
     */
    public void showTitle(ServerPlayerEntity player) {
        Title title = titleManager.getPlayerTitle(player.getUuid());
        if (title != null) {
            // 展示称号逻辑
            System.out.println(title.getDisplayName());
        }
    }
}
