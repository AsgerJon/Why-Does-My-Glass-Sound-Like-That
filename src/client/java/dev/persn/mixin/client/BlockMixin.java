package dev.persn.mixin.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import dev.persn.TagProvider;
import dev.persn.WDMGSLTClient;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(Block.class)
public class BlockMixin {
    
    @Inject(method = "spawnBreakParticles", at = @At("HEAD"), cancellable = true)
    private void onSpawnBreakParticles(World world, PlayerEntity player, BlockPos pos, BlockState state, CallbackInfo ci) {
        world.addBlockBreakParticles(pos, state);
        if (world.isClient) {
            boolean hasSilkTouch = EnchantmentHelper.hasAnyEnchantmentsIn(player.getMainHandStack(), EnchantmentTags.PREVENTS_BEE_SPAWNS_WHEN_MINING);
            if (hasSilkTouch && state.isIn(TagProvider.SILK_TOUCH_ALTERED_BREAK_SOUND)) {
                // Cancel the default particle spawn and sound
                ci.cancel();   
                world.playSound(player, pos, WDMGSLTClient.BLOCK_SILKTOUCH_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }   
    }
}
