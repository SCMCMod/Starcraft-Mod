package ga.scmc.log;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Handles all of the registry involved with the starcraft logs.
 * 
 * @author Ocelot5836
 */
public class LogRegistry {

	private Map<Integer, Log> logs;

	public LogRegistry() {
		logs = new HashMap<Integer, Log>();
	}
	
	public void init() {
		this.registerLogs();
	}

	@SideOnly(Side.CLIENT)
	private void registerLogs() {
		register(new Log(0, "test"));
	}

	public void register(Log log) {
		if (!this.logs.containsKey(log.getId())) {
			this.logs.put(log.getId(), log);
		} else {
			throw new RuntimeException("You cannot register two logs with the same id!");
		}
	}

	public Log getRegisteredLog(int id) {
		return this.logs.get(id);
	}

	public String getRegistryName(Log log) {
		return log.getRegistryName();
	}

	public Map<Integer, Log> getLogs() {
		return new HashMap<Integer, Log>(logs);
	}
}