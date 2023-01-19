package fr.gugus.tuto.objet.block;

import fr.gugus.tuto.modTuto;
import fr.gugus.tuto.objet.block.classe_block.BlockTuto;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TutoBlock {
	
	public static final Block BLOCK_TUTO = new BlockTuto(Material.ROCK);
	
	public static void setBlockName(Block block, String name) {
		
		block.setRegistryName(modTuto.MODID, name).setUnlocalizedName(modTuto.MODID + "." + name);
		
	}

}
