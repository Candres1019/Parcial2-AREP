package co.edu.escuelaing.arep.parcial2;

import co.edu.escuelaing.arep.parcial2.service.Calculator;
import co.edu.escuelaing.arep.parcial2.service.impl.CalculatorImpl;
import com.google.gson.Gson;

import static spark.Spark.*;

public class SparkCalculatorAcos {

    /**
     * Método Main de la clase SparkCalculatorAcos
     *
     * @param args - args
     */
    public static void main(String[] args) {
        port(getPort());
        System.out.println("Corriendo por el puerto: " + getPort());
        init();
        get("/acos", (request, response) -> {
            response.type("application/json");
            String operation = "acos";
            Double number;
            try {
                number = Double.parseDouble(request.queryParams("value"));
            } catch (Exception e) {
                return "Numero Ingresado no es numero";
            }
            Calculator calculator = new CalculatorImpl();
            Double acosResult = calculator.acos(number);
            if (acosResult.isNaN()) {
                return "El rango de la funcion debe estar entre [-1, 1]";
            }
            return new Gson().toJson("{\"operation\": \"" + operation + "\", \"input\": \"" + number + "\", \"output\": \"" + acosResult + "\", }");
        });
    }

    /**
     * Retorna el puerto por el que debería correr el servidor, creado para evitar errores en un ambiente de
     * despliegue no local
     *
     * @return - puerto.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4565;

    }

}