
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftGearsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothcraftModElements.ModElement.Tag
public class ZincGearItemItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:zincgearitem")
	public static final Item block = null;
	public ZincGearItemItem(SlothcraftModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftGearsCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("zincgearitem");
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
