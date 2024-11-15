package HelloWorld;
import java.math.BigDecimal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.converter.PercentageStringConverter;

public class Controller {

    @FXML
    private Button  button;

    @FXML
    private Rectangle square;

    @FXML
    private Circle circle;

    @FXML 
    private ProgressBar bar;

    @FXML
    private Label percentage;

    //BigDecimal is a class that gives its user complete control over rounding behavior
    BigDecimal progress = new BigDecimal(String.format("%.1f", 0.0));

    public void initialize() {
        bar.setStyle("-fx-accent: cyan;");
    }

    public void onButtonClick() {
        //If the player clicked a button then the hello would change to you clicked a button
        /*
        label.setText("You Clicked a button");
        label.setLayoutX(label.getLayoutX() - 34);
        */
        //Setting a visible square using a button
        //square.setVisible(!square.isVisible());

        //Setting a visible circle using a button
        //circle.setVisible(!circle.isVisible());

         //0.1 = 10%
            if(progress.doubleValue() < 1) {
                progress = new BigDecimal(String.format("%.1f", progress.doubleValue() + 0.1));
                bar.setProgress(progress.doubleValue());
                percentage.setText(Double.toString(Math.round(progress.doubleValue() * 100)) + "%");
            }
            

        
        /* 
        if(progress == 10) {
            progress -= 0.1;
            bar.setProgress(progress);
        }
        */
         

        //TicTacToe

       
        
    }
}