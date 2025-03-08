package zoo.notes;

import com.google.gson.JsonObject;

public class MedicalNote extends BasicNote {
    double costOfMedications = 0.0;
    double procedureCost = 0.0;
    
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
