package xyz.derkades.prisonglade.themes;

import org.bukkit.Material;

public enum Theme {

	FARM("Farm", "Farm description", Material.STONE_HOE),
	NETHER("Nether", "Nether description", Material.NETHERRACK),
	END("End", "End description", Material.ENDER_STONE),
	WATER("Water", "Water description", Material.WATER_BUCKET),
	COLD("Cold", "Cold description", Material.ICE),
	DESERT("Desert", "Desert description", Material.SAND),
	STONE("Stone", "Stone description", Material.STONE),
	;

	private String name;
	private String description;
	private Material guiIcon;

	Theme(final String name, final String description, final Material guiIcon){
		this.name = name;
		this.description = description;
		this.guiIcon = guiIcon;
	}

	@Deprecated
	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public Material getGuiIcon() {
		return this.guiIcon;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
