package zoo.notes;

import java.time.LocalDateTime;

import com.google.gson.JsonObject;

import zoo.animals.Animal;

public class MedicalNote extends BasicNote {
    private double costOfMedications;
    private double procedureCost;
    
       public MedicalNote(Animal animal, String text, LocalDateTime date) {
        super(animal, text, date);
        this.costOfMedications = 5.0;
        this.procedureCost = 10.0;
    }

    public MedicalNote(Animal animal, String text, LocalDateTime date, double costOfMedications, double procedureCost) {
        this(animal, text, date);
        this.costOfMedications = costOfMedications;
        this.procedureCost = procedureCost;
    }
   
    public double getCostOfMedications() {
        return this.costOfMedications;
    }

    public void setCostOfMedications(double costOfMedications) {
        this.costOfMedications = costOfMedications;
    }

    public double getProcedureCost() {
        return this.procedureCost;
    }

    public void setProcedureCost(double procedureCost) {
        this.procedureCost = procedureCost;
    }

    @Override
    public void toJson(JsonObject json) {
        super.toJson(json);
        json.addProperty("costOfMedications", this.costOfMedications);
        json.addProperty("procedureCost", this.procedureCost);

    }

    @Override
    public void fromJson(JsonObject json) {
        super.fromJson(json);
        double costOfMedications = json.get("costOfMedications").getAsDouble();
        double procedureCost = json.get("procedureCost").getAsDouble();
        this.costOfMedications = costOfMedications;
        this.procedureCost = procedureCost;
    }
}
