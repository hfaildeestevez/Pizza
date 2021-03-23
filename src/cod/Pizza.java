package cod;

public class Pizza {

    public static final Integer PEQUEÑA = 0;
    public static final Integer MEDIANA = 1;
    public static final Integer GRANDE = 2;

    private String masa, tipoSalsa;
    private boolean relleno, salsa, cebolla, sinGluten, extraQueso, piña, champiñones, jamon;
    private int tipo;


    public Pizza() {
        this.masa = "normal";
        this.tipoSalsa = "Tomate";
        this.relleno = true;
        this.salsa = true;
        this.cebolla = false;
        this.sinGluten = true;
        this.extraQueso = false;
        this.piña = false;
        this.champiñones = false;
        this.jamon = true;
        this.tipo = MEDIANA;
    }

    /**
     * Objeto pizza
     *
     * @param masa        Puede ser fina, normal o gruesa
     * @param tipoSalsa   si o no
     * @param relleno     si o no
     * @param salsa       si o no
     * @param cebolla     si o no
     * @param sinGluten   si o no
     * @param extraQueso  si o no
     * @param piña        si o no
     * @param champiñones si o no
     * @param jamon       si o no
     * @param tipo        1-Pequeña 2-mediana 3 grande
     */
    public Pizza(String masa, String tipoSalsa, boolean relleno, boolean salsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon, int tipo) {
        this.masa = masa;
        this.tipoSalsa = tipoSalsa;
        this.relleno = relleno;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
        this.tipo = tipo;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tu pizza se compone de: " +
                "masa='" + masa + '\'' +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", relleno=" + relleno +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                ", tipo=" + tipo;
    }
}
