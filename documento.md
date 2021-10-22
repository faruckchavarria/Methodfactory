# Elaboracion de patron Method factory

### Para poder realizar este ejercicio se creo una carpeta, y dentro de ella se creo el repositorio de github para seguir el guardado continuo de las versiones
### primero debemos crear una clase que sirva como referencia al patron que estamos realizando ene ste caso la clase inicial sera la clase Figuras que es una clase abstracta que sera usada en las demas clases para el ahorro de codigo o reutilizacion.
![Captura numero 1](Capturas\2.PNG)

### Inicializamos una clase que tendre la variables de lados y las variabes de G,X,Y para la elaboracion de sus lados utilizados en las demas clases, al ser una clase abstracta sera capaz de ser utilizada en otras clases, usando los Gets podraa pedirse la cantidad de area como se tiene pensado utilizar.

## Elaboracion de la clase Cuadrado
### Al elorar esta clase debemos saber que obtendremos datos y variables desde la clase abstracta de figuras por eso debemos colocar que setra extends de la clase figuras.
![Captura numero 1](Capturas\3.PNG)
### Hacemos uso de los metodos que son ya utilizados en la clase de figuras que son para el area dnde obtenemos los valores se usan lado, y la instancia de dibujar para utilizar las variables de lado en G, X, Y, agregadole un color al momento de su creacion.
## Creacion de la clase Circulo