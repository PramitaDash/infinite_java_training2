/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-10-12 10:19:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/CSMProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ResturantManagement/WEB-INF/lib/jsf-impl-2.2.14.jar!/META-INF/jsf_core.tld", Long.valueOf(1479140578000L));
    _jspx_dependants.put("jar:file:/D:/CSMProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ResturantManagement/WEB-INF/lib/jsf-impl-2.2.14.jar!/META-INF/html_basic.tld", Long.valueOf(1479140598000L));
    _jspx_dependants.put("/WEB-INF/lib/jsf-impl-2.2.14.jar", Long.valueOf(1696481167377L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fcommandLink_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fcommandLink_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fcommandLink_0026_005faction.release();
    _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      if (_jspx_meth_f_005fview_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_f_005fview_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = new com.sun.faces.taglib.jsf_core.ViewTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_f_005fview_005f0);
    try {
      _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
      _jspx_th_f_005fview_005f0.setParent(null);
      _jspx_th_f_005fview_005f0.setJspId("jsp_1385953380_0");
      int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_f_005fview_005f0);
        }
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("</html>\r\n");
          int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_f_005fview_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = new com.sun.faces.taglib.html_basic.FormTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fform_005f0);
    try {
      _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
      _jspx_th_h_005fform_005f0.setJspId("jsp_1385953380_1");
      int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_h_005fform_005f0);
        }
        do {
          out.write("\r\n");
          out.write("       <h2> Welcome to :</h2> <b>\r\n");
          out.write("        \t");
          if (_jspx_meth_h_005foutputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write(" <br/><br/>\r\n");
          out.write("        </b>\r\n");
          out.write("        ");
          if (_jspx_meth_h_005fcommandLink_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_h_005fcommandLink_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_h_005fcommandLink_005f2(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("        ");
          if (_jspx_meth_h_005fcommandLink_005f3(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fform_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005foutputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_005foutputText_005f0 = new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005foutputText_005f0);
    try {
      _jspx_th_h_005foutputText_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005foutputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /Dashboard.jsp(10,9) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005foutputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Dashboard.jsp(10,9) '#{loggedCustomer}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"#{loggedCustomer}",java.lang.Object.class)));
      _jspx_th_h_005foutputText_005f0.setJspId("jsp_1385953380_2");
      int _jspx_eval_h_005foutputText_005f0 = _jspx_th_h_005foutputText_005f0.doStartTag();
      if (_jspx_th_h_005foutputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005foutputText_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fcommandLink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:commandLink
    com.sun.faces.taglib.html_basic.CommandLinkTag _jspx_th_h_005fcommandLink_005f0 = new com.sun.faces.taglib.html_basic.CommandLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fcommandLink_005f0);
    try {
      _jspx_th_h_005fcommandLink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005fcommandLink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /Dashboard.jsp(12,8) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = true methodSignature = java.lang.Object action()
      _jspx_th_h_005fcommandLink_005f0.setAction(new org.apache.jasper.el.JspMethodExpression("/Dashboard.jsp(12,8) 'CustomerInfo'",_jsp_getExpressionFactory().createMethodExpression(_jspx_page_context.getELContext(),"CustomerInfo",java.lang.Object.class,new java.lang.Class[] {})));
      _jspx_th_h_005fcommandLink_005f0.setJspId("jsp_1385953380_3");
      int _jspx_eval_h_005fcommandLink_005f0 = _jspx_th_h_005fcommandLink_005f0.doStartTag();
      if (_jspx_eval_h_005fcommandLink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_h_005fcommandLink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_h_005fcommandLink_005f0);
        }
        do {
          out.write("\r\n");
          out.write("        \t");
          if (_jspx_meth_h_005foutputLabel_005f0(_jspx_th_h_005fcommandLink_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_h_005fcommandLink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_h_005fcommandLink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_h_005fcommandLink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fcommandLink_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fcommandLink_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f0 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005foutputLabel_005f0);
    try {
      _jspx_th_h_005foutputLabel_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005foutputLabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fcommandLink_005f0);
      // /Dashboard.jsp(13,9) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005foutputLabel_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Dashboard.jsp(13,9) 'Show Customer Info'",_jsp_getExpressionFactory().createValueExpression("Show Customer Info",java.lang.Object.class)));
      _jspx_th_h_005foutputLabel_005f0.setJspId("jsp_1385953380_4");
      int _jspx_eval_h_005foutputLabel_005f0 = _jspx_th_h_005foutputLabel_005f0.doStartTag();
      if (_jspx_th_h_005foutputLabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005foutputLabel_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fcommandLink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:commandLink
    com.sun.faces.taglib.html_basic.CommandLinkTag _jspx_th_h_005fcommandLink_005f1 = new com.sun.faces.taglib.html_basic.CommandLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fcommandLink_005f1);
    try {
      _jspx_th_h_005fcommandLink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_h_005fcommandLink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /Dashboard.jsp(16,8) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = true methodSignature = java.lang.Object action()
      _jspx_th_h_005fcommandLink_005f1.setAction(new org.apache.jasper.el.JspMethodExpression("/Dashboard.jsp(16,8) '#{customerController.showCustomerWallet()}'",_jsp_getExpressionFactory().createMethodExpression(_jspx_page_context.getELContext(),"#{customerController.showCustomerWallet()}",java.lang.Object.class,new java.lang.Class[] {})));
      _jspx_th_h_005fcommandLink_005f1.setJspId("jsp_1385953380_5");
      int _jspx_eval_h_005fcommandLink_005f1 = _jspx_th_h_005fcommandLink_005f1.doStartTag();
      if (_jspx_eval_h_005fcommandLink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_h_005fcommandLink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_h_005fcommandLink_005f1);
        }
        do {
          out.write("\r\n");
          out.write("        \t");
          if (_jspx_meth_h_005foutputLabel_005f1(_jspx_th_h_005fcommandLink_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_h_005fcommandLink_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_h_005fcommandLink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_h_005fcommandLink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fcommandLink_005f1, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fcommandLink_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f1 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005foutputLabel_005f1);
    try {
      _jspx_th_h_005foutputLabel_005f1.setPageContext(_jspx_page_context);
      _jspx_th_h_005foutputLabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fcommandLink_005f1);
      // /Dashboard.jsp(17,9) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005foutputLabel_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/Dashboard.jsp(17,9) 'Show Customer Wallets'",_jsp_getExpressionFactory().createValueExpression("Show Customer Wallets",java.lang.Object.class)));
      _jspx_th_h_005foutputLabel_005f1.setJspId("jsp_1385953380_6");
      int _jspx_eval_h_005foutputLabel_005f1 = _jspx_th_h_005foutputLabel_005f1.doStartTag();
      if (_jspx_th_h_005foutputLabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005foutputLabel_005f1, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fcommandLink_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:commandLink
    com.sun.faces.taglib.html_basic.CommandLinkTag _jspx_th_h_005fcommandLink_005f2 = new com.sun.faces.taglib.html_basic.CommandLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fcommandLink_005f2);
    try {
      _jspx_th_h_005fcommandLink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_h_005fcommandLink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /Dashboard.jsp(20,8) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = true methodSignature = java.lang.Object action()
      _jspx_th_h_005fcommandLink_005f2.setAction(new org.apache.jasper.el.JspMethodExpression("/Dashboard.jsp(20,8) 'ShowRestaurant'",_jsp_getExpressionFactory().createMethodExpression(_jspx_page_context.getELContext(),"ShowRestaurant",java.lang.Object.class,new java.lang.Class[] {})));
      _jspx_th_h_005fcommandLink_005f2.setJspId("jsp_1385953380_7");
      int _jspx_eval_h_005fcommandLink_005f2 = _jspx_th_h_005fcommandLink_005f2.doStartTag();
      if (_jspx_eval_h_005fcommandLink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_h_005fcommandLink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_h_005fcommandLink_005f2);
        }
        do {
          out.write("\r\n");
          out.write("        \t");
          if (_jspx_meth_h_005foutputLabel_005f2(_jspx_th_h_005fcommandLink_005f2, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_h_005fcommandLink_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_h_005fcommandLink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_h_005fcommandLink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fcommandLink_005f2, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fcommandLink_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f2 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005foutputLabel_005f2);
    try {
      _jspx_th_h_005foutputLabel_005f2.setPageContext(_jspx_page_context);
      _jspx_th_h_005foutputLabel_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fcommandLink_005f2);
      // /Dashboard.jsp(21,9) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005foutputLabel_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/Dashboard.jsp(21,9) 'Show Restaurant's'",_jsp_getExpressionFactory().createValueExpression("Show Restaurant's",java.lang.Object.class)));
      _jspx_th_h_005foutputLabel_005f2.setJspId("jsp_1385953380_8");
      int _jspx_eval_h_005foutputLabel_005f2 = _jspx_th_h_005foutputLabel_005f2.doStartTag();
      if (_jspx_th_h_005foutputLabel_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005foutputLabel_005f2, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fcommandLink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:commandLink
    com.sun.faces.taglib.html_basic.CommandLinkTag _jspx_th_h_005fcommandLink_005f3 = new com.sun.faces.taglib.html_basic.CommandLinkTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fcommandLink_005f3);
    try {
      _jspx_th_h_005fcommandLink_005f3.setPageContext(_jspx_page_context);
      _jspx_th_h_005fcommandLink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /Dashboard.jsp(24,8) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = true methodSignature = java.lang.Object action()
      _jspx_th_h_005fcommandLink_005f3.setAction(new org.apache.jasper.el.JspMethodExpression("/Dashboard.jsp(24,8) 'PlaceOrder'",_jsp_getExpressionFactory().createMethodExpression(_jspx_page_context.getELContext(),"PlaceOrder",java.lang.Object.class,new java.lang.Class[] {})));
      _jspx_th_h_005fcommandLink_005f3.setJspId("jsp_1385953380_9");
      int _jspx_eval_h_005fcommandLink_005f3 = _jspx_th_h_005fcommandLink_005f3.doStartTag();
      if (_jspx_eval_h_005fcommandLink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_h_005fcommandLink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_h_005fcommandLink_005f3);
        }
        do {
          out.write("\r\n");
          out.write("        \t");
          if (_jspx_meth_h_005foutputLabel_005f3(_jspx_th_h_005fcommandLink_005f3, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_h_005fcommandLink_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_h_005fcommandLink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_h_005fcommandLink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fcommandLink_005f3, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fcommandLink_005f3, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f3 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005foutputLabel_005f3);
    try {
      _jspx_th_h_005foutputLabel_005f3.setPageContext(_jspx_page_context);
      _jspx_th_h_005foutputLabel_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fcommandLink_005f3);
      // /Dashboard.jsp(25,9) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005foutputLabel_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/Dashboard.jsp(25,9) 'Place Order'",_jsp_getExpressionFactory().createValueExpression("Place Order",java.lang.Object.class)));
      _jspx_th_h_005foutputLabel_005f3.setJspId("jsp_1385953380_10");
      int _jspx_eval_h_005foutputLabel_005f3 = _jspx_th_h_005foutputLabel_005f3.doStartTag();
      if (_jspx_th_h_005foutputLabel_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005foutputLabel_005f3, _jsp_getInstanceManager(), false);
    }
    return false;
  }
}
