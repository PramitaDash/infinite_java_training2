/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-10-02 19:43:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.java.Complaint.ComplainDAOImpl;
import com.java.Complaint.ComplaintDAO;
import com.java.Complaint.Complaint;

public final class ShowComplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.java.Complaint.Complaint");
    _jspx_imports_classes.add("com.java.Complaint.ComplaintDAO");
    _jspx_imports_classes.add("com.java.Complaint.ComplainDAOImpl");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("  <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f0f0f0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("            box-shadow: 1px 1px 10px blue;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table {\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            background-color: burlywood;\r\n");
      out.write("            box-shadow: 1px 1px 10px blue;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even) {\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function changeSpanColor() {\r\n");
      out.write("    var currentDate = new DateTime();\r\n");
      out.write("    var rows = document.getElementById(\"tables\").rows;\r\n");
      out.write("\r\n");
      out.write("    for (var i = 1; i < rows.length; i++) {\r\n");
      out.write("        var complaintDateStr = rows[i].cells[3].textContent;\r\n");
      out.write("        var complaintDate = new Date(complaintDateStr);\r\n");
      out.write("\r\n");
      out.write("        var daysDifference = Math.ceil((complaintDate - currentDate) / (1000 * 60 * 60 * 24));\r\n");
      out.write("        var compColorSpan = rows[i].querySelector('.compColor');\r\n");
      out.write("\r\n");
      out.write("        if (daysDifference > 7) {\r\n");
      out.write("            compColorSpan.style.color = 'red';\r\n");
      out.write("            compColorSpan.textContent = 'Pending';\r\n");
      out.write("        } else {\r\n");
      out.write("            compColorSpan.style.color = 'green';\r\n");
      out.write("            compColorSpan.textContent = 'Pending';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("} \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Complaint</h1>\r\n");

ComplaintDAO dao = new ComplainDAOImpl();
List<Complaint> compList = dao.showAllComplaint();

      out.write("\r\n");
      out.write("<table id=\"tables\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Complaint Id</th>\r\n");
      out.write("        <th>Complaint Type</th>\r\n");
      out.write("        <th>Complaint Description</th>\r\n");
      out.write("        <th>Complaint Date</th>\r\n");
      out.write("        <th>Severity</th>\r\n");
      out.write("        <th>Status</th>\r\n");
      out.write("        <th>Priority</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

    for (Complaint complaint : compList) {
    
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td class=\"a\">");
      out.print( complaint.getComplaintId() );
      out.write("</td>\r\n");
      out.write("        <td class=\"a\">");
      out.print( complaint.getComplaintType() );
      out.write("</td>\r\n");
      out.write("        <td class=\"a\">");
      out.print( complaint.getcDescription() );
      out.write("</td>\r\n");
      out.write("        <td class=\"a\">");
      out.print( complaint.getCompalintDate() );
      out.write("</td>\r\n");
      out.write("        <td class=\"a\">");
      out.print( complaint.getSeverity() );
      out.write("</td>\r\n");
      out.write("        <td class=\"a\">");
      out.print( complaint.getStatus() );
      out.write("</td>\r\n");
      out.write("        <td><span class=\"compColor\"></span></td>\r\n");
      out.write("        <td><th><a href=\"AddResolve.jsp?complaintId=");
      out.print(complaint.getComplaintId());
      out.write(" & complaintDate=");
      out.print( complaint.getCompalintDate());
      out.write(" \">Resolve This<a/></th></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr/><hr/>\r\n");
      out.write("<table  align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th><a href=\"AddComplaint.jsp\"/>Add Complaint</th>\r\n");
      out.write("        <th><a href=\"SearchComplaint.jsp\"/>Search Complaint</th>\r\n");
      out.write("        <th><a href=\"ResolveData.jsp\">Data Resolve</a></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.onload = function() {\r\n");
      out.write("    changeSpanColor();\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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