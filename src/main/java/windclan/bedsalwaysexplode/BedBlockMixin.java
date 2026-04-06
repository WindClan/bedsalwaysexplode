package windclan.bedsalwaysexplode;

import net.minecraft.world.attribute.BedRule;
import net.minecraft.world.level.block.BedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BedBlock.class)
public class BedBlockMixin {
    @Redirect(method = "useWithoutItem",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/attribute/BedRule;explodes()Z"))
    public boolean explodes(BedRule instance) {
        return true;
    }
}
