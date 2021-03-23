package cod;

public class BuilderPizza {
    //como vamos al objeto que crea nuestro Builder
    //el guion bajo es para indicar que es de esta clase
    Pizza _pizza;

    //metodo que debuelve el objeto terminado
    public Pizza build() {
        return _pizza;
    }

    //constructor
    public BuilderPizza() {
        _pizza = new Pizza();
    }

    //metodos
    public BuilderPizza setMasa(String tipoMasa) {
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizza setTipoSalsa(String tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizza setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizza setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizza setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizza setSinGluten(boolean gluten) {
        _pizza.setSinGluten(gluten);
        return this;
    }

    public BuilderPizza setExtraQueso(boolean extraQueso) {
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public BuilderPizza setPiña(boolean piña) {
        _pizza.setPiña(piña);
        return this;
    }

    public BuilderPizza setChampiñones(boolean champiñones) {
        _pizza.setChampiñones(champiñones);
        return this;
    }

    public BuilderPizza setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }

    public BuilderPizza setTipo(int tipo) {
        _pizza.setTipo(tipo);
        return this;
    }


}
