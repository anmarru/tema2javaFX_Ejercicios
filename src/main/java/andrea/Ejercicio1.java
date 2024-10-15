package andrea;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Ejercicio1 extends Application {

    private static Scene scene;

    @Override
    public void start(Stage  primaryStage) throws IOException {
        /*
         * scene = new Scene(loadFXML("primary"), 640, 480);
         * stage.setScene(scene);
         * stage.show();
         */
        // Propiedad de contador
        IntegerProperty contador = new SimpleIntegerProperty(0);
        // Etiqueta que muestra el valor del contador
        Label label = new Label();
        Label label2 = new Label();

        label.textProperty().bind(Bindings.concat("Contador: ", contador.asString()));
        // Botón para incrementar el contador
        Button boton = new Button("Incrementar");
        boton.setOnAction(e -> contador.set(contador.get() + 1));

       

        //CREO EL TEXTFIELD
        TextField textField=new TextField();
        textField.textProperty();

        //AÑADO EL NUEVO BOTON
         Button boton2=new Button("X");
         boton2.setOnAction(e-> label2.setText(String.valueOf(Double.valueOf(textField.getText()) * contador.intValue())));

        // Layout
        VBox root = new VBox(10, label, boton, boton2, label2, textField);
        Scene scene = new Scene(root, 200, 200);
        // Configuración del Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejemplo de Properties y Bindings");
        primaryStage.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejercicio1.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}