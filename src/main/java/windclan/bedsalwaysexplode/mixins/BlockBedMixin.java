package windclan.bedsalwaysexplode.mixins;

import net.minecraft.block.BlockBed;
import net.minecraft.world.WorldProvider;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BlockBed.class)
public class BlockBedMixin {

    @Redirect(
        method = "onBlockActivated",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/world/WorldProvider;canRespawnHere()Z"))
    public boolean canRespawn(WorldProvider instance) {
        return false;
    }
}
