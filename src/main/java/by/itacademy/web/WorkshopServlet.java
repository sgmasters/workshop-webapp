package by.itacademy.web;

import by.itacademy.web.command.Command;
import by.itacademy.web.command.CommandForRequest;
import by.itacademy.web.command.exception.IllegalCommandException;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WorkshopServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger(WorkshopServlet.class.getName());

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getServletPath();
        try {
            Command command = CommandForRequest.valueOf(req.getMethod(), uri);
            command.execute(req);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/main.jsp");
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            LOGGER.log(Level.DEBUG, "Unable to forward to requested dispatcher", e);
        } catch (IOException e) {
            LOGGER.log(Level.DEBUG, "Null forward request", e);
        } catch (IllegalCommandException e) {
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }
    }
}