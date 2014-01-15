/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class PcPlayer
{
    public static final PcPlayer INSTANCE = new PcPlayer();
    private final Random aRand = new Random();
    
    private PcPlayer()
    {
        
    }
    
    public void play(Game game) {
        
        int x = aRand.nextInt(3);
        int y = aRand.nextInt(3);
        while (game.getCase(x, y) != 0)
        {
            x = aRand.nextInt(3);
            y = aRand.nextInt(3);
        }
        
        game.play(x, y);
    }
}
