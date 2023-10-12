package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.service.EventService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("")
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        EventService eventService = new EventService();
    }
}
