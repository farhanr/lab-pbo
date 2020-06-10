import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Select First File");
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setWrapText(true);

        btn.setOnAction(actionEvent -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extensionFilter);
            
            File selectedfile = fileChooser.showOpenDialog(primaryStage);
            String text = "";
            
            try {
                FileReader file = new FileReader(selectedfile.getPath());
                BufferedReader reader = new BufferedReader(file);
                
                while (reader.ready()) {
                    String str = reader.readLine();
                    text += str + "\n";
                }
            } catch (IOException io) {
                io.printStackTrace();
            }

            if (selectedfile != null) {
                textArea.setText(text);
            }
        });

        BorderPane root = new BorderPane();
        BorderPane.setAlignment(btn, Pos.CENTER);
        BorderPane.setMargin(btn, new Insets(10));
        root.setTop(btn);
        root.setCenter(textArea);
        root.setPadding(new Insets(10));

        primaryStage.setTitle("File Reader to TXT");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }
    
}