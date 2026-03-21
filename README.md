# JavaFX Sandbox

Proyecto Maven simple para ejecutar pequeñas aplicaciones JavaFX de prueba,
ejemplos y ejercicios en un entorno aislado y reproducible.

El proyecto permite mantener varias mini-apps JavaFX dentro de una misma base
y ejecutar cualquiera de ellas indicando su clase principal mediante
`-Drun.main=...`, sin modificar el `pom.xml` en cada cambio.

## Características

- Un solo proyecto Maven para múltiples mini-apps JavaFX
- Ejecución parametrizable mediante `-Drun.main=...`
- Uso de Maven Wrapper (`mvnw`) para evitar depender de Maven global
- Estructura simple basada en classpath, sin `module-info.java`

## Requisitos

- JDK 21
- Sistema con soporte gráfico para ejecutar JavaFX
- Maven Wrapper generado en el proyecto

## Estructura típica

```text
src/main/java/com/sandbox/
    app/
        App.java
    demo2/
        SecondApp.java
```

## Crear una nueva app

1. Crear un paquete bajo `src/main/java/com/sandbox/`
2. Crear una clase que extienda `javafx.application.Application`
3. Implementar el método `start(Stage stage)`
4. Ejecutarla indicando su clase principal con `-Drun.main=...`

## Ejecutar una app

Ejecutar la app por defecto definida en el `pom.xml`:

```bash
./mvnw clean javafx:run
```

Ejecutar una app específica:

```bash
./mvnw clean javafx:run -Drun.main=com.sandbox.demo2.SecondApp
```

## Notas importantes

* Los nombres de paquete deben estar en minúsculas
* El valor de `run.main` debe coincidir exactamente con el nombre completo de la clase
* Maven compila automáticamente todos los archivos bajo `src/main/java`
* Una app puede usar múltiples clases auxiliares sin problema
* Este proyecto usa classpath simple y no requiere `module-info.java`

## Ejemplo mínimo

```java
package com.sandbox.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Hola JavaFX");
        StackPane root = new StackPane(button);

        Scene scene = new Scene(root, 320, 200);
        stage.setTitle("App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```

## Flujo rápido de trabajo

1. Crear paquete para la nueva app
2. Crear clase que extienda `Application`
3. Implementar `start(Stage stage)`
4. Ejecutar con:

```bash
./mvnw javafx:run -Drun.main=paquete.Clase
```

---
