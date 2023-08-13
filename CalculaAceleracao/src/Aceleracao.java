public class Aceleracao {

    private int forca, massa;

    public Aceleracao(int forca, int massa) {
        this.forca = forca;
        this.massa = massa;
    }

    public int aceleracao() {
        return  forca / massa;
    }

}
