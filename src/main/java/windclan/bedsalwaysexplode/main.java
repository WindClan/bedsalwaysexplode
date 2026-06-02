package windclan.bedsalwaysexplode;

import nilloader.api.ClassTransformer;
import nilloader.api.ModRemapper;
import nilloader.api.NilLogger;

// All entrypoint classes must implement Runnable.
public class main implements Runnable {

	// NilLoader comes with a logger abstraction that Does The Right Thing depending on the environment.
	// You should always use it.
	public static final NilLogger log = NilLogger.get("BedsAlwaysExplode");
	
	@Override
	public void run() {
		log.info("Hello from premain!");
		ModRemapper.setTargetMapping("default");
		ClassTransformer.register(new BedBlockTransformer());
	}

}
