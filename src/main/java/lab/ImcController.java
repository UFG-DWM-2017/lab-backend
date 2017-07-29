package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/imc")
public class ImcController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pesoStr = req.getParameter("peso");
        String alturaStr = req.getParameter("altura");
        String resultado = "";
        if (pesoStr != null && alturaStr != null) {
            int peso = Integer.parseInt(pesoStr);
            float altura = Float.parseFloat(alturaStr);

            ImcModel imcModel = new ImcModel();
            imcModel.setPeso(peso);
            imcModel.setAltura(altura);
            imcModel.calcular();

            resultado = imcModel.getResultado();
        }

        //Chamando o JSP com o atributo "resultado".
        req.setAttribute("resultado", resultado);
        req.getRequestDispatcher("imc-view.jsp").forward(req, resp);
    }

}
