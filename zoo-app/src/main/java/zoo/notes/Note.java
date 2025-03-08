package zoo.notes;

import java.time.LocalDateTime;

import com.google.gson.JsonObject;

import zoo.animals.Animal;

public interface Note {

    Animal getAnimal();
    void setAnimal(Animal animal);

    LocalDateTime getDate();
    void setDate();
    void setDate(LocalDateTime date);

    String getNote();
    void setNote(String note);

    void toJson(JsonObject json);
    void fromJson(JsonObject json);
}
