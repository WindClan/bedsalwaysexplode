package windclan.bedsalwaysexplode;

import net.minecraft.core.block.BlockLogicBed;
import net.minecraft.core.world.type.WorldType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BlockLogicBed.class)
public class BlockLogicBedMixin {
	@Redirect(method = "onBlockRightClicked",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/type/WorldType;mayRespawn()Z"))
	public boolean canRespawn(WorldType instance) {
		return false;
	}
}
