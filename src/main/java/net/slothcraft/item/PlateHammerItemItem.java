
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftPlatesCreativeTabItemGroup;
import net.slothcraft.SlothCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothCraftElements.ModElement.Tag
public class PlateHammerItemItem extends SlothCraftElements.ModElement {
	@ObjectHolder("slothcraft:platehammeritem")
	public static final Item block = null;
	public PlateHammerItemItem(SlothCraftElements instance) {
		super(instance, 139);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftPlatesCreativeTabItemGroup.tab).maxDamage(64));
			setRegistryName("platehammeritem");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemStack) {
			return new ItemStack(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
