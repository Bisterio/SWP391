/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentInCourses;

import java.sql.SQLException;
import java.text.DecimalFormat;
import studentInTopics.StudentInTopicDAO;
import topics.TopicDAO;

/**
 *
 * @author Luan Tuong Vy
 */
public class StudentInCourseBUS {
    public double getCourseProgress(int studentId, int courseId) throws SQLException {
        double progress = 0;
        DecimalFormat df = new DecimalFormat("0.0");
        StudentInTopicDAO studentInTopicDAO = new StudentInTopicDAO();
        TopicDAO topicDAO = new TopicDAO();
        int completedCourse = studentInTopicDAO.countCompletedTopicsByCourse(studentId, courseId);
        int totalTopics = topicDAO.countTopicsByCourse(courseId);
        if (totalTopics != 0) {
            progress = completedCourse * 100 / totalTopics;
        }
        return Double.parseDouble(df.format(progress));
    }
}
