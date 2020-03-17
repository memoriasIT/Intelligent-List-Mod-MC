package com.memoriasIT.recipemod.client.gui;

import com.memoriasIT.recipemod.RecipeMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class exitButtonGUI extends GuiButton {

    final ResourceLocation texture = new ResourceLocation(RecipeMod.MODID, "textures/gui/window.png");

    int buttonWidth  = 13;
    int buttonHeight = 13;
    int u = 0;
    int v = 185;

    public exitButtonGUI(int buttonId, int x, int y) {
        super(buttonId, x, y, "");
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if (visible){
            mc.renderEngine.bindTexture(texture);
            if (mouseX >= x && mouseX <= x + width && mouseY <= y && mouseY <= y + height){
                u = 13;
            } else {
                u = 0;
            }
            drawTexturedModalRect(x, y, u, v, width, height);
        }
    }
}
