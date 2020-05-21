package id.scene;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Lat3 extends Application {
    TextArea textArea;
    Button selectBtn;
    String text;
    VBox vbox;
    Scene scene;
    FileChooser textChooser;
    FileChooser.ExtensionFilter textChooserFilter;
    File selectedFile;
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Read Text File");

        textArea = new TextArea();
        textArea.setEditable(false);

        selectBtn = new Button("Select File");
        selectBtn.setOnAction(a -> {
            try {
                text = chooseAndRead();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            textArea.setText(text);
        });

        vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(selectBtn, textArea);

        scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public String chooseAndRead() throws FileNotFoundException {
        textChooser = new FileChooser();
        textChooserFilter = new FileChooser.ExtensionFilter("TXT Files", "*.txt");
        textChooser.setTitle("Open Text File");
        selectedFile = textChooser.showOpenDialog(stage = new Stage());

        Scanner sc = new Scanner(selectedFile);
        String text2 = "";

        while (sc.hasNextLine()) {
            text2 += sc.hasNextLine() + "\n";
        }
        sc.close();
        return text2;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}