package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>Profil utilisateur</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/views/partials/header.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write("    \t#tab1 {\n");
      out.write("\t\t    margin-top: 18px;\n");
      out.write("\t\t}\n");
      out.write("\t\ttable {\n");
      out.write("\t\t    border-collapse: collapse;\n");
      out.write("\t\t    border-spacing: 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t#col1 {\n");
      out.write("\t\t    color: #006EA7;\n");
      out.write("\t\t    font-size: 12px;\n");
      out.write("\t\t    font-weight: bold;\n");
      out.write("\t\t    width: 163px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#col2 {\n");
      out.write("\t\t    color: #646464;\n");
      out.write("\t\t    font-size: 12px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("    \t<pre>\n");
      out.write("    \t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t</pre>\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"hero-unit\">\n");
      out.write("    \t\t\t<h3> Profil </h3><hr>\n");
      out.write("\t\t        ");
      out.write("\n");
      out.write("\t\t        <div class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ style }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ message }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t        ");
      out.write("\n");
      out.write("\t\t        <div><img src=\"/assets/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.avatar }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\n");
      out.write("\t\t        <table id=\"tab1\">\n");
      out.write("\t\t\t\t\t<tbody><tr>\n");
      out.write("\t\t\t\t\t<td id=\"col1\">Pseudo</td>\n");
      out.write("\t\t\t\t\t<td id=\"col2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td id=\"col1\">Nom</td>\n");
      out.write("\t\t\t\t\t<td id=\"col2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.lastname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td id=\"col1\">Prénom</td>\n");
      out.write("\t\t\t\t\t<td id=\"col2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.firstname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td id=\"col1\">Email</td>\n");
      out.write("\t\t\t\t\t<td id=\"col2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.email }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<form method=\"POST\" action=\"/UpdateProfilServelt\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.username }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"lastname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.lastname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"firstname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.firstname }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ user.email }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"update\" value=\"showprofil\"/>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" href=\"/updateProfil.jsp\">Modifier mon profil</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t    </div>\t\n");
      out.write("\t    </div>\n");
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
