public class CalculoDescuento {

    // Función para calcular el descuento
    public static double calcular_descuento(double monto, double porcentaje) {
        return monto * (porcentaje / 100);
    }

    // Sobrecarga de la función con valor predeterminado (10%)
    public static double calcular_descuento(double monto) {
        return calcular_descuento(monto, 10); // Usa 10% como descuento por defecto
    }

    public static void main(String[] args) {
        // Primera llamada: solo monto (usa descuento por defecto 10%)
        double monto1 = 200.0;
        double descuento1 = calcular_descuento(monto1);
        double total1 = monto1 - descuento1;

        // Segunda llamada: monto + porcentaje específico
        double monto2 = 500.0;
        double descuento2 = calcular_descuento(monto2, 20); // 20% de descuento
        double total2 = monto2 - descuento2;

        // Mostrar resultados
        System.out.println("Compra 1:");
        System.out.println("Monto: $" + monto1);
        System.out.println("Descuento aplicado: $" + descuento1);
        System.out.println("Total a pagar: $" + total1);

        System.out.println("\nCompra 2:");
        System.out.println("Monto: $" + monto2);
        System.out.println("Descuento aplicado: $" + descuento2);
        System.out.println("Total a pagar: $" + total2);
    }
}
