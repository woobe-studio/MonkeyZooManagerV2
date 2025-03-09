package zoo.notes;

import java.time.LocalDateTime;

import com.google.gson.JsonObject;

import zoo.animals.Animal;

public class OtherNote extends BasicNote {
    private String topic = "";
    

    public OtherNote(Animal animal, String text, LocalDateTime date) {
        super(animal, text, date);
        this.topic = "";
    }

    public OtherNote(Animal animal, String text, LocalDateTime date, String topic) {
        this(animal, text, date);
        this.topic = topic;
    }

    
    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        if (!topic.isEmpty())
        this.topic = topic;
    }

    @Override
    public void toJson(JsonObject json) {
        super.toJson(json);
        json.addProperty("topic", this.topic);

    }

    @Override
    public void fromJson(JsonObject json) {
        super.fromJson(json);
        String topic = json.get("topic").getAsString();
        this.topic = topic;
    }
}
