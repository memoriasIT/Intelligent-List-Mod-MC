package com.memoriasIT.recipemod.client.gui;

import com.memoriasIT.recipemod.RecipeMod;
import com.memoriasIT.recipemod.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class intelligentlistgui extends GuiScreen {

    ResourceLocation window = new ResourceLocation(RecipeMod.MODID, "textures/gui/window.png");
    int guiWidth = 252;
    int guiHeight = 186;

    exitButtonGUI exitButton;


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        // Set background alpha 50% black
        drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(window);

        // Center GUI
        int centerX = (width/2)  - guiWidth/2;
        int centerY = (height/2) - guiHeight/2;

        // Draw GUI window
        drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);

        // Draw title in window
        int titleX = centerX+guiWidth/18;
        int titleY = centerY+3*guiHeight/4;
        GL11.glPushMatrix();{ // 1.5x height title
            GlStateManager.translate(titleX, titleY, 0);
            GlStateManager.scale(1.5,1.5,1.5);
            fontRenderer.drawStringWithShadow("Intelligent List", 0,0, 0xFFFFFF);
        }
        GL11.glPopMatrix();

        // Subtitle
        drawString(fontRenderer, "Place paper on the right", titleX+3, titleY+15, 0xFFFFFF);
        drawString(fontRenderer, "Then select desired craftings", titleX+3, titleY+25, 0xFFFFff);

        // exit button TODO: FIX THIS; IT CRASHES
        //exitButton.drawButton(mc, mouseX, mouseY, partialTicks);

        // test render item
        mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.intelligentlist), centerX, centerY);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }


    // Called on init and window resize
    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
    }


    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }

}
