package app.SedanComponents;

public class Diagnostics {
    boolean CheckEngine;
    boolean oilLow;
    boolean tirePressureLow;
    boolean fuseForHeadLightBlown;

    public boolean isCheckEngine() {
        return CheckEngine;
    }

    public boolean isoilLow() {
        return oilLow;
    }

    public boolean istirePressureLow() {
        return tirePressureLow;
    }

    public boolean IsFuseForHeadLightBlown() {
        return fuseForHeadLightBlown;
    }

    public void setCheckEngine(boolean CheckEngine) {
        this.CheckEngine = CheckEngine;
    }

    public void setoilLow(boolean oilLow) {
        this.oilLow = oilLow;
    }

    public void setTirePressureLow(boolean tirePressureLow) {
        this.tirePressureLow = tirePressureLow;
    }

    public void setfuseForHeadLightBlown(boolean fuseForHeadLightBlown) {
        this.fuseForHeadLightBlown = fuseForHeadLightBlown;
    }
}
