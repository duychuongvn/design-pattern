package vn.chuonghd.journaldev.behavioralpattern.observer;

/**
 * Created by huynhduychuong on 3/28/2016.
 */
public class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    public void update() {

        String message = (String) topic.getUpdate(this);
        if (message == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming new message:: " + message);
        }
    }

    public void setSubject(Subject subject) {

        this.topic = subject;
    }
}
