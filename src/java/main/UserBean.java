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
public class UserBean
{

    private boolean starter;
    private boolean start;
    
    public void startGame()
    {
        setStart(true);
    }

    public void setStartByUser(boolean startByUser)
    {
        this.setStarter(startByUser);
    }

    /**
     * @return the starter
     */
    public boolean isStarter()
    {
        return starter;
    }

    /**
     * @param starter the starter to set
     */
    public void setStarter(boolean starter)
    {
        this.starter = starter;
    }

    /**
     * @return the start
     */
    public boolean isStart()
    {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(boolean start)
    {
        this.start = start;
    }
    
}
