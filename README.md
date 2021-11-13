# Methodfactory

* [Patron de diseño de methodFactory](Methodfactory\documento.md)

# Elaboracion de patron Method factory

### Para poder realizar este ejercicio se creo una carpeta, y dentro de ella se creo el repositorio de github para seguir el guardado continuo de las versiones
### primero debemos crear una clase que sirva como referencia al patron que estamos realizando en este caso la clase inicial sera la clase Figuras que es una clase abstracta que sera usada en las demas clases para el ahorro de codigo o reutilizacion.
<img src="Capturas\1.PNG" alt="Caso1"/>

### Inicializamos una clase que tendre la variables de lados y las variabes de G,X,Y para la elaboracion de sus lados utilizados en las demas clases, al ser una clase abstracta sera capaz de ser utilizada en otras clases, usando los Gets podraa pedirse la cantidad de area como se tiene pensado utilizar.

## Elaboracion de la clase Cuadrado
### Al elaborar esta clase debemos saber que obtendremos datos y variables desde la clase abstracta de figuras por eso debemos colocar que setra extends de la clase figuras.
<img src="Capturas\2.PNG" alt="Caso1"/>

### Hacemos uso de los metodos que son ya utilizados en la clase de figuras que son para el area donde obtenemos los valores se usan lado, y la instancia de dibujar para utilizar las variables de lado en G, X, Y, agregadole un color al momento de su creacion.

## Creacion de la clase Circulo
### al crear la clase de circulo debemos de igual forma extenderla de la clase figura para reutilizar codigo o argumentos que esta clase contiene y de esta forma  poder resolver y obtener los datos necesarios.
<img src="Capturas\3.PNG" alt="Caso1"/>

### en esta clase ya utilizamos datos de retorno a la clase funcion donde mostramos valores que son necesarios para dar respuesta, dentro del getArea podemos ver las funciones matematicas que se usaran para la crecion de un circulo en dependencia a el area que ingrese el usuario, de igual forma en el dibujo que se muestre se mostrar la informacion guardada en el Get y sera expresada con el color rojo.
# Creamos la clase Factoria de figuras
### Esta clase nos pemitira, la crreacion de nuevas figuras cada ves que cambiemos los valores en la clase principal de interfaz, que aun no se ha creado, pero cada ves que cambiemos valores sera una nueva figura ya sea de tipo cuadrado o de tipo circulo.
<img src="Capturas\4.PNG" alt="Caso1"/>

# creacion de la clase Prueba factoria
### Sera la clase de tipo principal donde extendemos de la libreria de Jframe el cual nos permite trabajr interfaces graficas, que se implementan con actionListener.
<img src="Capturas\5.PNG" alt="Caso1"/>

### Luego hacemos la creacion de variables con sus respectivo objeivos en la interfaz donde seviran como paneles, botones y cajas de textos, con las opciones de borra, dibujar y ingresar el tipo y lado de figuras
### Luego tenemos el Main, donde tendemos los valores que se van a ejecutar los valores que declaramos en la clase anterior, o metodo anterior, dentro de ella pondremos margenes de anchura y altura a la ventana que se esta desarrollando para mostrar esa informacion.
<img src="Capturas\6.PNG" alt="Caso1"/>

### Luego comenzamos a tomar los valores ingresados por el usuario debemos convertir los valores de tipo String a tipo entero ya que seran valores agregados por teclado en numeros, donde ya hay valores de referencia para su desarrollo.
<img src="Capturas\7.PNG" alt="Caso1"/>

### Se utiñizan valores de Y y X para poder transformar las figuras

<img src="Capturas\8.PNG" alt="Caso1"/>

# Resultados
<img src="Capturas\9.PNG" alt="Caso1"/>