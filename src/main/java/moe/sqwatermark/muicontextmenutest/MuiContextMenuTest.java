package moe.sqwatermark.muicontextmenutest;

import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

@Mod(MuiContextMenuTest.MODID)
public class MuiContextMenuTest {

    public static final String MODID = "mui_test";

    public MuiContextMenuTest() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MenuRegistry.register(modEventBus);
        modEventBus.addListener(ClientSetup::onSetupClient);
        MinecraftForge.EVENT_BUS.addListener((Consumer<PlayerInteractEvent.RightClickBlock>) event -> {
            if (!event.getLevel().isClientSide) {
                event.getEntity().openMenu(new MenuProvider() {
                    @Override
                    public @NotNull Component getDisplayName() {
                        return Component.empty();
                    }

                    @Override
                    public AbstractContainerMenu createMenu(int p_39954_, @NotNull Inventory p_39955_, @NotNull Player p_39956_) {
                        return new TestMenu(MenuRegistry.TEST_MENU.get(), p_39954_);
                    }
                });
            }
        });
    }

}
