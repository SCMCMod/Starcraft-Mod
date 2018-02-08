package ga.scmc.log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import ga.scmc.api.Utils;
import ga.scmc.lib.Library;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.util.ResourceLocation;

/**
 * Contains the basic information for each log in the game. Used in the new
 * registry system.
 * 
 * @author Ocelot5836
 */
public class Log implements IResourceManagerReloadListener {

	/** The containing folder of the logs */
	public static final ResourceLocation DEFAULT_LOCATION = new ResourceLocation(Library.RL_BASE + "texts/logs/");

	private int id;
	private String fileName;
	private String propertiesFileName;

	private String name;
	private int skinId;
	private List<String> text;

	public Log(int id, String fileName) {
		this.id = id;
		this.fileName = fileName;
		this.propertiesFileName = this.getRegistryName() + ".properties";
		this.loadText();
		((IReloadableResourceManager) Minecraft.getMinecraft().getResourceManager()).registerReloadListener(this);
	}

	private void loadProperties() {
		try {
			InputStream is = Minecraft.getMinecraft().getResourceManager().getResource(this.getPropertiesLocation()).getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String next = reader.readLine();
			while (next != null) {
				this.name = next;
				next = reader.readLine();
				this.skinId = Integer.parseInt(next);
				break;
			}
			reader.close();
		} catch (Exception e) {
			Utils.getLogger().catching(e);
			Utils.getLogger().warn("Could not load properties for file " + this.getLocation().toString() + "!");
		}
	}

	private List<String> loadTextFromFile(ResourceLocation location) {
		List<String> output = new ArrayList<String>();
		try {
			InputStreamReader is = new InputStreamReader(Minecraft.getMinecraft().getResourceManager().getResource(location).getInputStream());
			BufferedReader reader = new BufferedReader(is);
			String line = reader.readLine();
			while (line != null) {
				output.add(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

	private void loadText() {
		this.name = "Missing Name";
		this.skinId = 0;
		this.text = new ArrayList<String>();
		try {
			InputStreamReader is = new InputStreamReader(Minecraft.getMinecraft().getResourceManager().getResource(this.getLocation()).getInputStream());
			BufferedReader reader = new BufferedReader(is);
			String line = reader.readLine();
			while (line != null) {
				if (line.startsWith("#")) {
					String[] tokens = line.split(":", 2);
					if (tokens.length >= 1) {
						if (line.contains("name")) {
							this.name = tokens[1];
						}
						if (line.contains("skinId")) {
							this.skinId = Integer.parseInt(tokens[1]);
						}
					}

					line = reader.readLine();
					continue;
				}
				text.add(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ResourceLocation getLocation() {
		return new ResourceLocation(DEFAULT_LOCATION.toString() + this.getFileName());
	}

	public ResourceLocation getPropertiesLocation() {
		return new ResourceLocation(DEFAULT_LOCATION.toString() + propertiesFileName);
	}

	public int getId() {
		return id;
	}

	public String getFileName() {
		return fileName + ".txt";
	}

	public String getRegistryName() {
		return this.fileName;
	}

	public int getSkinId() {
		return skinId;
	}

	public String getTitle() {
		return name;
	}

	public List<String> getText() {
		return text;
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {
		this.loadText();
	}
}