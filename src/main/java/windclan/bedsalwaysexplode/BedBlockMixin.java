package windclan.bedsalwaysexplode;

import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.dimension.Dimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BedBlock.class)
public class BedBlockMixin {
    @Redirect(method = "use",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/dimension/Dimension;mayRespawn()Z"))
    public boolean canRespawn(Dimension instance) {
        return false;
    }
}
