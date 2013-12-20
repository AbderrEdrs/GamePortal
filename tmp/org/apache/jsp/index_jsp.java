package org.apache.jsp;

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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/views/partials/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  body {\n");
      out.write("    padding-top: 40px;\n");
      out.write("    padding-bottom: 40px;\n");
      out.write("    background-color: #f5f5f5;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .form-signin {\n");
      out.write("    max-width: 300px;\n");
      out.write("    padding: 19px 29px 29px;\n");
      out.write("    margin: 0 auto 20px;\n");
      out.write("    background-color: #fff;\n");
      out.write("    border: 1px solid #e5e5e5;\n");
      out.write("    -webkit-border-radius: 5px;\n");
      out.write("       -moz-border-radius: 5px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("    -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("       -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("            box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("  }\n");
      out.write("  .form-signin .form-signin-heading,\n");
      out.write("  .form-signin .checkbox {\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("  }\n");
      out.write("  .form-signin input[type=\"text\"],\n");
      out.write("  .form-signin input[type=\"password\"] {\n");
      out.write("    font-size: 16px;\n");
      out.write("    height: auto;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    padding: 7px 9px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ style }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ message }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("  <form method=\"POST\" class=\"form-signin\" action=\"/ServletUsers\">\n");
      out.write("    <h2 class=\"form-signin-heading\">Connexion</h2>\n");
      out.write("    <input name=\"email\" type=\"email\" class=\"input-block-level\" placeholder=\"Adresse email\">\n");
      out.write("    <input name=\"password\" type=\"password\" class=\"input-block-level\" placeholder=\"Mot de passe\">\n");
      out.write("    <label class=\"checkbox\">\n");
      out.write("      <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("    </label>\n");
      out.write("    <label>Pas de compte! créez-en <a href=\"signinUser.jsp\">ici</a></label>\n");
      out.write("    <button class=\"btn btn-large btn-primary\" type=\"submit\">Connexion</button>\n");
      out.write("  </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/views/partials/footer.jsp", out, false);
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
