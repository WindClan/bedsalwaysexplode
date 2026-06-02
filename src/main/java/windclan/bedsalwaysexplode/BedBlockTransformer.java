package windclan.bedsalwaysexplode;

import nilloader.api.lib.mini.MiniTransformer;
import nilloader.api.lib.mini.PatchContext;
import nilloader.api.lib.mini.annotation.Patch;

@Patch.Class("net.minecraft.src.BlockBed")
public class BedBlockTransformer extends MiniTransformer {
	@Patch.Method("onBlockActivated(Lnet/minecraft/src/World;IIILnet/minecraft/src/EntityPlayer;IFFF)Z")
	public void patchClinit(PatchContext ctx) {
		ctx.search(INVOKEVIRTUAL("net/minecraft/src/WorldProvider", "canRespawnHere", "()Z")).jumpAfter();
		ctx.add(INVOKESTATIC("windclan/bedsalwaysexplode/BedBlockTransformer$Hooks", "alwaysReturnFalse", "()Z"));
	}
	public static class Hooks {
		public static boolean alwaysReturnFalse() {
			return false;
		}
	}
}
