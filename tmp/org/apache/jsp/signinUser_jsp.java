package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signinUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\"  content=\"text/html\"; charset=\"utf-8\" />\n");
      out.write("        <title>Inscription </title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/views/partials/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("          body {\n");
      out.write("            padding-top: 40px;\n");
      out.write("            padding-bottom: 40px;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          .form-signin {\n");
      out.write("            max-width: 500px;\n");
      out.write("            padding: 19px 29px 42px;\n");
      out.write("            margin: 0 auto 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #e5e5e5;\n");
      out.write("            -webkit-border-radius: 5px;\n");
      out.write("               -moz-border-radius: 5px;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("               -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("                    box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("          }\n");
      out.write("          .form-signin .form-signin-heading,\n");
      out.write("          .form-signin .checkbox {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("          }\n");
      out.write("          .form-signin input[type=\"text\"],\n");
      out.write("          .form-signin input[type=\"password\"] {\n");
      out.write("            font-size: 16px;\n");
      out.write("            height: auto;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            padding: 7px 9px;\n");
      out.write("          }\n");
      out.write("        .form-bottom {\n");
      out.write("            width: 200px;\n");
      out.write("            float: right;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form method=\"POST\" action=\"/SignInUser\" enctype=\"multipart/form-data\" class=\"form-signin\">\n");
      out.write("\n");
      out.write("                <h3>Informations personnelles</h3>\n");
      out.write("                    \n");
      out.write("                <div class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ style }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ message }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("                <label for=\"username\">Pseudo <span class=\"requis\">*</span></label>\n");
      out.write("                <input type=\"text\" id=\"username\" name=\"username\" value=\"\"  class=\"input-block-level\" required/>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"lastname\">Nom <span class=\"requis\">*</span></label>\n");
      out.write("                <input type=\"text\" id=\"lastname\" name=\"lastname\" value=\"\" class=\"input-block-level\" required/>\n");
      out.write("                <br />\n");
      out.write("                \n");
      out.write("                <label for=\"firstname\">Prénom <span class=\"requis\">*</span></label>\n");
      out.write("                <input type=\"text\" id=\"firstname\" name=\"firstname\" value=\"\"  class=\"input-block-level\" required/>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"password\">Mot de passe <span class=\"requis\">*</span></label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" value=\"\" class=\"input-block-level\" required/>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"passwordConfirm\">Confirmation du mot de passe <span class=\"requis\">*</span></label>\n");
      out.write("                <input type=\"password\" id=\"passwordConfirm\" name=\"passwordConfirm\" value=\"\" class=\"input-block-level\" required/>\n");
      out.write("                <br />\n");
      out.write("                \n");
      out.write("                <label for=\"email\">Adresse email <span class=\"requis\">*</span></label>\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" value=\"\" class=\"input-block-level\" required/>\n");
      out.write("                <br />\n");
      out.write("\n");
      out.write("                <label for=\"avatar\"> Avatar </label>\n");
      out.write("                <input type=\"file\" id=\"avatar\" name=\"avatar\" value=\"\" class=\"input-block-level\"/>\n");
      out.write("                <br /><br />\n");
      out.write("\n");
      out.write("                <div class=\"form-bottom\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\">Valider</button>\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-danger\">Remettre à zéro </button><br />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
