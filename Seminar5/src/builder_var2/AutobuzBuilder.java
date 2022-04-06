package builder_var2;

public class AutobuzBuilder implements Builder {
    private int nrLinie = 102;
    private String numeSofer = "Andrei";
    private boolean deschideUsile = false;
    private boolean areOprire = false;
    private String textRulat = "welcome";
    private String model = "renault";
    private int numarCalatori = 24;

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.textRulat = textRulat;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
        return this;
    }

    public AutobuzBuilder() {
    }

    public AutobuzLinie build() {
        return new AutobuzLinie(this.nrLinie, this.numeSofer, this.deschideUsile, this.areOprire, this.textRulat, this.model, this.numarCalatori);
    }
}

