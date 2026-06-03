package windclan.bedsalwaysexplode;


import net.minecraft.block.BedBlock;
import net.minecraft.world.dimension.Dimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BedBlock.class)
public class BedBlockMixin {
    @Redirect(method = "onActivated",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/dimension/Dimension;containsWorldSpawn()Z"))
    public boolean canRespawn(Dimension instance) {
        return false;
    }
}
