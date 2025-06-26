# E!Line - Sistema de Gestión de Emergencias

E!Line es un sistema de gestión de emergencias desarrollado como prototipo para mejorar la comunicación entre el personal hospitalario y los servicios de emergencia 911.

## 📋 Descripción del Proyecto

E!Line surge como respuesta a la problemática del sistema de gestión de emergencias actual que no cubre todas las necesidades y dificulta la comunicación entre el personal de hospital y el 911. El sistema cuenta con gran potencial para continuar creciendo e incluso llegar a ser financiado.

Este proyecto fue desarrollado durante 2024 como parte de la materia de Emprendedurismo, enfocándose en crear un prototipo funcional que aborde las necesidades básicas de gestión de personal y registro de guardias.
Este 2025 llevamos el proyecto a codigo de la mano de **Programacion Orientada a Objetos**

## 🚀 Características Principales

- **Gestión de Personal**: Creación y administración de perfiles de personal médico
- **Registro de Guardias**: Sistema para programar y gestionar turnos de trabajo
- **Interfaz Intuitiva**: Desarrollada con JFrame para una experiencia de usuario fluida

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Java
- **Interfaz Gráfica**: JFrame (Swing)
- **Arquitectura**: Patrón MVC (Modelo-Vista-Controlador)
- **Persistencia**: Archivos de texto (.txt)
- **Patrones de Diseño**: Singleton para gestión de base de datos

## 🏗️ Arquitectura del Proyecto

### Patrón MVC
El proyecto implementa el patrón Modelo-Vista-Controlador para separar la lógica de negocio de la presentación:

- **Modelo**: Entidades y lógica de datos
- **Vista**: Interfaz gráfica desarrollada con JFrame
- **Controlador**: `GestorController` que gestiona la comunicación entre modelo y vista

### Gestión de Datos
- **DBManager**: Implementa el patrón Singleton para gestionar la persistencia de datos
- **Persistencia**: Utiliza archivos .txt para almacenar información
- **Acceso Global**: Los datos están disponibles a nivel global del proyecto

### Componentes Principales
- **DBManager**: Clase singleton encargada de la gestión de archivos de base de datos
- **GestorController**: Controlador principal que actúa como puente entre la UI y la base de datos
- **Operaciones CRUD**: Métodos para listar, guardar y eliminar elementos

## 📊 Diagrama de Entidad-Relación

El proyecto cuenta con un diagrama de entidad-relación desarrollado que define la estructura de datos y las relaciones entre las diferentes entidades del sistema.

## 🔧 Instalación y Ejecución

1. Clona el repositorio
2. Asegúrate de tener Java instalado en tu sistema
3. Compila el proyecto usando tu IDE preferido
4. Ejecuta la aplicación desde la clase principal

## 👥 Equipo de Desarrollo

Este proyecto fue desarrollado por:

- **Bobadilla Daiana** - [GitHub](https://github.com/daianayb)
- **Cristaldo Fiorela** - [GitHub](https://github.com/Cristaldo-Fiorela)
- **Skwarek Yanina** - [GitHub](https://github.com/Moratech)

## 📈 Perspectivas Futuras

E!Line tiene un enorme potencial de crecimiento y expansión. El sistema puede evolucionar para incluir:

- Integración con sistemas hospitalarios existentes
- Comunicación en tiempo real con servicios de emergencia
- Análisis de datos y reportes
- Escalabilidad para múltiples instituciones

## 📄 Licencia

Este proyecto fue desarrollado con fines académicos como parte de la materia de Programacion Orientada a Objetos.

---

*Desarrollado con ❤️ por el equipo de E!Line*
