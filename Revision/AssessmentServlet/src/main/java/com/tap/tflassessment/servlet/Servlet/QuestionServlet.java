package com.tap.tflassessment.servlet.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tflassessment.servlet.Entities.QuestionModel;
import com.tap.tflassessment.servlet.Services.QuestionServiceImpl;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/questions")
public class QuestionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws  ServerException,IOException{

        PrintWriter out = response.getWriter();
         try {
            QuestionServiceImpl srv = new QuestionServiceImpl();

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            List <QuestionModel> questions=srv.getAllQuestions();

            ObjectMapper mapper=new ObjectMapper();
            mapper.writeValue(out, questions);

         } catch (Exception e) {
            out.println(e);
         }
    }
}
