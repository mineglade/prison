package xyz.derkades.prisonglade.mines.nether;

import org.bukkit.Material;

import xyz.derkades.prisonglade.mines.PrisonMine;
import xyz.derkades.prisonglade.mines.PrisonMineFactory;

public class NetherC extends NetherLevel {

	@Override
	public char getChar() {
		return 'C';
	}

	@Override
	public PrisonMine getMine() {
		return new PrisonMineFactory(this.getWorld(), 0, 58, 5, 12, 41, 17, Material.NETHERRACK)
				.addBlock(Material.SOUL_SAND, 0.12f)
				.addBlock(Material.GRAVEL, 0.05f)
				.addBlock(Material.GLOWSTONE, 0.12f)
				.addBlock(Material.OBSIDIAN, 0.07f)
				.addBlock(Material.NETHER_BRICK, 0.08f)
				.addBlock(Material.NETHER_FENCE, 0.06f)
				.addBlock(Material.NETHER_WART_BLOCK, 0.015f)
				.create();
	}

}
