package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import students.StudentModel;
import categories.CategoryModel;
import categories.CategoryDTO;
import categories.CategoryBUS;
import authors.AuthorDTO;
import sections.SectionDTO;
import sections.SectionBUS;
import courses.CourseDTO;
import java.util.ArrayList;
import courses.CourseBUS;

public final class studentFilterCourseAuthorOnly_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Coding by CodingLab | www.codinglabweb.com -->\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("        <!----======== CSS ======== -->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.css\" />\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"css/addCourse.css\">--> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/card.css\" />\n");
      out.write("\n");
      out.write("        <!----===== Boxicons CSS ===== -->\n");
      out.write("        <link\n");
      out.write("            href=\"https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <title>Author Home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"addColor()\">\n");
      out.write("        <nav class=\"sidebar\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"image-text\">\n");
      out.write("                    <span class=\"image\">\n");
      out.write("                        <img src=\"images/logo-removebg-preview.png\" alt=\"\" />\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                    <div class=\"text logo-text\">\n");
      out.write("                        <span class=\"name\">HEHE CODE</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"menu-bar\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <ul class=\"menu-links\">\n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"./landing.jsp\">\n");
      out.write("                                <i class=\"bx bx-home-alt icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">View all courses</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"./createNewCourse.jsp\">\n");
      out.write("                                <i class=\"bx bx-bar-chart-alt-2 icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">Create course</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"bottom-content\">\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a href=\"changePassword.jsp\">\n");
      out.write("                            <i class=\"bx bx-lock icon\"></i>\n");
      out.write("                            <span class=\"text nav-text\">Change password</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a href=\"MainController?action=Logout\">\n");
      out.write("                            <i class=\"bx bx-log-out icon\"></i>\n");
      out.write("                            <span class=\"text nav-text\">Logout</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section class=\"home\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"active-member\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-xs mb-0\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>User</th>\n");
      out.write("                                                <th>First name</th>\n");
      out.write("                                                <th>Last name</th>\n");
      out.write("                                                <th>Status</th>\n");
      out.write("                                                <th>Progress (%)</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");

                                                ArrayList<StudentModel> list = (ArrayList<StudentModel>) request.getAttribute("STUDENT_LIST");
                                                int size = list.size();
                                                ArrayList<Double> prgList = (ArrayList<Double>) request.getAttribute("PROGRESS_LIST");
                                                for (int i = 0; i < size; i++) {
                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.print( list.get(i).getId());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( list.get(i).getFirstName());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( list.get(i).getLastName());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( list.get(i).getStatus());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( prgList.get(i));
      out.write("</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                }

                                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"\n");
      out.write("            integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"\n");
      out.write("            integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("        <script>\n");
      out.write("        const colorRandom = document.querySelectorAll(\".overlay\");\n");
      out.write("        const backgroundPink =\n");
      out.write("                \"linear-gradient(to top left, #1877f2 0%, #FF6CB0 80%)\";\n");
      out.write("        const backgroundBlue =\n");
      out.write("                \"linear-gradient(to top left, #1877f2 0%, #66ffff  80%)\";\n");
      out.write("        const backgroundYellow =\n");
      out.write("                \"linear-gradient(to top left, #1877f2 0%, #F9F871  80%)\";\n");
      out.write("        const backgroundGreen =\n");
      out.write("                \"linear-gradient(to top left, #1877f2 0%, #6EFACC 80%)\";\n");
      out.write("        const backgroundViolet =\n");
      out.write("                \"linear-gradient(to top left, #1877f2 0%, #CB6BDF 80%)\";\n");
      out.write("        const backgroundRed =\n");
      out.write("                \"linear-gradient(to top left, #1877f2 0%, #FF907E 80%)\";\n");
      out.write("        const backColor = [\n");
      out.write("            backgroundPink,\n");
      out.write("            backgroundBlue,\n");
      out.write("            backgroundRed,\n");
      out.write("            backgroundYellow,\n");
      out.write("            backgroundGreen,\n");
      out.write("            backgroundViolet,\n");
      out.write("        ];\n");
      out.write("\n");
      out.write("        function addColor() {\n");
      out.write("            let x = 0;\n");
      out.write("            colorRandom.forEach((e) => {\n");
      out.write("                e.style.background = backColor[x % 6];\n");
      out.write("                x = x + 1;\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
