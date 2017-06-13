package learn.java.Patterns.Behavioral.mediator;

import java.util.Date;

/**
 * Created by dvorop on 13.06.2017.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
