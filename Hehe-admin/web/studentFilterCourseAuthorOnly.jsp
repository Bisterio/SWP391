<%-- 
    Document   : landing
    Created on : Jul 19, 2022, 5:20:36 PM
    Author     : Harry
--%>

<%@page import="students.StudentModel"%>
<%@page import="categories.CategoryModel"%>
<%@page import="categories.CategoryDTO"%>
<%@page import="categories.CategoryBUS"%>
<%@page import="authors.AuthorDTO"%>
<%@page import="sections.SectionDTO"%>
<%@page import="sections.SectionBUS"%>
<%@page import="courses.CourseDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="courses.CourseBUS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com -->
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <!----======== CSS ======== -->
        <link
            rel="stylesheet"
            href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
            />
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <link rel="stylesheet" href="css/navbar.css" />
        <!--<link rel="stylesheet" href="css/addCourse.css">--> 
        <link rel="stylesheet" href="css/card.css" />

        <!----===== Boxicons CSS ===== -->
        <link
            href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
            rel="stylesheet"
            />

        <title>Author Home Page</title>
    </head>
    <body onload="addColor()">
        <nav class="sidebar">
            <header>
                <div class="image-text">
                    <span class="image">
                        <img src="images/logo-removebg-preview.png" alt="" />
                    </span>

                    <div class="text logo-text">
                        <span class="name">HEHE CODE</span>
                    </div>
                </div>
            </header>

            <div class="menu-bar">
                <div class="menu">


                    <ul class="menu-links">
                        <li class="nav-link">
                            <a href="./landing.jsp">
                                <i class="bx bx-home-alt icon"></i>
                                <span class="text nav-text">View all courses</span>
                            </a>
                        </li>

                        <li class="nav-link">
                            <a href="./createNewCourse.jsp">
                                <i class="bx bx-bar-chart-alt-2 icon"></i>
                                <span class="text nav-text">Create course</span>
                            </a>
                        </li>
                    </ul>
                </div>

                <div class="bottom-content">
                    <li class="">
                        <a href="changePassword.jsp">
                            <i class="bx bx-lock icon"></i>
                            <span class="text nav-text">Change password</span>
                        </a>
                    </li>
                    <li class="">
                        <a href="MainController?action=Logout">
                            <i class="bx bx-log-out icon"></i>
                            <span class="text nav-text">Logout</span>
                        </a>
                    </li>
                </div>
            </div>
        </nav>

        <section class="home">
            <div class="row" style="width: 90%; margin: 10px auto; font-size: 20px;">
                <div class="col-lg-12">
                    <div >
                        <div >
                            <div class="active-member">
                                <div class="table-responsive">
                                    <table style="background-color: white;" class="table table-lg mb-0">
                                        <thead>
                                            <tr style="border-bottom: none;">
                                                <th>User</th>
                                                <th>First name</th>
                                                <th>Last name</th>
                                                <th>Status</th>
                                                <th>Progress (%)</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                ArrayList<StudentModel> list = (ArrayList<StudentModel>) request.getAttribute("STUDENT_LIST");
                                                int size = list.size();
                                                ArrayList<Double> prgList = (ArrayList<Double>) request.getAttribute("PROGRESS_LIST");
                                                for (int i = 0; i < size; i++) {
                                            %>
                                            <tr>
                                                <td><%= list.get(i).getId()%></td>
                                                <td><%= list.get(i).getFirstName()%></td>
                                                <td><%= list.get(i).getLastName()%></td>
                                                <td><%= list.get(i).getStatus()%></td>
                                                <td><%= prgList.get(i)%></td>
                                            </tr>
                                            <%
                                                }

                                            %>


                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>                        
                </div>
            </div>
        </section>
        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"
        ></script>
        <script>
        const colorRandom = document.querySelectorAll(".overlay");
        const backgroundPink =
                "linear-gradient(to top left, #1877f2 0%, #FF6CB0 80%)";
        const backgroundBlue =
                "linear-gradient(to top left, #1877f2 0%, #66ffff  80%)";
        const backgroundYellow =
                "linear-gradient(to top left, #1877f2 0%, #F9F871  80%)";
        const backgroundGreen =
                "linear-gradient(to top left, #1877f2 0%, #6EFACC 80%)";
        const backgroundViolet =
                "linear-gradient(to top left, #1877f2 0%, #CB6BDF 80%)";
        const backgroundRed =
                "linear-gradient(to top left, #1877f2 0%, #FF907E 80%)";
        const backColor = [
            backgroundPink,
            backgroundBlue,
            backgroundRed,
            backgroundYellow,
            backgroundGreen,
            backgroundViolet,
        ];

        function addColor() {
            let x = 0;
            colorRandom.forEach((e) => {
                e.style.background = backColor[x % 6];
                x = x + 1;
            });
        }
        </script>
    </body>
</html>

