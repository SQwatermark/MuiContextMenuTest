package moe.sqwatermark.muicontextmenutest;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.IContainerFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestMenu extends AbstractContainerMenu {

    protected TestMenu(@Nullable MenuType<?> p_38851_, int p_38852_) {
        super(p_38851_, p_38852_);
    }

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player p_38941_, int p_38942_) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean stillValid(@NotNull Player p_38874_) {
        return true;
    }

    public static class Constructor implements IContainerFactory<TestMenu> {

        @Override
        public TestMenu create(int windowId, Inventory inv, FriendlyByteBuf data) {
            return new TestMenu(MenuRegistry.TEST_MENU.get(), windowId);
        }
    }
}
