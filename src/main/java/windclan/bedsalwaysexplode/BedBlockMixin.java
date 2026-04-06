package windclan.bedsalwaysexplode;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BedBlock.class)
public class BedBlockMixin {
    @Inject(method = "canSetSpawn", at=@At("HEAD"),cancellable = true)
    private static void canSetSpawn(Level lvl, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
