
# Tarea de Programación: Cálculo de Descuento en Compras

## Objetivo
Practicar el uso de **funciones en Java**, incluyendo parámetros, valores predeterminados y retorno de valores.  
El programa calcula el descuento en compras en función del monto total y muestra el monto final a pagar.  

---

## Instrucciones

### 1. Creación de la función
Se implementó una función llamada `calcular_descuento` que recibe dos parámetros:
- `monto`: valor total de la compra.  
- `porcentaje`: porcentaje de descuento (con valor predeterminado del **10%**).  

La función devuelve el monto del descuento calculado.

### 2. Llamadas a la función
- En la **primera llamada**, se envía solo el monto (usa el descuento por defecto del 10%).  
- En la **segunda llamada**, se envía el monto y un porcentaje específico de descuento.  

### 3. Salida de resultados
El programa muestra:  
- Monto de la compra.  
- Descuento aplicado.  
- Monto final a pagar.  

---

## Código en Java

```java
public class CalculoDescuento {

    // Función con dos parámetros
    public static double calcular_descuento(double monto, double porcentaje) {
        return monto * (porcentaje / 100);
    }

    // Sobrecarga de la función con valor predeterminado (10%)
    public static double calcular_descuento(double monto) {
        return calcular_descuento(monto, 10); 
    }

    public static void main(String[] args) {
        // Primera llamada: monto con descuento por defecto (10%)
        double monto1 = 200.0;
        double descuento1 = calcular_descuento(monto1);
        double total1 = monto1 - descuento1;

        // Segunda llamada: monto + porcentaje específico (20%)
        double monto2 = 500.0;
        double descuento2 = calcular_descuento(monto2, 20);
        double total2 = monto2 - descuento2;

        // Resultados en pantalla
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

