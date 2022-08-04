package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentFilter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("        <title>Admin</title>\r\n");
      out.write("        <!-- Favicon icon -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\r\n");
      out.write("        <!-- Pignose Calender -->\r\n");
      out.write("        <link href=\"./plugins/pg-calendar/css/pignose.calendar.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Chartist -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./plugins/chartist/css/chartist.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css\">\r\n");
      out.write("        <!-- Custom Stylesheet -->\r\n");
      out.write("        <link href=\"css/style_admin.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/77d5a89f77.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!--*******************\r\n");
      out.write("            Preloader start\r\n");
      out.write("        ********************-->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <div class=\"loader\">\r\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\r\n");
      out.write("                </svg>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--*******************\r\n");
      out.write("            Preloader end\r\n");
      out.write("        ********************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Main wrapper start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <div id=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Nav header start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"nav-header\">\r\n");
      out.write("                <div class=\"brand-logo\">\r\n");
      out.write("                    <a href=\"admin.jsp\">\r\n");
      out.write("\r\n");
      out.write("                        <span class=\"logo-compact\"><img src=\"./images/logowhite-removebg-preview.png\" alt=\"\"></span>\r\n");
      out.write("                        <span class=\"brand-title\">\r\n");
      out.write("                            <img\r\n");
      out.write("                                src=\"images/logowhite-removebg-preview.png\"\r\n");
      out.write("                                alt=\"\"\r\n");
      out.write("                                class=\"img-fluid\"\r\n");
      out.write("                                height=\"10rem\"\r\n");
      out.write("                                />\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Nav header end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Header start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"header\">    \r\n");
      out.write("                <div class=\"header-content clearfix\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"nav-control\">\r\n");
      out.write("                        <div class=\"hamburger\">\r\n");
      out.write("                            <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"header-left\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"header-right\">\r\n");
      out.write("                        <ul class=\"clearfix\">\r\n");
      out.write("                            <li class=\"icons dropdown\"><a href=\"javascript:void(0)\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    <i class=\"mdi mdi-email-outline\"></i>\r\n");
      out.write("                                    <span class=\"badge badge-pill gradient-1\">3</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"drop-down animated fadeIn dropdown-menu\">\r\n");
      out.write("                                    <div class=\"dropdown-content-heading d-flex justify-content-between\">\r\n");
      out.write("                                        <span class=\"\">3 New Messages</span>  \r\n");
      out.write("                                        <a href=\"javascript:void()\" class=\"d-inline-block\">\r\n");
      out.write("                                            <span class=\"badge badge-pill gradient-1\">3</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li class=\"notification-unread\">\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <img class=\"float-left mr-3 avatar-img\" src=\"images/avatar/1.jpg\" alt=\"\">\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <div class=\"notification-heading\">Saiful Islam</div>\r\n");
      out.write("                                                        <div class=\"notification-timestamp\">08 Hours ago</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hi Teddy, Just wanted to let you ...</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"notification-unread\">\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <img class=\"float-left mr-3 avatar-img\" src=\"images/avatar/2.jpg\" alt=\"\">\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <div class=\"notification-heading\">Adam Smith</div>\r\n");
      out.write("                                                        <div class=\"notification-timestamp\">08 Hours ago</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Can you do me a favour?</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <img class=\"float-left mr-3 avatar-img\" src=\"images/avatar/3.jpg\" alt=\"\">\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <div class=\"notification-heading\">Barak Obama</div>\r\n");
      out.write("                                                        <div class=\"notification-timestamp\">08 Hours ago</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hi Teddy, Just wanted to let you ...</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <img class=\"float-left mr-3 avatar-img\" src=\"images/avatar/4.jpg\" alt=\"\">\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <div class=\"notification-heading\">Hilari Clinton</div>\r\n");
      out.write("                                                        <div class=\"notification-timestamp\">08 Hours ago</div>\r\n");
      out.write("                                                        <div class=\"notification-text\">Hello</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"icons dropdown\"><a href=\"javascript:void(0)\" data-toggle=\"dropdown\">\r\n");
      out.write("                                    <i class=\"mdi mdi-bell-outline\"></i>\r\n");
      out.write("                                    <span class=\"badge badge-pill gradient-2\">3</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"drop-down animated fadeIn dropdown-menu dropdown-notfication\">\r\n");
      out.write("                                    <div class=\"dropdown-content-heading d-flex justify-content-between\">\r\n");
      out.write("                                        <span class=\"\">2 New Notifications</span>  \r\n");
      out.write("                                        <a href=\"javascript:void()\" class=\"d-inline-block\">\r\n");
      out.write("                                            <span class=\"badge badge-pill gradient-2\">5</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <span class=\"mr-3 avatar-icon bg-success-lighten-2\"><i class=\"icon-present\"></i></span>\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <h6 class=\"notification-heading\">Events near you</h6>\r\n");
      out.write("                                                        <span class=\"notification-text\">Within next 5 days</span> \r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <span class=\"mr-3 avatar-icon bg-danger-lighten-2\"><i class=\"icon-present\"></i></span>\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <h6 class=\"notification-heading\">Event Started</h6>\r\n");
      out.write("                                                        <span class=\"notification-text\">One hour ago</span> \r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <span class=\"mr-3 avatar-icon bg-success-lighten-2\"><i class=\"icon-present\"></i></span>\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <h6 class=\"notification-heading\">Event Ended Successfully</h6>\r\n");
      out.write("                                                        <span class=\"notification-text\">One hour ago</span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <span class=\"mr-3 avatar-icon bg-danger-lighten-2\"><i class=\"icon-present\"></i></span>\r\n");
      out.write("                                                    <div class=\"notification-content\">\r\n");
      out.write("                                                        <h6 class=\"notification-heading\">Events to Join</h6>\r\n");
      out.write("                                                        <span class=\"notification-text\">After two days</span> \r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"icons dropdown d-none d-md-flex\">\r\n");
      out.write("                                <a href=\"javascript:void(0)\" class=\"log-user\"  data-toggle=\"dropdown\">\r\n");
      out.write("                                    <span>English</span>  <i class=\"fa fa-angle-down f-s-14\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"drop-down dropdown-language animated fadeIn  dropdown-menu\">\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li><a href=\"javascript:void()\">English</a></li>\r\n");
      out.write("                                            <li><a href=\"javascript:void()\">Dutch</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"icons dropdown\">\r\n");
      out.write("                                <div class=\"user-img c-pointer position-relative\"   data-toggle=\"dropdown\">\r\n");
      out.write("                                    <span class=\"activity active\"></span>\r\n");
      out.write("                                    <img src=\"images/hehe.png\" height=\"40\" width=\"40\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"drop-down dropdown-profile animated fadeIn dropdown-menu\">\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"app-profile.html\"><i class=\"icon-user\"></i> <span>Profile</span></a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void()\">\r\n");
      out.write("                                                    <i class=\"icon-envelope-open\"></i> <span>Inbox</span> <div class=\"badge gradient-3 badge-pill gradient-1\">3</div>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("\r\n");
      out.write("                                            <hr class=\"my-2\">\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"page-lock.html\"><i class=\"icon-lock\"></i> <span>Lock Screen</span></a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li><a href=\"AdminController?action=LogOut\"><i class=\"icon-key\"></i> <span>Logout</span></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Header end ti-comment-alt\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"nk-sidebar\">           \r\n");
      out.write("                <div class=\"nk-nav-scroll\">\r\n");
      out.write("                    <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                        <li class=\"nav-label\">Dashboard</li>\r\n");
      out.write("\r\n");
      out.write("                        <li >\r\n");
      out.write("                            <form  name=\"ViewStudent\"  action=\"MainControllerAdmin\" method=\"POST\" id=\"duong\" aria-expanded=\"false\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"ViewStudent\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"controller\" value=\"Student\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"pageNumber\" value=\"1\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"rowsOfPage\" value=\"200\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <a onClick=\"submit_form('duong')\"  aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user menu-icon\"></i><span class=\"nav-text\">Student</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <form  name=\"ViewAuthor\"  action=\"MainControllerAdmin\" method=\"POST\" id=\"author\" aria-expanded=\"false\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"ViewAuthor\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"controller\" value=\"Author\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"pageNumber\" value=\"1\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"rowsOfPage\" value=\"200\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <a onClick=\"submit_form('author')\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user menu-icon\"></i><span class=\"nav-text\">Author</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <form  name=\"ViewCourse\"  action=\"MainControllerAdmin\" method=\"POST\" id=\"course\" aria-expanded=\"false\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"ViewCourse\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"controller\" value=\"Course\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"pageNumber\" value=\"1\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"rowsOfPage\" value=\"200\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <a onClick=\"submit_form('course')\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user menu-icon\"></i><span class=\"nav-text\">Course</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <form  name=\"ViewCategory\"  action=\"MainControllerAdmin\" method=\"POST\" id=\"category\" aria-expanded=\"false\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"ViewCategory\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"controller\" value=\"Category\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"pageNumber\" value=\"1\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"rowsOfPage\" value=\"200\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <a onClick=\"submit_form('category')\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user menu-icon\"></i><span class=\"nav-text\">Category</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                         <li>\r\n");
      out.write("                            <form  name=\"ViewCourse\"  action=\"MainControllerAdmin\" method=\"POST\" id=\"studentcourse\" aria-expanded=\"false\" >\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"StudentCourse\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"controller\" value=\"Course\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"pageNumber\" value=\"1\"/>\r\n");
      out.write("                                <input type=\"hidden\" name=\"rowsOfPage\" value=\"200\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <a onClick=\"submit_form('studentcourse')\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user menu-icon\"></i><span class=\"nav-text\">Student in Course</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"content-body\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container-fluid mt-3\">\r\n");
      out.write("\r\n");
      out.write("                    <h1>Select Course</h1> \r\n");
      out.write("\r\n");
      out.write("                    <form action=\"CourseController\" method=\"post\">\r\n");
      out.write("                        <div class=\"input-group icons\">\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"search\" class=\"form-control\" placeholder=\"Search course\" aria-label=\"Search Dashboard\" name=\"txtSearch\">\r\n");
      out.write("                            <div class=\"drop-down animated flipInX d-md-none\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input class=\"btn btn-primary m-1\" type=\"submit\" name=\"action\" value=\"Search\"><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                            String login_msg = (String) request.getAttribute("errorNotFound");
                            if (login_msg != null) {
                                out.println("<font color=red size=4px>" + login_msg + "</font>");
                            }
                        
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <h1></h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-12\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <div class=\"active-member\">\r\n");
      out.write("                                        <div class=\"table-responsive\">\r\n");
      out.write("                                            <table class=\"table table-xs mb-0\">\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>Id</th>\r\n");
      out.write("                                                        <th>Name</th>\r\n");
      out.write("                                                        <th>Status</th>\r\n");
      out.write("                                                        <th>View Student</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- #/ container -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Footer start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <p>Copyright &copy; Designed & Developed by <a href=\"https://themeforest.net/user/quixlab\">Quixlab</a> 2018</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Footer end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Main wrapper end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Scripts\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <script src=\"plugins/common/common.min.js\"></script>\r\n");
      out.write("        <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/settings.js\"></script>\r\n");
      out.write("        <script src=\"js/gleek.js\"></script>\r\n");
      out.write("        <script src=\"js/styleSwitcher.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Chartjs -->\r\n");
      out.write("        <script src=\"./plugins/chart.js/Chart.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Circle progress -->\r\n");
      out.write("        <script src=\"./plugins/circle-progress/circle-progress.min.js\"></script>\r\n");
      out.write("        <!-- Datamap -->\r\n");
      out.write("        <script src=\"./plugins/d3v3/index.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/topojson/topojson.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/datamaps/datamaps.world.min.js\"></script>\r\n");
      out.write("        <!-- Morrisjs -->\r\n");
      out.write("        <script src=\"./plugins/raphael/raphael.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/morris/morris.min.js\"></script>\r\n");
      out.write("        <!-- Pignose Calender -->\r\n");
      out.write("        <script src=\"./plugins/moment/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/pg-calendar/js/pignose.calendar.min.js\"></script>\r\n");
      out.write("        <!-- ChartistJS -->\r\n");
      out.write("        <script src=\"./plugins/chartist/js/chartist.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./js/dashboard/dashboard-1.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                function submit_form(form_id) {\r\n");
      out.write("                                    var form = document.getElementById(form_id);\r\n");
      out.write("                                    form.submit();\r\n");
      out.write("                                }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("course");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.COURSE_LIST}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <form target=\"_blank\" action=\"StudentInCourseController\" method=\"POST\">\r\n");
          out.write("                                                        <input type=\"hidden\" name=\"action\" value=\"ViewStudentInCourse\">\r\n");
          out.write("                                                        <tr>\r\n");
          out.write("\r\n");
          out.write("                                                            <td><input style=\"width:50%;border: none;\" type=\"text\" name=\"courseId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.getCourseId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly></td>\r\n");
          out.write("                                                            <td><input style=\"width:50%;border: none;\" type=\"text\" name=\"courseName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.getCourseName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly></td>\r\n");
          out.write("                                                            \r\n");
          out.write("                                                            <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                                \r\n");
          out.write("                                                            <td>\r\n");
          out.write("                                                                <input class=\"btn btn-primary\" type=\"submit\" value=\"View\">                                                                \r\n");
          out.write("                                                            </td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                        </tr>\r\n");
          out.write("                                                    </form>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${course.getStatus()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
