
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftPlatesCreativeTabItemGroup;
import net.slothcraft.SlothCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothCraftElements.ModElement.Tag
public class NickelPlateItemItem extends SlothCraftElements.ModElement {
	@ObjectHolder("slothcraft:nickelplateitem")
	public static final Item block = null;
	public NickelPlateItemItem(SlothCraftElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftPlatesCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("nickelplateitem");
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
