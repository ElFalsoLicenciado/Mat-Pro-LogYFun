# Balancear paréntesis

## **Fecha**: 08/28/26 

## **Descripción**: 
Crear un programa que funcione como una lista donde se almacenan `(` y `)`, donde si se coloca un `)` se borre un `(` solo sí está antes del `)`. Si los paréntesis están en el orden correcta no quedará ninguno, de lo contrario quedarán paréntesis.

## Recorrido de una lista

![Pop caso 1](img/lista-ejer-0-1.png)


## Descripción del código

### Clase `Node`

Primero hablemos de lo más importante, el nodo, para que funcione en tipo lista se crea un modelito llamado *Node*.

La estructura de un *Node* es sencilla, en *c* se almacena el paréntesis sea un `{` o `}` y *next* "guardaría" la referencia al nodo que le siguen. 

```java
public class Node {  
    char c;  
    Node next;  
[...]
```

El siguiente código es el **constructor del nodo**,recibe un parámetro tipo *char* y además se referencia que el siguiente nodo es nulo. 

```java
[...]
    Node (char c) {  
        this.c = c;  
        this.next = null;  
    }  
}
```

### Clase `Main`

En esta clase se inicializa el programa.

Dentro de la clase *Main*, se el método **main** que permite ejecutar el programa y se inicializan las siguientes variables:
- *root*: Nodo raíz de la lista
- *sc*: Nos permite recibir input de texto desde la consola.
- *mt*: Objeto para acceder a la lógica principal del programa.
- *input*: Cadena donde se almacena la cadena de paréntesis.

```java
public class Main {  
      
    public static void main(String[] args) {  
        Node root = null;  
        Scanner sc = new Scanner(System.in);  
        Methods mt = new Methods();  
        String input;
[...]
```

Este es el ciclo del programa, a continuación se explica cada paso:

```java
[...]
        while(true){
            mt.show(root); // SE MUESTRA EL CONTENIDO DE LA LISTA
            System.out.print("\nInput: ");
            input = sc.next(); // SE PIDE LA CADENA Y GUARDA EN INPUT
            if (input.equals("q")) return; // SI LA CADENA ES Q SE TERMINA EL PROGRAMA
            // CICLO PARA CREAR UN NODO PARA CADA CARACTER INGRESADO EN LA CADENA
            for (int i = 0; i < input.length(); i++) { 
                root = mt.proc(root,input.charAt(i));  
            }  
        }  
    }  
}
```

### Clase `Methods`

Aquí tenemos la lógica para balancear los paréntesis.
#### Método `proc`

El primer método es *proc*, recibe de parámetros el nodo raíz y un carácter. En este método se decide que ruta tomar dependiendo del carácter introducido.

```java
public Node proc(Node root, char i){  
    // SE CREA EL NODO
    Node node = new Node(i);  
	
	// SI NO HAY NODOS EN LA RAIZ, ENTONCES EL NUEVO NODO SERÁ LA RAÍZ
    if(root==null) return node;  
	  
	// SI EL CARACTER ES UN '('  SE AGREGUA AL FINAL DE LA LISTA
    if(i == '(') return push(root, node);  
    // SI ES UN ')' PROCEDER AL MÉTODO POP
    return pop(root, node);  
}
```

#### Método `push`

En este método se realiza la lógica para agregar un nodo al final de la lista. Se reciben de parámetros:
- *root*: Nodo raíz para empezar a navegar dentro de la lista.
- *node*: Nodo a introducir en la lista.

```java
private Node push(Node root, Node node) {
    // UNA "COPIA" DE ROOT PARA NO CAMBIAR DE POSICIÓN A ROOT.
    Node aux = root;  
    while (true) {
	    // SI EL NODO ACTUAL NO LE SIGUE OTRO:   
        if (aux.next == null) {
	        // AÑADIR EL NUEVO NODO AL ÚLTIMO NODO 
            aux.next = node;  
            break;  
        }  
        // PASAR AL SIGUIENTE NODO
        aux = aux.next;  
    }
    return root;  
}
```


![Push](img/push-ejer-0-1.png)

#### Método `pop`

Si bien el método no es exclusivamente siempre para eliminar un nodo, en este se lleva la lógica a la hora de introducir un ')', esto significa que se debe buscar un '(' y eliminarlo, de lo contrario si no se encuentra se agrega el ')' a la lista.

Al igual que  [[Ejercicio0-1/README#Método `push`|push]], recibe de parámetros *root* y *node* que fungen en lo mismo. Sin embargo, hay un elemento nuevo al principio del método y es *prev*. En *prev* irá guardando a *aux* mientras vamos navegando por la lista, este servirá para un caso en específico.

```java
private Node pop(Node root, Node node) {  
    Node aux = root;  
    Node prev = null; // VARIABLE PARA EL NODO ANTERIOR O PREVIO
    
    while(true) {
	    [...]
	    prev = aux; // n
		aux = aux.next; //n+1
	}
	return root;
}
```

Dividiré el método en 3 casos:

1. **El `(` se encuentra en la posición 0**: Si hay un paréntesis al principio de la lista raíz ahora será el nodo siguiente a raíz. 

```java
if(aux.c == '(' && prev == null) {  
    root = aux.next;  
    break;  
}
```


![Pop caso 1](img/pop-1-ejer-0-1.png)


2. **El `(` se encuentra en la posición 0+n** (siendo n >= 1 y n < longitud de la lista):  Si hay un paréntesis después del primer nodo de la lista, este nodo puede estar antes o en el final de la lista. 

```java
if (aux.c == '(') {  
    prev.next = aux.next;  
    break;  
}
```


![Pop caso 1](img/pop-2-ejer-0-1.png)

3. **No hay**: Como no se encontró ningún `(` entonces el `)` se agregará a la lista.

```java
// DIRECTAMENTE IR A AGREGAR EL NODO A LA LISTA Y REGRESAR EL OBJETO
if(aux.next == null) return push(root, node);
```

#### Método `show`

En este método simplemente se recorre la lista y imprimen el carácter de cada nodo.