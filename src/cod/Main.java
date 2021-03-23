package cod;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        Pizza p1 = new Pizza();
        System.out.println("Pizza 1\n" + p1.toString());
        Pizza p2 = new Pizza("fina", "tomate", true, true, false, false, true, false, false, true, Pizza.GRANDE);
        System.out.println("Pizza 2\n" + p2.toString());
        Pizza p3 = new Pizza();
        p3.setMasa("normal");
        p3.setTipoSalsa("tomate");
        p3.setRelleno(false);
        p3.setSalsa(true);
        p3.setCebolla(true);
        p3.setSinGluten(true);
        p3.setExtraQueso(false);
        p3.setPiña(true);
        p3.setChampiñones(true);
        p3.setJamon(false);
        p3.setTipo(Pizza.GRANDE);

        System.out.println("Pizza 3\n" + p3.toString());
        */


        Pizza base = new BuilderPizza().setMasa("pan").setTipoSalsa("tomate").build();

        Pizza rellenita = new BuilderPizza()
                .setMasa("pan")
                .setTipoSalsa("tomate")
                .build();
        System.out.println("Las pizzas: "+base+", "+rellenita);
    }

}
