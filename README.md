# Taller-Referencias-paquetes-y-encapsulamiento-Martin-Pacheco
# Etapa 1: Programación Orientada a Objetos en Java

## Preguntas y respuestas

### 1. ¿Qué guarda una variable `int` y qué guarda una variable `Libro`?

Una variable `int` guarda un número entero, como 5 o 10. En cambio, una variable `Libro` guarda una referencia a un objeto de esa clase, que permite acceder a sus atributos y métodos.

### 2. ¿Por qué prestar con `l2` cambió `l1` pero no `l3`?

Porque `l1` y `l2` apuntaban al mismo objeto en la memoria. Por eso, al modificar el libro mediante `l2`, el cambio también se podía observar desde `l1`. En cambio, `l3` apuntaba a un objeto diferente.

### 3. ¿Por qué el compilador no detectó la `NullPointerException`?

Porque el compilador no siempre puede saber si una referencia tendrá el valor `null` durante la ejecución. El error aparece cuando el programa intenta utilizar una referencia nula para acceder a un atributo o método.

### 4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?

Modificar un objeto cambia su estado, y ese cambio se puede observar desde otras variables que apuntan al mismo objeto. En cambio, asignar un objeto nuevo al parámetro solo cambia la referencia local del método y no modifica la referencia original de la variable externa.

### 5. ¿Qué invariantes protege `Libro` y cómo las protege?

La clase `Libro` protege varias invariantes:

- **Título válido:** mediante `setTitulo()`, evita aceptar títulos nulos o vacíos.
- **Disponibilidad:** mediante `prestar()` y `devolver()`, controla el estado de disponibilidad del libro.
- **Encapsulamiento:** declara sus atributos como `private` para impedir que otras clases los modifiquen directamente.

Estas medidas ayudan a mantener el estado del objeto consistente y a evitar modificaciones incorrectas.
