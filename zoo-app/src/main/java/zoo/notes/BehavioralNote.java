package zoo.notes;

import java.time.LocalDateTime;

import com.google.gson.JsonObject;

import zoo.animals.Animal;

public class BehavioralNote extends BasicNote {
    private int mood;
    private double sleepTime;
    private boolean isSocializing;
    

    public BehavioralNote(Animal animal, String text, LocalDateTime date) {
        super(animal, text, date);
        this.mood = 10;
        this.sleepTime = 24.0;
        this.isSocializing = true;
    }

    public BehavioralNote(Animal animal, String text, LocalDateTime date, int mood, double sleepTime, boolean isSocializing) {
        this(animal, text, date);
        this.mood = mood;
        this.sleepTime = sleepTime;
        this.isSocializing = isSocializing;
    }

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
