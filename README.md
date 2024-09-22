# Taller1
 
link al repositorio: https://github.com/siraglez/Taller1.git

Este proyecto es una aplicación básica de Android que permite a los usuarios ingresar su nombre, navegar entre pantallas y seleccionar un color de fondo personalizado para la interfaz de configuración.

## Descripción de las pantallas:

### 1. **MainActivity**
La pantalla principal de la aplicación muestra un saludo personalizado basado en la hora del día (Buenos días, Buenas tardes o Buenas noches) y un botón que permite navegar a la pantalla de la actividad donde se ingresa el nombre del usuario.

- **Funcionalidades:**
 - *Saludo dinámico:* El mensaje cambia según la hora actual usando el método `calcularSaludo()`.
 - *Botón de navegación:* Llama al método `navigateToMainActivity()` que inicia `ActividadPrincipal`.

### 2. **ActividadPrincipal**
En esta pantalla, el usuario puede ingresar su nombre en un campo de texto. Una vez guardado, el nombre se muestra en la pantalla. El campo de texto se vacía automáticamente después de guardar, permitiendo al usuario ingresar otro nombre si lo desea.

- **Funcionalidades:**
 - *Guardar el nombre:* El nombre ingresado se guarda en `SharedPreferences` mediante el método `guardarNombre()`.
 - *Mostrar el nombre guardado:* Después de que el usuario guarda un nombre, este se muestra en la pantalla.
 - *Campo de texto vaciable:* Después de hacer clic en "Guardar Nombre", el campo de texto se vacía automáticamente.
 - *Navegación a la pantalla de configuración:* Incluye un botón que permite navegar a la pantalla de configuración usando el método `navigateToConfig()`.

### 3. **PantallaConfiguracion**
Esta pantalla permite al usuario seleccionar un color de fondo para la aplicación. El color se guarda en `SharedPreferences`, y el fondo de pantalla se actualiza dinámicamente.

- **Funcionalidades:**
 - *Selección de color:* El usuario puede elegir entre los colores Rojo, Azul, Verde y un color predeterminado (Gris).
 - *Guardar selección:* El color seleccionado se almacena en `SharedPreferences` mediante el método `guardarColor()`, para que se conserve incluso después de cerrar la aplicación.
 - *Navegación:* Incluye un botón para volver a la pantalla principal (`MainActivity`).

## Funcionalidades Clave:

1. **Saludo dinámico:** El saludo cambia de acuerdo a la hora del día.
 - El método `calcularSaludo()` determina la hora actual y devuelve un saludo apropiado.

2. **Almacenamiento de datos:**
 - Se utiliza `SharedPreferences` para guardar tanto el nombre ingresado por el usuario como el color de fondo seleccionado.

3. **Navegación entre pantallas:**
 - La aplicación permite la navegación entre la pantalla principal (`MainActivity`), la pantalla de la actividad principal donde se ingresa el nombre (`ActividadPrincipal`), y la pantalla de configuración (`PantallaConfiguracion`).

## Componentes y Tecnologías:

- **Jetpack Compose:** El diseño de la interfaz de usuario se construye utilizando el toolkit de Android.
- **SharedPreferences:** Utilizado para almacenar de manera persistente el nombre ingresado y el color de fondo seleccionado.
- **Intents:** Para la navegación entre las actividades.
