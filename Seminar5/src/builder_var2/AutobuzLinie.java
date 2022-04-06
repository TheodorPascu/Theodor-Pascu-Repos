package builder_var2;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int numarCalatori;

    public AutobuzLinie(int nrLinie, String numeSofer, boolean deschideUsile, boolean areOprire, String textRulat, String model, int numarCalatori) {
        this.nrLinie = nrLinie;
        this.numeSofer = numeSofer;
        this.deschideUsile = deschideUsile;
        this.areOprire = areOprire;
        this.textRulat = textRulat;
        this.model = model;
        this.numarCalatori = numarCalatori;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("nrLinie=").append(this.nrLinie);
        sb.append(", numeSofer='").append(this.numeSofer).append('\'');
        sb.append(", deschideUsile=").append(this.deschideUsile);
        sb.append(", areOprire=").append(this.areOprire);
        sb.append(", textRulat='").append(this.textRulat).append('\'');
        sb.append(", model='").append(this.model).append('\'');
        sb.append(", numarCalatori=").append(this.numarCalatori);
        sb.append('}');
        return sb.toString();
    }
}
