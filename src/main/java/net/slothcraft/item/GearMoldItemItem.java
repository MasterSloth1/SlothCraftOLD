
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftGearsCreativeTabItemGroup;
import net.slothcraft.SlothCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothCraftElements.ModElement.Tag
public class GearMoldItemItem extends SlothCraftElements.ModElement {
	@ObjectHolder("slothcraft:gearmolditem")
	public static final Item block = null;
	public GearMoldItemItem(SlothCraftElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftGearsCreativeTabItemGroup.tab).maxStackSize(1));
			setRegistryName("gearmolditem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 64;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
