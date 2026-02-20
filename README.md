Calculadora App - Proyecto de Programación Orientada a Objetos (POO)
📌 Descripción del Proyecto
Calculadora App es una aplicación de escritorio desarrollada en Java utilizando Swing para la interfaz gráfica. Este proyecto fue creado como parte de la asignatura de Programación Orientada a Objetos (POO) en la Universidad UTS.

La aplicación permite realizar operaciones matemáticas básicas (suma, resta, multiplicación y división) entre dos números, con validaciones de entrada y manejo de errores, siguiendo los principios de la POO.

👩‍💻 Autora
Liseth Nathalia Ayala
Estudiante de la Universidad UTS
Trabajo presentado para la asignatura de Programación Orientada a Objetos

🧠 Conceptos de POO Aplicados
Clases y Objetos: Se utiliza la clase Calculadora (proveniente del paquete utils.edu.fpoo.mundo) para encapsular la lógica de las operaciones.

Encapsulamiento: Los operandos se asignan a través de métodos set y se obtienen con métodos get.

Métodos: Cada operación matemática es un método dentro de la clase Calculadora.

Separación de responsabilidades: La interfaz gráfica (FormularioCalculadora) maneja la interacción con el usuario, mientras que la lógica de negocio está en la clase Calculadora.

🖥️ Tecnologías Utilizadas
Java SE

Swing (para la interfaz gráfica)

NetBeans (entorno de desarrollo)

AbsoluteLayout (diseño de interfaz)

🧮 Funcionalidades
Ingreso de dos números (enteros o decimales).

Validación de campos vacíos.

Validación de tipo de dato (solo números).

Prevención de división entre cero.

Realización de operaciones:

➕ Suma

➖ Resta

✖️ Multiplicación

➗ División

Visualización del resultado en campos específicos.

Botón Limpiar para reiniciar todos los campos.

Botón Salir para cerrar la ventana.

🚀 Cómo ejecutar el proyecto
Clona el repositorio o descarga los archivos fuente.

Abre el proyecto en NetBeans (o cualquier IDE compatible con Java).

Asegúrate de que la clase Calculadora esté disponible en la ruta:
utils.edu.fpoo.mundo.Calculadora

Ejecuta la clase FormularioCalculadora.

📁 Estructura del Proyecto
text
calculadoraapp/
│
├── FormularioCalculadora.java       # Interfaz gráfica y lógica de eventos
│
└── utils/
    └── edu/
        └── fpoo/
            └── mundo/
                └── Calculadora.java  # Lógica de las operaciones
📸 Vista Previa
(Aquí puedes agregar una captura de pantalla de la interfaz si deseas)

📚 Notas Académicas
Este proyecto fue desarrollado con fines educativos para demostrar la aplicación de los conceptos fundamentales de la Programación Orientada a Objetos en un entorno gráfico interactivo.

