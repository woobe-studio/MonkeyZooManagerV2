package zoo.notes;

import com.google.gson.JsonObject;

public class BehavioralNote extends BasicNote {
    int mood = 3;
    double sleepTime = 12.0;
    boolean isSocializing = false;
    
    public int getMood() {
        return this.mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public double getSleepTime() {
        return this.sleepTime;
    }

    public void setSleepTime(double sleepTime) {
        this.sleepTime = sleepTime;
    }

    public boolean getIsSocializing() {
        return this.isSocializing;
    }

    public void setIsSocializing(boolean isSocializing) {
        this.isSocializing = isSocializing;
    }

    @Override
    public void toJson(JsonObject json) {
        super.toJson(json);
        json.addProperty("mood", this.mood);
        json.addProperty("sleepTime", this.sleepTime);
        json.addProperty("isSocializing", this.isSocializing);

    }

    @Override
    public void fromJson(JsonObject json) {
        super.fromJson(json);
        int mood = json.get("mood").getAsInt();
        double sleepTime = json.get("sleepTime").getAsDouble();
        boolean isSocializing = json.get("isSocializing").getAsBoolean();
        this.mood = mood;
        this.sleepTime = sleepTime;
        this.isSocializing = isSocializing;
    }
}
