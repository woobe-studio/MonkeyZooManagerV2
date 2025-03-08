package zoo.notes;

import java.time.LocalDateTime;

import com.google.gson.JsonObject;

import zoo.animals.Animal;

public class BehavioralNote implements Note {
    private Animal animal;
    private String text;
    private LocalDateTime date; 

    @Override
    public Animal getAnimal() {
        return animal;
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public LocalDateTime getDate() {
        return this.date;
    }

    @Override
    public void setDate() {
        this.date = LocalDateTime.now();
    }

    @Override
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String getNote() {
        return this.text;
    }

    @Override
    public void setNote(String note) {
        this.text = note;
    }

    @Override
    public void toJson(JsonObject json) {
        json.addProperty("text", this.text);
        json.addProperty("date", this.date.toString());
    }

    @Override
    public void fromJson(JsonObject json) {
        String text = json.get("text").getAsString();
        String dateStr = json.get("date").getAsString();
        this.text = text;
        this.date = LocalDateTime.parse(dateStr);
    }
}
