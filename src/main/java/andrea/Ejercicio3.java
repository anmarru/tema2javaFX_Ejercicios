package andrea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ejercicio3 extends Application{

    private static Scene scene;
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        GridPane gridPane = new GridPane();


      Label l1usuario=  new Label("Usuario");
        Label l2contraseña=new Label("Contraseña");
       TextField tfusuario= new TextField();
       TextField tfcontraseña= new TextField();
       
        Button btrestablecer=new Button("Restablecer");
        btrestablecer.setOnAction(event-> {
            tfusuario.clear();
            tfcontraseña.clear();
        });

       Button btiniciarsesion=new Button("Iniciar sesión");
        
       gridPane.add(l1usuario, 0, 0);
       gridPane.add(tfusuario, 1, 0);
       gridPane.add(l2contraseña, 0, 1);
       gridPane.add(tfcontraseña, 1, 1);
       gridPane.add(btrestablecer, 0, 2);
       gridPane.add(btiniciarsesion, 1, 2);
        
        Scene scene = new Scene(gridPane, 500, 500);
        // Configuración del Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login en JavaFX");
        primaryStage.show();


    }
    
    public static void main(String[] args) {
        launch();
    }

}
