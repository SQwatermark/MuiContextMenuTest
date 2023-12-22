package moe.sqwatermark.muicontextmenutest;

import icyllis.modernui.mc.forge.MenuScreenFactory;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void onSetupClient(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(MenuRegistry.TEST_MENU.get(), MenuScreenFactory.create(menu -> new TestFragment()));
        });
    }

}
