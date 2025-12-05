<table align="center">
    <thead>
        <tr>
            <td><img src="https://1.bp.blogspot.com/-3wALNMake70/XK-07VtIngI/AAAAAAABOrY/n3X_ZJV5fGEpTs8ppMQvKk_yic7BfyBYQCLcBGAs/s1600/universidad-la-salle-logo.jpg?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD LA SALLE</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE SOFTWARE</span><br />
            </th>
        </tr>
    </thead>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo Examen Final</td></tr>
    </tbody>
</table>

<div align="center">
    <span style="font-weight:bold;">GUÍA DEL AVANCE</span><br />
</div>

<div>
    <table border="1" align="center">
        <thead>
            <tr><th colspan="3">INFORMACIÓN BÁSICA</th></tr>
        </thead>
        <tbody>
            <tr>
                <td colspan="2">
                    <table>
                        <tr><td>ASIGNATURA:</td><td>Programción para Dispositivos Moviles</td></tr>
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Examen Final</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>Entrega Final</td>
                            <td>AÑO:</td><td>2025</td>
                            <td>NRO. SEMESTRE:</td><td>VI</td>
                        </tr>
                        <tr>
                            <td colspan="6">DOCENTE:
                                <ul>
                                    <li>Josue Miguel Flores Parra - jfloresp@ulasalle.edu.pe</li>
                                </ul>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6">INTEGRANTE:
                                <ul>
                                    <li>Ortiz Rosas Joshua David</li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                </td>
                <td>
                    </table>
                    <table>
                </td>
            </tr>
        </tbody>
    </table>
</div>

