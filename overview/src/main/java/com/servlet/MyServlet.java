package com.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet", asyncSupported = true)  // 支持servlet3.0--异步操作
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 异步上下文
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(()->{
            try{
                resp.getWriter().println("hello world");
                // 进行显示完成
                asyncContext.complete();
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
