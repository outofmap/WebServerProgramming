/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2015-07-28 14:54:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/./commons/_head.jspf", Long.valueOf(1437556686000L));
    _jspx_dependants.put("/./commons/_top.jspf", Long.valueOf(1438095200000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>SLiPP</title>\n");
      out.write("\n");
      out.write("<link href=\"./stylesheets/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"./stylesheets/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"./stylesheets/docs.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"./stylesheets/main.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    padding-top: 40px;\n");
      out.write("  }\n");
      out.write("</style>");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
      out.write('\n');
 
	request.setCharacterEncoding("UTF-8");

      out.write("\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          \n");
      out.write("          <a class=\"brand\" href=\"/\">지속가능한 삶, 프로그래밍, 프로그래머</a>\n");
      out.write("          <div class=\"nav-collapse collapse\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("            \n");

	Object userId = session.getAttribute("userId");	

      out.write("\n");
      out.write("              <li><a href=\"./index.jsp\">Home</a></li>\n");

	if(userId == null){
 
      out.write("\n");
      out.write("              <li><a href=\"./login.jsp\">로그인</a></li>\n");
      out.write("              <li><a href=\"./form.jsp\">회원가입</a></li> \n");
 
	} 
	else {

      out.write("       \n");
      out.write("              <li><a href=\"/users/logout\">로그아웃</a></li>\n");
      out.write("              <li><a href=\"#\">개인정보수정</a></li> \n");
 
	}

      out.write("   \n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" ");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<header class=\"jumbotron subhead\" id=\"overview\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>SLiPP</h1>\n");
      out.write("\t\t<p class=\"lead\">Sustaninable Life, Programming, Programmer</p>\n");
      out.write("\t</div>\n");
      out.write("\t</header>     \n");
      out.write("    \n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t        <table class=\"table\">\n");
      out.write("\t\t            <tr>\n");
      out.write("\t\t                <td span=\"3\">사용자 아이디</td>\n");
      out.write("\t\t                <td span=\"3\">이름</td>\n");
      out.write("\t\t                <td span=\"3\">이메일</td>\n");
      out.write("\t\t                <td></td>\n");
      out.write("\t\t            </tr>\n");
      out.write("\t                <tr>\n");
      out.write("\t                    <td>javajigi</td>\n");
      out.write("\t                    <td>박재성</td>\n");
      out.write("\t                    <td>javajigi@slipp.net</td>\n");
      out.write("\t                    <td><a href=\"\">수정</a></td>\n");
      out.write("\t                </tr>\n");
      out.write("\t                <tr>\n");
      out.write("\t                    <td>sanjigi</td>\n");
      out.write("\t                    <td>산지기</td>\n");
      out.write("\t                    <td>sanjigi@slipp.net</td>\n");
      out.write("\t                    <td><a href=\"\">수정</a></td>\n");
      out.write("\t                </tr>\t                \n");
      out.write("\t\t        </table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}