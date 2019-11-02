package com.krupoderov.game.tiles.blocks;

import com.krupoderov.game.util.AABB;
import com.krupoderov.game.util.Vector2f;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Krupoderov Mikhail on Nov, 2019
 */
public class NormBlock extends Block {

    public NormBlock(BufferedImage img, Vector2f pos, int w, int h) {
        super(img, pos, w, h);
    }

    @Override
    public boolean update(AABB p) {
        return false;
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);
    }
}
