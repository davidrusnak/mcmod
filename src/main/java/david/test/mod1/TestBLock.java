package david.test.mod1;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TestBLock implements ModInitializer {

	public static final Item TEST_BLOCK1 = new Item(new Item.Settings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("testmod1" /*mod id*/, "test_block1"), TEST_BLOCK1);
	}
}
