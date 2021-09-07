/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messageList;

    public MessagingService() {
        this.messageList = new ArrayList<>();
    }

    public void add(Message m) {
        if (m.getContent().length() <= 280) {
            this.messageList.add(m);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messageList;
    }
}
