import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class GofudServer implements EventBroker {
  // maps a topic to a list of subscribers
  // feel free to change/add data structures
  private Map<String, ArrayList<Subscriber>> topics;

  public GofudServer() {
    this.topics = new HashMap<>();
  }

  // TODO: method when server/broker is sending an event through a topic
  public void sendEvent(String topic, Event event) {
    ArrayList<Subscriber> subs = this.topics.get(topic);
    for (Subscriber s : subs) {
      s.onEvent(event);
    }
    return;
  }

  // TODO: method when a subscriber wants to subscribe to a topic
  public void addSubscriber(String topic, Subscriber subscriber) {
    if (this.topics.containsKey(topic)) {
      this.topics.get(topic).add(subscriber);
    } else {
      ArrayList<Subscriber> subs = new ArrayList<Subscriber>();
      subs.add(subscriber);
      this.topics.put(topic, subs);
    }
    return;
  }
}