package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(urlPatterns = {"/entryServlet"})
public class EntryServlet extends HttpServlet
{
    private Game g;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String message = "You choose to play " + request.getParameter("order");
        
        Game m = new Game();
        request.getSession().setAttribute("game", g);

        request.setAttribute("message", message);
        request.setAttribute("pic1", "/Blank.png");
        request.setAttribute("pic2", "/Blank.png");
        request.setAttribute("pic3", "/Blank.png");
        
        request.setAttribute("pic4", "/Blank.png");
        request.setAttribute("pic5", "/Blank.png");
        request.setAttribute("pic6", "/Blank.png");

        request.setAttribute("pic7", "/Blank.png");
        request.setAttribute("pic8", "/Blank.png");
        request.setAttribute("pic9", "/Blank.png");
        
        if(request.getParameter("order").equals("second"))
        {
            
            this.g = (Game) request.getSession().getAttribute("game");
        
            try {
                PcPlayer.INSTANCE.play(g);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        switch (g.getCase(i, j)) {
                            case 1:
                                request.setAttribute("pic" + i + j, "Cross.png");
                                break;
                            case 2:
                                request.setAttribute("pic" + i + j, "Circle.png");
                                break;
                            default:
                                request.setAttribute("pic" + i + j, "Blank.png");
                                break;
                        }
                    }
                }
            }
            catch (Exception e)
            {
                request.setAttribute("error", e.getStackTrace());
            }
        }
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
