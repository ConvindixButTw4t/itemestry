package net.tw4t.itemestry.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tw4t.itemestry.Itemestry;

public class ModItems
    {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Itemestry.MODID);

        //ingots
        public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> BLUE_IRON_INGOT = ITEMS.register("blue_iron_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> RED_IRON_INGOT = ITEMS.register("red_iron_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> NIOBIUM_INGOT = ITEMS.register("niobium_ingot", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", ()-> new Item(new Item.Properties()));

        //dusts
        public static final DeferredItem<Item> BRONZE_DUST = ITEMS.register("bronze_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TIN_DUST = ITEMS.register("tin_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> STEEL_DUST = ITEMS.register("steel_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> BLUESTONE_DUST = ITEMS.register("bluestone_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> OBSIDIAN_DUST = ITEMS.register("obsidian_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> NIOBIUM_DUST = ITEMS.register("niobium_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust", ()-> new Item(new Item.Properties()));

        //plates
        public static final DeferredItem<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TIN_PLATE = ITEMS.register("tin_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> STEEL_PLATE = ITEMS.register("steel_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> NEUTRONIUM_PLATE = ITEMS.register("neutronium_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> IRON_PLATE = ITEMS.register("iron_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> TUNGSTEN_PLATE = ITEMS.register("tungsten_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> OBSIDIAN_PLATE = ITEMS.register("obsidian_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> NIOBIUM_PLATE = ITEMS.register("niobium_plate", ()-> new Item(new Item.Properties()));
        public static final DeferredItem<Item> COPPER_PLATE = ITEMS.register("copper_plate", ()-> new Item(new Item.Properties()));

        //alloys
        public static final DeferredItem<Item> HEAVY_DUTY_ALLOY = ITEMS.register("heavy_duty_alloy", ()-> new Item(new Item.Properties()));


        public static void register(IEventBus eventBus)
            {
                ITEMS.register(eventBus);
            }
    }
