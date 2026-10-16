package com.example.structurewandmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class StructureWandItem extends Item {
    public StructureWandItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            // Open GUI here
        }
        return ActionResult.SUCCESS;
    }
}
