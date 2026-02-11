package OscarSandoval.TareaArrays;

public class tarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hola mundo desde JAVA");

int a = 6;
int b = 7;

int resultado = a*b;

System.out.println("El resultado es: "+ resultado);
	}

}


//  4. Investigación: Arreglos en Java
// Responde de forma clara y ordenada, incluyendo ejemplos de código bien comentados (sin exceso) y legibles.

// 4.1 ¿Cómo se declara un arreglo en Java?
//Muestra al menos dos formas de declaración e inicialización.

//Respuesta: Un array en Java se declara indicando el tipo de dato seguido de corchetes [] y un nombre de variable.

//Ejemplos
//Forma 1: Declarar y luego crear el arreglo
// Declaración del arreglo
//int[] numeros;

//Creación del arreglo con tamaño 5
//numeros = new int[5];

//Asignación de valores
//numeros[0] = 10;
//numeros[1] = 20;

//Forma 2: Declarar y crear el arreglo en una sola línea
//int[] edades = new int[3];


//4.2 Métodos y utilidades principales para arreglos
//Describe y muestra ejemplos de al menos cinco métodos de java.util.Arrays

//Respuesta: La clase java.util.Arrays proporciona métodos estáticos que facilitan el manejo de arreglos, como ordenar, buscar, comparar y mostrar su contenido.

//Para usar estos métodos se debe importar:
//import java.util.Arrays;

//Ejemplos
//import java.util.Arrays;

//public class MetodosArrays {
  //  public static void main(String[] args) {

        // Arreglo de ejemplo
    //    int[] numeros = {5, 2, 9, 1, 3};

        // 1. Arrays.sort()
        // Ordena el arreglo de forma ascendente
      //  Arrays.sort(numeros);
        //System.out.println("Ordenado: " + Arrays.toString(numeros));

        // 2. Arrays.toString()
        // Convierte el arreglo en una cadena legible
        //System.out.println("Contenido del arreglo: " + Arrays.toString(numeros));

        // 3. Arrays.binarySearch()
        // Busca un elemento en el arreglo (debe estar ordenado)
        //int posicion = Arrays.binarySearch(numeros, 3);
        //System.out.println("Posición del número 3: " + posicion);

        // 4. Arrays.equals()
        // Compara si dos arreglos son iguales en tamaño y contenido
        //int[] otrosNumeros = {1, 2, 3, 5, 9};
        //boolean sonIguales = Arrays.equals(numeros, otrosNumeros);
        //System.out.println("¿Son iguales? " + sonIguales);

        // 5. Arrays.copyOf()
        // Crea una copia del arreglo con un nuevo tamaño
        //int[] copia = Arrays.copyOf(numeros, numeros.length);
        //System.out.println("Copia del arreglo: " + Arrays.toString(copia));

    //}
//}

//4.3 ¿Cómo se recorren los arreglos en Java?
//Explica y muestra ejemplos de al menos tres formas
//Respuesta: Recorrer un arreglo significa acceder a cada uno de sus elementos, normalmente para mostrar, modificar o procesar los datos.

//Ejemplos
//public class RecorridoArreglos {
//public static void main(String[] args) {

  //  int[] numeros = {10, 20, 30, 40, 50};

    // 1. Recorrido usando un ciclo for tradicional
    // Permite acceder al índice del arreglo
    //for (int i = 0; i < numeros.length; i++) {
    //    System.out.println("Posición " + i + ": " + numeros[i]);
    //}

    // 2. Recorrido usando for-each (for mejorado)
    // No usa índices, solo accede a los valores
    //for (int num : numeros) {
      //  System.out.println("Valor: " + num);
    //}

    // 3. Recorrido usando while
    // Útil cuando la condición no depende solo del tamaño
    //int i = 0;
    //while (i < numeros.length) {
      //  System.out.println("While -> " + numeros[i]);
        //i++;
    //}

//}
//}

//4.4 Diferencias entre arreglos y ArrayList en Java
//Explica, con ejemplos, las principales diferencias entre:

//Arreglos (arrays)

//ArrayList

//Incluye los siguientes puntos:

//Tamaño fijo vs tamaño dinámico

//Tipos primitivos vs clases envolventes

//Métodos disponibles (add, remove, size, etc.)

//Rendimiento

//¿Cuándo usar cada uno?

//Respuesta:
//1. Tamaño fijo vs tamaño dinámico
//Arreglos (arrays)
//El tamaño se define al crearlos
//No se puede cambiar después
//int[] numeros = new int[5]; // Tamaño fijo

// ArrayList
//El tamaño es dinámico
//Puede crecer o reducirse automáticamente
//ArrayList<Integer> numeros = new ArrayList<>();
//numeros.add(10);
//numeros.add(20);

//2. Tipos primitivos vs clases envolventes
// Arreglos
//Pueden almacenar tipos primitivos y objetos
//int[] edades = {18, 20, 25}; // Tipo primitivo

//ArrayList
//No acepta tipos primitivos
//Usa clases envolventes (wrapper)
//ArrayList<Integer> edades = new ArrayList<>(); 

//3. Métodos disponibles
//Arreglos
//No tienen métodos propios
//Se usan propiedades y clases externas
//int tamaño = numeros.length; // length es una propiedad

// ArrayList
//Tiene muchos métodos útiles integrados
//numeros.add(30);   // Agregar
//numeros.remove(0); // Eliminar
//numeros.size();    // Tamaño actual
//numeros.get(0);    // Obtener elemento

//4. Rendimiento
//Arreglos
//Más rápidos
//Menor consumo de memoria
//Acceso directo a los elementos
//int valor = numeros[2];

// ArrayList
//Ligeramente más lento
//Usa más memoria
//Maneja crecimiento automático
//int valor = numeros.get(2);

//5. ¿Cuándo usar cada uno?
//Usar arreglos cuando:

//El tamaño es conocido y fijo
//Se necesita máximo rendimiento
//Se trabajan con tipos primitivos
//Ejemplos: calificaciones fijas, días de la semana

//Usar ArrayList cuando:
//El tamaño puede cambiar
//Se agregan o eliminan elementos frecuentemente
//Se quiere código más flexible
//Ejemplos: lista de usuarios, carrito de compras