🔗 [Trabajo Examen Final_Avance](https://github.com/Joshua150453/ecociudad/tree/master/app/src/main)

# INFORME TÉCNICO DETALLADO DEL PROYECTO "EcoCiudad"
## 1. Descripción General del Proyecto
EcoCiudad es una aplicación móvil desarrollada en Android cuyo objetivo es ofrecer herramientas básicas para promover la conciencia ambiental mediante:
  - La creación y gestión de reportes relacionados a actividades o incidentes ecológicos.
  
  - La visualización de centros de reciclaje.
  
  - La consulta de consejos ecológicos.

El enfoque del proyecto está orientado a un avance inicial funcional, donde la estructura, navegación y componentes esenciales ya están implementados correctamente, pero algunas funciones están aún en proceso de desarrollo.

## 2. Arquitectura del Proyecto
La aplicación utiliza:

### ✔ Arquitectura basada en Fragmentos
La interfaz está dividida en múltiples fragmentos administrados por un NavHostFragment, lo que permite una navegación fluida entre pantallas:

  - NuevoReporteFragment
  - CentrosReciclajeFragment
  - ConsejosFragment

### ✔ Navigation Component
Gestiona:
  - Transiciones entre pantallas
  - Flechas de retroceso
  - Títulos dinámicos del toolbar

### ✔ ViewBinding
Permite manejo seguro de vistas para evitar errores comunes con findViewById.

### ✔ Material Design Components
Utilizados para botones, inputs, layouts y el AppBar.

## 3. Archivos principales del proyecto
### 3.1 MainActivity.kt
Controla:
  - La configuración del Toolbar como ActionBar personalizado
  - El NavController que administra la navegación entre fragmentos
  - El comportamiento de la flecha de retroceso
  - La apariencia del título y la navegación, donde se corrigió el color del texto y el ícono para evitar que se mostraran en color blanco

Este archivo permite la integración del diseño con la lógica de navegación de la app.

### 3.2 Layouts principales (XML)
#### activity_main.xml
Incluye:
  - El Toolbar que funciona como barra superior personalizada.
  - El NavHostFragment que contiene todos los fragmentos de la aplicación.
  - Ajustes visuales del AppBar para evitar interferencias con el ActionBar predeterminado.

#### fragment_nuevo_reporte.xml
Formulario donde el usuario puede realizar:
- Ingreso de texto (descripción del reporte)
- Almacenamiento de ubicación
- Acciones como “Guardar Reporte” y “Tomar Foto”

Por ahora, estas acciones muestran mensajes informativos, indicando que la lógica final está en proceso.

#### fragment_centros_reciclaje.xml
Pantalla con un mensaje inicial que indica que los datos reales de centros de reciclaje se agregarán más adelante.

#### fragment_consejos.xml
Muestra consejos ecológicos, inicialmente representados con un mensaje básico, a la espera de mayor contenido dinámico.

### 3.3 Fragmentos del Proyecto
#### ✔ NuevoReporteFragment
Responsable del formulario para crear un reporte ecológico.
Actualmente permite:

  - Escribir una descripción
  - Visualizar un mensaje al “Guardar Reporte”
  - Informar que la función “Tomar Foto” está en desarrollo

La lógica de almacenamiento en base de datos aún no se ha implementado.

#### ✔ CentrosReciclajeFragment
Fragmento que por ahora muestra un mensaje placeholder.
Más adelante, deberá integrar:

  - Listado de centros
  - Ubicación en mapa
  - Posible consulta API o base de datos

#### ✔ ConsejosFragment
Actualmente muestra un mensaje simple.
Su fase final incluirá:

  - Lista de consejos
  - Sección dinámica con recomendaciones ecológicas
  - Posible conexión a un repositorio de contenido

## 4. Funcionalidades Implementadas
### ✔ Navegación completa entre pantallas
El usuario puede:

- Crear un reporte
- Ingresar a págna Revisar centros de reciclaje
- Ingresar a págna Ver consejos ecológicos
- Regresar usando la flecha del toolbar

### ✔ Toolbar totalmente funcional
Se corrigieron problemas iniciales como:

  - Iconos y títulos en color blanco e invisibles
  - Conflictos entre el ActionBar del tema y el Toolbar personalizado

Actualmente:

  - El título es visible en color negro
  - La flecha de retroceso es negra
  - Todo el AppBar está bajo control completo del proyecto

### ✔ Mensajes interactivos
Para acciones aún en desarrollo:

  - Guardar reporte
  - Tomar foto
  - Abrir cada sección

Esto permite al usuario entender que ciertas características están “en proceso”.

## 5. Funcionalidades Pendientes (En proceso)
### 🔧 1. Guardado real de reportes
Debe implementarse:

  - Validación de campos
  - Modelo de datos (posiblemente SQLite, Room o archivo local)
  - Almacenamiento persistente

### 🔧 2. Funcionalidad de cámara
“Tomar foto” actualmente muestra un mensaje.
Futuro:

  - Llamada al intent de cámara
  - Guardado de imagen
  - Permisos requeridos

### 🔧 3. Mostrar centros de reciclaje reales
Fase final incluirá:

  - Base de datos local o fuente externa
  - Listados
  - Uso de mapas y geolocalización

### 🔧 4. Sección de consejos ecológicos completa
Debe incluir:

  - Contenido dinámico
  - Posible listado o tarjetas informativas

## 6. Tecnologías y librerías utilizadas
### ✔ Kotlin
Lenguaje principal para la lógica de la aplicación.

### ✔ Android Jetpack
  - Navigation Component
  - Fragment Manager
  - ViewBinding

### ✔ Google Material Components
Para el diseño visual moderno y accesible.

### ✔ AppCompat / Toolbar
Para control personalizado del AppBar.

### ✔ XML
Definición de interfaces, layouts y navegación.

## 7. Resumen General de Nuevas Funcionalidades para la entrega final
Las nuevas incorporaciones del proyecto pueden clasificarse en cuatro componentes principales:

### Mejoras en el nav_graph.xml
- Se añadieron transiciones animadas entre pantallas.
- Se declararon acciones explícitas para cada navegación desde el Home.
- Se agregaron labels descriptivos para cada fragment.
- Se optimizó la estructura del grafo de navegación.

### Creación de dos nuevas pantallas informativas
- CentrosReciclajeFragment
- ConsejosFragment

### Carga inicial de contenido estático
- Lista de centros de reciclaje cercanos.
- Consejos prácticos de ecología y vida sostenible.

### Adaptaciones menores en MainActivity
- Integración del NavController con la Toolbar.
- Gestión del botón de navegación hacia atrás.
- Soporte para títulos dinámicos por fragment.

## 8. Detalle por Componente
### 8.1 Modificaciones de Navegación (nav_graph.xml)
Se actualizó el archivo:
### Ruta:
- app/src/main/res/navigation/nav_graph.xml

Los cambios realizados incluyen:

### a) Definición de acciones desde Home
Ahora el fragmento inicial (HomeFragment) contiene tres acciones:

- action_home_to_reportes → hacia la lista de reportes
- action_home_to_reciclaje → hacia centros de reciclaje
- action_home_to_consejos → hacia consejos ecológicos

Esto permite una navegación clara desde la pantalla principal.

### b) Inclusión de animaciones
Se incluyeron efectos de transición:

- slide → para reportes
- fade → para secciones informativas

Esto mejora la UX y hace la navegación más fluida.

### c) Labels descriptivos
Cada fragmento tiene su android:label, lo que permite:

- Mostrar el título correcto en la Toolbar
- Mejor accesibilidad
. Identificación clara de cada pantalla

### d) Estructura lógica del grafo
El grafo mantiene:

- HomeFragment como destino inicial
- Navegación unidireccional clara
- Fragmentos desacoplados y reutilizables

No se implementó Safe Args aún, ya que no se pasan datos entre pantallas en esta fase.

### 8.2 Nuevas Pantallas
Se incorporaron dos fragmentos nuevos al proyecto:

#### a) CentrosReciclajeFragment
#### Objetivo:
Mostrar información útil sobre centros de reciclaje cercanos, con dirección y tipo de residuos que reciben.

#### Motivación:
El usuario puede integrar la plataforma con acciones reales en su comunidad.
#### Entidad mostrada:
Un listado de centros con:

- Nombre
- Dirección física
- Tipo de materiales reciclables aceptados

Usos posibles futuros:

- Integración con Google Maps
- Filtros por tipo de material
- Carga desde API municipal

#### b) ConsejosFragment
#### Objetivo:
Mostrar consejos prácticos para promover hábitos sostenibles desde casa o el trabajo.

#### Contenido incluido:
- Ahorro de agua
- Clasificación de residuos
- Reducción de plásticos
- Consejos diarios simples

#### Importancia:
Facilita el aprendizaje ecológico de manera accesible.

#### Potenciales evoluciones futuras:
- Consejos dinámicos por día
- Gamificación
- Compartir en redes sociales

#### 8.3 Integración con MainActivity
Las nuevas secciones requieren compatibilidad con el Navigation Component y la Toolbar.

Se actualizaron los siguientes puntos:

#### a) Toolbar como ActionBar
Esto permite usar:

- Títulos dinámicos provenientes de nav_graph.xml
- Icono de regreso automático

#### b) Soporte para navigateUp()
Se sobrescribe el método:

- onSupportNavigateUp()

para permitir que la flecha de regresar siempre:

- Respete el stack del NavController
- Evite cierres inesperados
- Regrese al Home cuando es necesario

#### 8.4 Contenido Inicial
Para ambas pantallas se creó contenido estático para permitir pruebas y validación del flujo.

#### Consejos incluidos (ejemplo)
- Reduce el uso de plásticos desechables.
- Clasifica los residuos en tu hogar.
- Reutiliza envases antes de desecharlos.
- Apaga luces innecesarias.
- Reduce el consumo de agua.

Estos elementos serán cargados mediante una lista básica.

#### Centros incluidos (ejemplo)
- Centro EcoVida – Recibe plástico, vidrio, cartón.
- Recicla Perú – Recibe papel, metales, electrónicos.
- Punto Verde Municipal – Recibe vidrio y baterías.
- EcoRecicla – Recibe botellas plásticas.

También en formato de lista básica.

## 9. Conclusiones
El proyecto EcoCiudad ha sido ampliado exitosamente con nuevas funcionalidades orientadas a educación ecológica y localización de recursos de reciclaje. Las modificaciones realizadas mantienen una arquitectura escalable y flexible, lo cual permite que en futuras iteraciones se integren bases de datos, geolocalización, y contenido dinámico sin romper la estructura actual.

Las nuevas pantallas agregan valor social al proyecto y convierten la aplicación en una herramienta útil para la ciudadanía.
