package org.apache.jsp.factory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t  <meta charset=\"utf-8\">\n");
      out.write("\t  <title>FactoryFun</title>\n");
      out.write("\t  <link rel=\"stylesheet\" type=\"text/css\" href=\"/assets/factory/css/style.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"barre\"></div>\n");
      out.write("\t\t<table id=\"structure\">\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td style=\"width : 1%; height : 100%;\">\n");
      out.write("\t\t\t\t\t\t<table style=\"width : 100%; height : 100%;\">\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"height : 200px; vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width : 400px; height : 179px; background : url('/assets/factory/img/scoreboard.png'); background-size : 400px; background-repeat : no-repeat;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"scoreboard\" style=\"position : relative; left : 25px; top : 3px; width : 373px; height : 172px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"score\" style=\"position : absolute; height : 22px; width : 20px;\" src=\" /assets/factory/img/score.png\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button id=\"next\" class=\"btn_validation\">1er ROUND</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"background-color : rgba(250,100,100,0.4);\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"msg\" style=\"line-height : 20px;\">La machine MULTIFITTER nécessite d'être alimentée au niveau de son input gauche pour fonctionner correctement.</br>Ce problème doit être réglé si vous voulez passer au 2eme round.</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table style=\"width : 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width : 30%; vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"title\">CONNECTORS</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table id=\"connectors\" style=\"width : 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr></tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width : 70%; vertical-align : top;\"><div class=\"title\">CONTAINERS</div></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td style=\"text-align : center;\">\n");
      out.write("\t\t\t\t\t\t<table style=\"display : inline-block;\">\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"height : 630px; width : 778px; background-image : url('/assets/factory/img/plateau.png'); background-size : 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"plateau\" style=\"position : relative; left : 12px; top : 15px; width : 750px; height : 600px;\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td style=\"width : 20%;\">\n");
      out.write("\t\t\t\t\t\t<table style=\"width : 100%; height : 100%;\">\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"machines\" style=\"height : 25%; vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"title\">MACHINES</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"containers\" style=\"height : 25%; vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"title\">CONTAINERS</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"reservoirs\" style=\"height : 25%; vertical-align : top;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"title\">RESERVOIRS</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t  <script type=\"text/javascript\" src=\"/assets/factory/js/script.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
