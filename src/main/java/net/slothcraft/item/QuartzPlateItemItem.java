
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftPlatesCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothcraftModElements.ModElement.Tag
public class QuartzPlateItemItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:quartzplateitem")
	public static final Item block = null;
	public QuartzPlateItemItem(SlothcraftModElements instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftPlatesCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("quartzplateitem");
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
