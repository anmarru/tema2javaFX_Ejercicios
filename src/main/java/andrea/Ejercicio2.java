package andrea;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio2 extends Application{

    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        IntegerProperty contador= new SimpleIntegerProperty(0);

        Label label= new Label();
        label.textProperty().bind(Bindings.concat(" Contador: ", contador.asString()));//muestra valor de contador

        //lista que muestra los valores del contador
        ObservableList<String> contadorList= FXCollections.observableArrayList();
        //muestro la lista
        ListView<String> listView= new ListView<>(contadorList);

        //boton para añadir a la lista
        Button botonIncremetar= new Button("+");
        botonIncremetar.setOnAction(e->{
            //incrementa contador
            contador.set(contador.get()+1);
            //añade a la lista
            contadorList.add("Elemento "+contador.get());
        });

        Button botonDecrementar= new Button("-");
        botonDecrementar.setOnAction(e->{
            if(!contadorList.isEmpty()){
                //elimino ultimo elemento
                contadorList.remove(contadorList.size()-1);
                contador.set(contador.get()-1); 
            } 
        });


        VBox root= new VBox(10,label,listView ,botonIncremetar, botonDecrementar);
        Scene scene= new Scene(root,200,200);

         // Configuración del Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejemplo de ListView y contador ");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
