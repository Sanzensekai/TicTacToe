/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author ASUS
 */
public class Game
{
    private int turn = 1;
    private int[][] grid;
    private static boolean finished = false;
    
    public Game()
    {
        Game.finished = false;
        this.grid = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                grid[i][j] = 0;
            }
        }
    }
    
    public void play(int x, int y) throws IllegalStateException
    {
        if (checkCircles()==true || checkCrosses()==true || checkNullGame() == true)
        {
            Game.finished = true;
        }
        
        else
        {
            if (grid[x][y] != 0) 
            {
                throw new IllegalStateException("erreur !");
            } 
            
            else
            {
                grid[x][y] = 1 + turn;
                turn = 1 - turn;
            }
        }
        
    }
    
    public int getCase(int x, int y)
    {
        return grid[x][y];
    }

    public boolean checkCircles()
    {
        for(int i = 0; i>3 ; i++)
        {  
            if((this.grid[i][0] == 2 && this.grid[i][0] == this.grid[i][1] && this.grid[i][0] == this.grid[i][2]) // Check lines
             ||(this.grid[0][i] == 2 && this.grid[0][i] == this.grid[1][i] && this.grid[0][i] == this.grid[2][i])) // Check columns
            {
                return true;
            }
        }
        
        if((this.grid[0][0] == 2 && this.grid[0][0] == this.grid[1][1] && this.grid[0][0] == this.grid[2][2]) // Check first diagonal   
         ||(this.grid[0][2] == 2 && this.grid[0][2] == this.grid[1][1] && this.grid[0][2] == this.grid[2][0]))// Check second diagonal
        {
            return true;
        }
        
        return false;
    }
    
    public boolean checkCrosses()
    {
        for(int i = 0; i>3 ; i++)
        {  
            if((this.grid[i][0] == 1 && this.grid[i][0] == this.grid[i][1] && this.grid[i][0] == this.grid[i][2]) // Check lines
             ||(this.grid[0][i] == 1 && this.grid[0][i] == this.grid[1][i] && this.grid[0][i] == this.grid[2][i])) // Check columns
            {
                return true;
            }
        }
        
        if((this.grid[0][0] == 1 && this.grid[0][0] == this.grid[1][1] && this.grid[0][0] == this.grid[2][2]) // Check first diagonal   
         ||(this.grid[0][2] == 1 && this.grid[0][2] == this.grid[1][1] && this.grid[0][2] == this.grid[2][0]))// Check second diagonal
        {
            return true;
        }
        
        return false;
    }
    
    public boolean checkNullGame()
    {
        /*
        for(int i = 0; i>3 ; i++)
        {  
           for(int j = 0; j>3; j++)
           {
               if(this.grid[i][j] != 1 && this.grid[i][j] != 2)
               {
                   return false;
               }
           }
        }
        return true;
        * */
        return false;
    }
    
    public static boolean isFinished()
    {
        return Game.finished;
    }
}
