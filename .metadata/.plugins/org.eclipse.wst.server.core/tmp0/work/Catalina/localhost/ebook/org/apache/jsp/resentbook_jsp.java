/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2024-05-06 16:34:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Cart;
import com.entity.Book;
import java.util.List;
import com.DAO.DBconn;
import java.sql.Connection;
import com.db.Database;
import com.entity.user;
import com.DAO.DAOImpl;
import com.DAO.DBconn;

public final class resentbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/components/navbar.jsp", Long.valueOf(1714986933530L));
    _jspx_dependants.put("jar:file:/D:/All%20projects/java%20web%20-%20all%20backup/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ebook/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153363482000L));
    _jspx_dependants.put("/components/allcss.jsp", Long.valueOf(1695622255442L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1714343190547L));
    _jspx_dependants.put("/components/footer.jsp", Long.valueOf(1714980128785L));
    _jspx_dependants.put("/components/jstl.jsp", Long.valueOf(1697117304336L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.entity.Book");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.db.Database");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("com.entity.user");
    _jspx_imports_classes.add("com.entity.Cart");
    _jspx_imports_classes.add("com.DAO.DBconn");
    _jspx_imports_classes.add("com.DAO.DAOImpl");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Resent book</title>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"D:/All projects/java web/EbookApp/src/main/webapp/components/bootstrap-4.6.2-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"components/style.css\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 Connection conn =new Database().Dbconn(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-white  \" style=\"min-height: 60px\">\r\n");
      out.write("	<div class=\"row p-2\">\r\n");
      out.write("		<div class=\"col-md-3\">\r\n");
      out.write("			<h3 class=\"text-success float-left\">E-Book Store</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\" col-md-5\">\r\n");
      out.write("			<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark  sticky-top\"\r\n");
      out.write("	style=\"background: #004275\">\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("	<div class=\"row collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<div class=\" col-md-7 float-left \">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"index.jsp\"> <i class=\"fa-solid fa-house fa-2x\"></i> Home\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"resentbook.jsp\"> <i class=\"fa-solid fa-book\"></i>Resent\r\n");
      out.write("						book\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li class=\"nav-item  active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"newbook.jsp\"> <i class=\"fa-solid fa-book\"></i>New book\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link \"\r\n");
      out.write("					href=\"oldbook.jsp\"> <i class=\"fa-solid fa-book\"></i> Old Book\r\n");
      out.write("				</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-md-5 \">\r\n");
      out.write("			<a class=\" float-right btn bg-white mx-1\" href=\"#\">Profile <i\r\n");
      out.write("				class=\"fa-regular fa-user\"></i>\r\n");
      out.write("			</a> <a href=\"setting.jsp\" class=\" float-right btn bg-white mx-1\"\r\n");
      out.write("				href=\"#\"><i class=\"fa-solid fa-gear\"></i>Setting </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f2_reused = false;
      try {
        _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f2.setParent(null);
        // /components/navbar.jsp(87,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty logedin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
        if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("				");

				DAOImpl daoNav = new DAOImpl(conn);
				user uNav = (user) session.getAttribute("logedin");
				int uidNav = uNav.getUid();
				int totalCarts = daoNav.getCartsCountByUid(uidNav);
				System.out.println("total Carts is: " + totalCarts);
				
            out.write("\r\n");
            out.write("\r\n");
            out.write("				<a href=\"cart.jsp\" class=\"float-right  btn bg-white mx-1\"\r\n");
            out.write("					href=\"#\"> <i class=\"fa-solid fa-cart-arrow-down\"></i> <sup\r\n");
            out.write("					style=\"font-size: 15px; width: 250px\"\r\n");
            out.write("					class=\"bg-danger rounded text-white\"> ");
            out.print(totalCarts);
            out.write("\r\n");
            out.write("				</sup>\r\n");
            out.write("				</a>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
        _jspx_th_c_005fif_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\r\n");
      out.write("	aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\">\r\n");
      out.write("		<div class=\"modal-content\">\r\n");
      out.write("			<div class=\"modal-header\">\r\n");
      out.write("				<h5 class=\"modal-title\" id=\"exampleModalLabel\">warning !</h5>\r\n");
      out.write("				<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\">\r\n");
      out.write("					<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-body\">Are you sure you want to logout?</div>\r\n");
      out.write("			<div class=\"modal-footer\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">No</button>\r\n");
      out.write("				<a href=\"Logout\" type=\"button\" class=\"btn btn-primary\">Yes</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("	<img style=\"height: 250px; width: 100%\" alt=\"benner\"\r\n");
      out.write("		src=\"components/img/ben.png\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Resent Book -->\r\n");
      out.write("	<div class=\"container my-2 p-3 resentbook\">\r\n");
      out.write("		<h2 class=\"text-white text-center\">Resent Book</h2>\r\n");
      out.write("		<div class=\"row justify-content-center text-center\">\r\n");
      out.write("\r\n");
      out.write("			");

			HttpSession se = request.getSession();
			user u = (user) se.getAttribute("logedin");
			DAOImpl dao = new DAOImpl(conn);
			List<Book> res = dao.getRsentBook();
		
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");

			for (Book b : res) {
			
      out.write("\r\n");
      out.write("			<div class=\"col-lg-3 col-md-4 col-sm-6 my-2\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<img class=\"gcardbook\" alt=\"book\" src=\"books/");
      out.print(b.getFile());
      out.write("\">\r\n");
      out.write("						<p>\r\n");
      out.write("							Book Name:\r\n");
      out.write("							");
      out.print(b.getName());
      out.write("\r\n");
      out.write("							<br> Author Name:");
      out.print(b.getAuthor());
      out.write("\r\n");
      out.write("							<br> Categories:\r\n");
      out.write("							");
      out.print(b.getCat());
      out.write("\r\n");
      out.write("						</p>\r\n");
      out.write("						<div class=\"row text-center justify-content-center\">\r\n");
      out.write("							");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f3_reused = false;
      try {
        _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f3.setParent(null);
        // /resentbook.jsp(71,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty logedin  }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
        if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("								");

								Cart c = dao.chackCartByUB(b.getBid(), u.getUid());
								if (c != null) {
								
            out.write("\r\n");
            out.write("								<a class=\"disabled btn btn-danger btn-sm m-1\">Add Card</a>\r\n");
            out.write("\r\n");
            out.write("								");

								} else if (c == null) {
								
            out.write("\r\n");
            out.write("\r\n");
            out.write("								<a\r\n");
            out.write("									href=\"addcartservlet?bid=");
            out.print(b.getBid());
            out.write("&uid=");
            out.print(u.getUid());
            out.write("&bname=");
            out.print(b.getName());
            out.write("&author=");
            out.print(b.getAuthor());
            out.write("&price=");
            out.print(b.getPrice());
            out.write("&address=");
            out.print(u.getAddress());
            out.write("&phone=");
            out.print(u.getPhone());
            out.write("&email=");
            out.print(b.getEmail());
            out.write("\"\r\n");
            out.write("									class=\"btn btn-danger btn-sm m-1\">Add Card</a>\r\n");
            out.write("								");

								}
								
            out.write("\r\n");
            out.write("							");
            int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
        _jspx_th_c_005fif_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("							<a href=\"viewdetails.jsp?bid=");
      out.print(b.getBid());
      out.write("\"\r\n");
      out.write("								class=\"btn btn-primary btn-sm m-1\">View Details</a> <a\r\n");
      out.write("								class=\"btn btn-success btn-sm m-1\">");
      out.print(b.getPrice());
      out.write("</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<a class=\"self-align-center  y-2 btn btn-danger\">View All</a>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<div class=\"container-fluid  text-center \" style=\"height:150px; background:#004275\">\r\n");
      out.write("	<div class=\"row text-center text-white pt-5 justify-content-center\">\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<table>\r\n");
      out.write("		<caption>&copy All rights reserved by Md Askan Ali (Sultan)</caption>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td>Contract : </td>\r\n");
      out.write("		<td>01746144644</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td>Mail     : </td>\r\n");
      out.write("		<td>sultanahmedaskan@gmail.com</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /components/navbar.jsp(25,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty  logedin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<div class=\"col-md-4  text-right\">\r\n");
          out.write("				<a href=\"profile.jsp\" class=\"btn btn-primary \"><i\r\n");
          out.write("					class=\"fa-regular fa-user\"></i> Profile</a>\r\n");
          out.write("				<button data-toggle=\"modal\" data-target=\"#exampleModal\"\r\n");
          out.write("					class=\"btn btn-danger \">\r\n");
          out.write("					<i class=\"fa-solid fa-right-from-bracket\"></i> Logout\r\n");
          out.write("				</button>\r\n");
          out.write("			</div>\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /components/navbar.jsp(36,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty logedin}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<div class=\"col-md-4  text-right\">\r\n");
          out.write("				<a href=\"login.jsp\" class=\"btn btn-success \"><i\r\n");
          out.write("					class=\"fa-solid fa-right-to-bracket \"></i> Login</a> <a\r\n");
          out.write("					href=\"register.jsp\" class=\"btn btn-primary \"><i\r\n");
          out.write("					class=\"fa-solid fa-id-card\"></i> Register</a>\r\n");
          out.write("			</div>\r\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /resentbook.jsp(93,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty logedin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("								<a href=\"login.jsp\" class=\" btn btn-danger btn-sm m-1\">Add\r\n");
          out.write("									Card</a>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }
}