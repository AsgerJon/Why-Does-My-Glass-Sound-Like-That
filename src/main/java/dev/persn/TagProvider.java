package dev.persn;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class TagProvider extends FabricTagProvider.BlockTagProvider {

    public TagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> SILK_TOUCH_ALTERED_BREAK_SOUND = TagKey.of(RegistryKeys.BLOCK, Identifier.of("wdmgslt:silk_touch_altered_break_sound"));


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SILK_TOUCH_ALTERED_BREAK_SOUND)
            .add(Blocks.GLASS)
            .add(Blocks.GLASS_PANE)
            .add(Blocks.TINTED_GLASS)
            .add(Blocks.WHITE_STAINED_GLASS)
            .add(Blocks.ORANGE_STAINED_GLASS)
            .add(Blocks.MAGENTA_STAINED_GLASS)
            .add(Blocks.LIGHT_BLUE_STAINED_GLASS)
            .add(Blocks.YELLOW_STAINED_GLASS)
            .add(Blocks.LIME_STAINED_GLASS)
            .add(Blocks.PINK_STAINED_GLASS)
            .add(Blocks.GRAY_STAINED_GLASS)
            .add(Blocks.LIGHT_GRAY_STAINED_GLASS)
            .add(Blocks.CYAN_STAINED_GLASS)
            .add(Blocks.PURPLE_STAINED_GLASS)
            .add(Blocks.BLUE_STAINED_GLASS)
            .add(Blocks.BROWN_STAINED_GLASS)
            .add(Blocks.GREEN_STAINED_GLASS)
            .add(Blocks.RED_STAINED_GLASS)
            .add(Blocks.BLACK_STAINED_GLASS)
            .add(Blocks.WHITE_STAINED_GLASS_PANE)
            .add(Blocks.ORANGE_STAINED_GLASS_PANE)
            .add(Blocks.MAGENTA_STAINED_GLASS_PANE)
            .add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
            .add(Blocks.YELLOW_STAINED_GLASS_PANE)
            .add(Blocks.LIME_STAINED_GLASS_PANE)
            .add(Blocks.PINK_STAINED_GLASS_PANE)
            .add(Blocks.GRAY_STAINED_GLASS_PANE)
            .add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
            .add(Blocks.CYAN_STAINED_GLASS_PANE)
            .add(Blocks.PURPLE_STAINED_GLASS_PANE)
            .add(Blocks.BLUE_STAINED_GLASS_PANE)
            .add(Blocks.BROWN_STAINED_GLASS_PANE)
            .add(Blocks.GREEN_STAINED_GLASS_PANE)
            .add(Blocks.RED_STAINED_GLASS_PANE)
            .add(Blocks.BLACK_STAINED_GLASS_PANE);
    }
}



