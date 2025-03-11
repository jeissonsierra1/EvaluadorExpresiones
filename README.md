# Evaluador de Expresiones Aritméticas 

# Descripción

Este proyecto es un programa en Java que permite evaluar expresiones aritméticas escritas en notación infija. Utiliza la estructura de datos Pila (Stack) para:

- Verificar si los paréntesis están balanceados.
- Convertir una expresión infija a notación postfija (Polaca Inversa).
- Evaluar la expresión postfija y obtener el resultado numérico.

Este programa se ha desarrollado en Java utilizando el IDE NetBeans.

# Características

- Implementación modular con tres funciones principales.
- Uso de Stack para el manejo de expresiones matemáticas.
- Validación de expresiones con paréntesis balanceados.
- Conversión de notación infija a postfija respetando la precedencia de operadores.
- Evaluación correcta de expresiones en notación postfija.

# Requisitos
Para ejecutar este proyecto, necesitas:

- Java JDK 8 o superior
- NetBeans IDE (opcional, pero recomendado)

# Estructura del Proyecto
El código está organizado de la siguiente manera:

- EvaluadorExpresiones/
- │── src/
- │   ├── logica/
- │   │   ├── BalanceoParentesis.java  
- │   │   ├── ConvertidorInfijaPostfija.java  
- │   │   ├── EvaluadorPostfija.java  
- │   ├── main/
- │   │   ├── Main.java  |Clase principal del programa|
- │── README.md  
- │── build.xml 
- │── manifest.mf  

# Ejecución

- Clonar el repositorio:  
   ```sh
   https://github.com/jeissonsierra1/EvaluadorExpresiones.git
``
- Compilar y ejecutar en terminal
- Ejecutar en NetBeans:
  
1. Abre NetBeans y selecciona Archivo → Abrir Proyecto.
2. Busca la carpeta del proyecto y ábrela.
3. Ejecuta el programa en la clase Main.




