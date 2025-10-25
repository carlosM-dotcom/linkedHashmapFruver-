import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra tienda de frutas y verduras!");

        Map <String, Double> inventarios = new LinkedHashMap<>(); 
        
        inventarios.put("Manzana", 1.700);
        inventarios.put("Banana", 1.550);
        inventarios.put("Naranja", 1.200);
        inventarios.put("Lechuga", 1.990);
        inventarios.put("Tomate", 1.115);
        inventarios.put("Zanahoria", 1.000);

        System.out.println("Inventario de productos:");
       for ( String  fruta : inventarios.keySet()) {
       System.out.println (fruta + ":$" + inventarios.get(fruta));
         
    
        }   

        String FrutaBuscada = " manzana ";
        System.out.println("se acerca un cliente y nos pide la siguiente fruta:"+ FrutaBuscada);

        if (inventarios.containsKey(FrutaBuscada)) {
            System.out.println(FrutaBuscada + "esta en el inventario, te lo podemos vender");
        } else {
            System.out.println(FrutaBuscada + "no esta en el inventario, lo sentimos");

        String  sinStok = "Manzana";
        inventarios.remove(sinStok);
        System.out.println("Nos quedamos sin  " + sinStok + ":");

        }

    }
}
