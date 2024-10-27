package tenthattempt.SedanComponents;

public class Dashboard {
    private int odometer;
    private int gasLevel;
    private int oilLevel;
    private int coolantLevel;

    // Getter methods
/*     
    For the table of records well need and sort by each of the columns:
    Description
    Created Date
    Updated Date
     */
    public int getOdometer() {
        return odometer;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getCoolantLevel() {
        return coolantLevel;
    }

    // Setter methods
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public void setCoolantLevel(int coolantLevel) {
        this.coolantLevel = coolantLevel;
    }
}
