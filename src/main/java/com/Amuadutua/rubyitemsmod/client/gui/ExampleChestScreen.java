package com.Amuadutua.rubyitemsmod.client.gui;

import com.Amuadutua.rubyitemsmod.RubyItems;
import com.Amuadutua.rubyitemsmod.container.ExampleChestContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ExampleChestScreen extends ContainerScreen<ExampleChestContainer> implements IHasContainer<ExampleChestContainer> {
    /** The ResourceLocation containing the chest GUI texture. */
    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation("textures/gui/example_chest.png");
    /** Window height is calculated with these values; the more rows */
    private final int inventoryRows;

    public ExampleChestScreen(ExampleChestContainer p_i51095_1_, PlayerInventory p_i51095_2_, ITextComponent p_i51095_3_) {
        super(p_i51095_1_, p_i51095_2_, p_i51095_3_);
        this.passEvents = false;
        int i = 222;
        int j = 114;
        this.inventoryRows = 3;
        this.ySize = 114 + this.inventoryRows * 18;
        this.field_238745_s_ = this.ySize - 94;
    }

    @Override
    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        this.renderBackground(p_230430_1_);
        super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        this.func_230459_a_(p_230430_1_, p_230430_2_, p_230430_3_);
    }

    @Override
    protected void func_230450_a_(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(BACKGROUND_TEXTURE);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.blit(p_230450_1_, i, j, 0, 0, this.xSize, this.inventoryRows * 18 + 17);
        this.blit(p_230450_1_, i, j + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
    }
}

