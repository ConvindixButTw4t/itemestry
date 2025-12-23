package net.tw4t.itemestry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.tw4t.itemestry.block.ModBlocks;
import net.tw4t.itemestry.item.ModItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Itemestry.MODID)
public class Itemestry
    {
    public static final String MODID = "itemestry";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Itemestry(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    private void addCreative(BuildCreativeModeTabContentsEvent event)
        {
            if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
                {
                    event.accept(ModItems.TIN_INGOT);
                    event.accept(ModItems.BRONZE_INGOT);
                    event.accept(ModItems.STEEL_INGOT);
                    event.accept(ModItems.RED_IRON_INGOT);
                    event.accept(ModItems.BLUE_IRON_INGOT);
                    event.accept(ModItems.OBSIDIAN_INGOT);
                    event.accept(ModItems.TITANIUM_INGOT);
                    event.accept(ModItems.TUNGSTEN_INGOT);
                    event.accept(ModItems.IRIDIUM_INGOT);
                    event.accept(ModItems.NIOBIUM_INGOT);

                    event.accept(ModItems.NIOBIUM_DUST);
                    event.accept(ModItems.TUNGSTEN_DUST);
                    event.accept(ModItems.TIN_DUST);
                    event.accept(ModItems.TITANIUM_DUST);
                    event.accept(ModItems.DIAMOND_DUST);
                    event.accept(ModItems.BLUESTONE_DUST);
                    event.accept(ModItems.BRONZE_DUST);
                    event.accept(ModItems.COPPER_DUST);
                    event.accept(ModItems.OBSIDIAN_DUST);
                    event.accept(ModItems.IRON_DUST);
                    event.accept(ModItems.STEEL_DUST);

                    event.accept(ModItems.NIOBIUM_PLATE);
                    event.accept(ModItems.BRONZE_PLATE);
                    event.accept(ModItems.IRON_PLATE);
                    event.accept(ModItems.NEUTRONIUM_PLATE);
                    event.accept(ModItems.COPPER_PLATE);
                    event.accept(ModItems.OBSIDIAN_PLATE);
                    event.accept(ModItems.STEEL_PLATE);
                    event.accept(ModItems.TUNGSTEN_PLATE);
                    event.accept(ModItems.TITANIUM_PLATE);
                    event.accept(ModItems.TIN_PLATE);

                    event.accept(ModItems.HEAVY_DUTY_ALLOY);
                }
            if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
                {
                    event.accept(ModBlocks.TIN_ORE);
                    event.accept(ModBlocks.BLUESTONE_ORE);
                    event.accept(ModBlocks.TUNGSTEN_ORE);
                    event.accept(ModBlocks.TITANIUM_ORE);
                }
        }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
