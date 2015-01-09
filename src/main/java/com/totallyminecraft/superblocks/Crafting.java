package com.totallyminecraft.superblocks;

import com.totallyminecraft.superblocks.blocks.ModBlocks;
import com.totallyminecraft.superblocks.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Jake on 1/3/2015.
 */
public class Crafting {

    private static int j;

    public static void init() {

      //  GameRegistry.addRecipe(new ItemStack(ModItems.bucketpetrochemicalItem), new Object[]{"###", "#*#", "###", '#', new ItemStack(Items.coal, 1, 1), '*', Items.water_bucket});
     //   GameRegistry.addRecipe(new ItemStack(ModBlocks.rawplasticBlock, 16, 16), new Object[]{"###", "#*#", "###", '#', Blocks.sand, '*', ModItems.bucketpetrochemicalItem});




        for (int i = 0; i < 16; i++) {

            j = 15-i;

            GameRegistry.addRecipe(new ItemStack(ModBlocks.rawplasticBlock, 16, j), new Object[]{"###", "#*#", "###", '#', ModBlocks.rawplasticBlock, '*', new ItemStack(Items.dye, 1, i)});
            GameRegistry.addSmelting(new ItemStack(ModBlocks.rawplasticBlock, 1, i), new ItemStack(ModBlocks.plasticBlock, 1, i), 0F);
        }

        for (int i = 0; i < 16; i++) {

            GameRegistry.addSmelting(new ItemStack(ModBlocks.plasticBlock, 1, i), new ItemStack(ModBlocks.edgedplasticBlock, 1, i), 0F);
        }

            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredobsidianBlock, 8, 0), new Object[]{"###", "#*#", "###", '#', Blocks.obsidian, '*', new ItemStack(Items.water_bucket)});

        for (int i = 1; i < 16; i++) {

            j = 15-i;

            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredobsidianBlock, 8, i), new Object[]{"###", "#*#", "###", '#', new ItemStack(ModBlocks.coloredobsidianBlock, 1, 0), '*', new ItemStack(Items.dye, 1, j)});
        }


        GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredemeraldBlock, 8, 0), new Object[]{"###", "#*#", "###", '#', Blocks.emerald_block, '*', new ItemStack(Items.water_bucket)});


        for (int i = 1; i < 16; i++) {

            j = 15-i;

            GameRegistry.addRecipe(new ItemStack(ModBlocks.coloredemeraldBlock, 8, i), new Object[]{"###", "#*#", "###", '#', new ItemStack(ModBlocks.coloredemeraldBlock, 1, 0), '*', new ItemStack(Items.dye, 1, j)});
            GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 9), new Object[]{new ItemStack(ModBlocks.coloredemeraldBlock,1,i)});
        }

    }
}
