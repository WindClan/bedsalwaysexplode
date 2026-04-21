package windclan.bedsalwaysexplode;

import net.minecraft.block.BedBlock;
import net.minecraft.world.dimension.Dimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BedBlock.class)
public class BedBlockMixin {
	@Redirect(method = "onUse",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/world/dimension/Dimension;hasWorldSpawn()Z"))
	public boolean canRespawn(Dimension instance) {
		return false;
	}
}
