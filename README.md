# 🧮 Calculadora App - Proyecto de Programación Orientada a Objetos (POO)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-007396?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

---

## 📋 Tabla de Contenidos
- [Descripción del Proyecto](#-descripción-del-proyecto)
- [Autora](#-autora)
- [Universidad](#-universidad)
- [Características](#-características)
- [Conceptos POO Aplicados](#-conceptos-poo-aplicados)
- [Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Funcionalidades](#-funcionalidades)
- [Validaciones Implementadas](#-validaciones-implementadas)
- [Cómo Ejecutar](#-cómo-ejecutar)
- [Capturas de Pantalla](#-capturas-de-pantalla)
- [Evidencias de Funcionamiento](#-evidencias-de-funcionamiento)
- [Conclusiones](#-conclusiones)
- [Agradecimientos](#-agradecimientos)

---

## 📝 Descripción del Proyecto

**Calculadora App** es una aplicación de escritorio desarrollada en Java que implementa una calculadora con interfaz gráfica amigable. Este proyecto fue desarrollado como parte de la asignatura de **Programación Orientada a Objetos (POO)** y permite realizar operaciones matemáticas básicas con validaciones robustas y manejo de errores.

La aplicación cuenta con una interfaz intuitiva que permite al usuario ingresar dos números, seleccionar la operación deseada y visualizar el resultado en tiempo real, todo esto aplicando los principios fundamentales de la Programación Orientada a Objetos.

---

## 👩‍💻 Autora

| Información | Detalles |
|------------|----------|
| **Nombre** | Liseth Nathalia Ayala |
| **Asignatura** | Programación Orientada a Objetos (POO) |
| **Institución** | Universidad UTS |
| **Semestre** | [Insertar semestre] |
| **Año** | 2024 |

---

## 🏛️ Universidad

<div align="center">

### **Universidad UTS** *(Unidades Tecnológicas de Santander)*

**Facultad de Ciencias Naturales e Ingenierías**  
**Tecnología en Desarrollo de Sistemas Informáticos**

</div>

---

## ✨ Características

- ✅ Interfaz gráfica intuitiva desarrollada con Swing
- ✅ Operaciones matemáticas básicas
- ✅ Validación completa de datos de entrada
- ✅ Prevención de errores comunes (división por cero)
- ✅ Manejo de excepciones
- ✅ Diseño responsive con AbsoluteLayout
- ✅ Icono institucional personalizado
- ✅ Botones con efectos visuales

---

## 🎯 Conceptos POO Aplicados

| Concepto | Implementación |
|----------|---------------|
| **Clases** | `FormularioCalculadora` y `Calculadora` |
| **Objetos** | Instancias de la clase `Calculadora` |
| **Encapsulamiento** | Atributos privados con getters y setters |
| **Métodos** | `Sumar()`, `Restar()`, `Multiplicar()`, `Dividir()` |
| **Abstracción** | Separación de la lógica de negocio de la interfaz |
| **Manejo de Excepciones** | Try-catch para errores de formato |

---

## 💻 Tecnologías Utilizadas

| Tecnología | Descripción |
|------------|-------------|
| **Java SE** | Lenguaje de programación principal |
| **Swing** | Biblioteca para interfaz gráfica |
| **NetBeans IDE** | Entorno de desarrollo integrado |
| **AbsoluteLayout** | Gestor de diseño para la interfaz |
| **Git** | Control de versiones |

---

## 📁 Estructura del Proyecto
CalculadoraApp/
│
├── src/
│ ├── calculadoraapp/
│ │ ├── FormularioCalculadora.java
│ │ └── LogoAzul.jpeg
│ │
│ └── utils/
│ └── edu/
│ └── fpoo/
│ └── mundo/
│ └── Calculadora.java
│
├── README.md
└── LICENSE

text

---

## 🔧 Funcionalidades

### ➕ Operaciones Disponibles

1. **Suma** - Suma dos números
2. **Resta** - Resta dos números
3. **Multiplicación** - Multiplica dos números
4. **División** - Divide dos números (con validación)

### 🎮 Controles

- **Botón Sumar**: Realiza la operación de suma
- **Botón Restar**: Realiza la operación de resta
- **Botón Multiplicar**: Realiza la operación de multiplicación
- **Botón Dividir**: Realiza la operación de división
- **Botón Limpiar**: Limpia todos los campos
- **Botón Salir**: Cierra la aplicación

---

## ✅ Validaciones Implementadas

```java
// Validaciones incluidas:
1. Campos vacíos ❌
2. Formato numérico incorrecto ❌
3. División por cero ❌
4. Números decimales ✓
5. Números enteros ✓
🚀 Cómo Ejecutar
Requisitos Previos
JDK 8 o superior

NetBeans IDE (opcional)

Git (opcional)

Pasos de Instalación
Clonar el repositorio

bash
git clone [URL-del-repositorio]
Abrir en NetBeans

File → Open Project

Seleccionar la carpeta del proyecto

Compilar y Ejecutar

Presionar F6 o

Run → Run Project

Ejecución desde terminal
bash
javac calculadoraapp/FormularioCalculadora.java
java calculadoraapp.FormularioCalculadora
📸 Capturas de Pantalla
Interfaz Principal
text
┌─────────────────────────────────────┐
│  Calculadora                        │
├─────────────────────────────────────┤
│  Número 1: [______]                 │
│  Número 2: [______]                 │
│                                     │
│  [Sumar] [Restar]                   │
│  [Multiplicar] [Dividir]            │
│                                     │
│  Resultados:                        │
│  Suma: [______]                     │
│  Resta: [______]                    │
│  Multiplicación: [______]           │
│  División: [______]                  │
│                                     │
│  [Limpiar] [Salir]                  │
└─────────────────────────────────────┘
🧪 Evidencias de Funcionamiento
Casos de Prueba
Caso	Entrada 1	Entrada 2	Operación	Resultado Esperado
1	10	5	Suma	15
2	10	5	Resta	5
3	10	5	Multiplicación	50
4	10	5	División	2
5	10	0	División	Error
6	"a"	5	Cualquiera	Error
📚 Conclusiones
Aprendizaje Significativo: Se logró aplicar los conceptos fundamentales de la Programación Orientada a Objetos en un proyecto práctico.

Separación de Responsabilidades: La aplicación demuestra correctamente la separación entre la interfaz de usuario y la lógica de negocio.

Validación de Datos: Se implementaron validaciones robustas que previenen errores comunes y mejoran la experiencia del usuario.

Manejo de Errores: El sistema maneja adecuadamente las excepciones y proporciona mensajes claros al usuario.

👏 Agradecimientos
Agradecimiento especial a:

Universidad UTS - Por proporcionar los conocimientos fundamentales

Docente de POO - Por la guía y enseñanza

Compañeros de clase - Por el apoyo y retroalimentación

📄 Licencia
Este proyecto está bajo la Licencia MIT - ver el archivo LICENSE para más detalles.

<div align="center">
Desarrollado con ❤️ para la Universidad UTS

Liseth Nathalia Ayala
Programación Orientada a Objetos
*2024*

</div> ```
