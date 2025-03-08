package zoo.notes;

import com.google.gson.JsonObject;

public class OtherNote extends BasicNote {
    String topic = "";
    
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
