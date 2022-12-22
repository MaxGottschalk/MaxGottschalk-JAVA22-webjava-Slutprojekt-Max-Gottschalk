package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetTheWeather;
import model.WeatherBean;

@WebServlet("/OWservlet")
public class OWservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String cityStr = request.getParameter("city");
		String countryStr = request.getParameter("country");

		WeatherBean wBean = new WeatherBean(cityStr, countryStr);

		GetTheWeather.getWeather(wBean);

		request.setAttribute("wBean", wBean);
		
		
		Cookie Cookie = new Cookie("Cookie", cityStr + "-" +countryStr);
		
		
		Cookie.setMaxAge(30);
		response.addCookie(Cookie);


		RequestDispatcher rd = request.getRequestDispatcher("view/showWeather.jsp");
		rd.forward(request, response);
	}

}
