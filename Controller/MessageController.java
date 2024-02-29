package Controller;

import Model.Message;
import Model.Student;
import Model.Teacher;

import java.util.List;

/**
 * The MessageController class manages messages in the system.
 */
public class MessageController {

    /**
     * Sends a message.
     */
    public void sendMessage(Message message) {
    }

    /**
     * Views a message.
     */
    public String viewMessage(Message message) {
        // demo
        String theMessage = message.getMessage();
        return theMessage;
    }

    /**
     * Deletes a message.
     */
    public void deleteMessage(Message message) {
    }

    /**
     * Gets all of a student's messages
     * @param student
     * @return
     */
    public List<String> getStudentMessages(Student student)
    {
        return List.of();
    }

    /**
     * gets all of a teacher's messages
     * @param teacher
     * @return
     */
    public List<String> getTeacherMessages (Teacher teacher)
    {
        return List.of();
    }
}
