package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.StrokeLineCap;

public class Controller {
    double opr1 = 0;
    double opr2 = 0;
    boolean first_opr = true;

    @FXML
    private Button btnNum1;
    @FXML
    private Button btnNum2;
    @FXML
    private Button btnNum3;
    @FXML
    private Button btnNum4;
    @FXML
    private Button btnNum5;
    @FXML
    private Button btnNum6;
    @FXML
    private Button btnNum7;
    @FXML
    private Button btnNum8;
    @FXML
    private Button btnNum9;
    @FXML
    private Button btnNum0;
    @FXML
    private Button btnNum00;
    @FXML
    private Button btnPoint;
    @FXML
    private Button btnSum;
    @FXML
    private Button btnDif;
    @FXML
    private Button btnMul;
    @FXML
    private Button btnDiv;

    @FXML
    private TextField tfRes;

    @FXML
    public void NumClick1() {
        String str = tfRes.getText();
        str += btnNum1.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick2() {
        String str = tfRes.getText();
        str += btnNum2.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick3() {
        String str = tfRes.getText();
        str += btnNum3.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick4() {
        String str = tfRes.getText();
        str += btnNum4.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick5() {
        String str = tfRes.getText();
        str += btnNum5.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick6() {
        String str = tfRes.getText();
        str += btnNum6.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick7() {
        String str = tfRes.getText();
        str += btnNum7.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick8() {
        String str = tfRes.getText();
        str += btnNum8.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick9() {
        String str = tfRes.getText();
        str += btnNum9.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick() {
    }

    @FXML
    public void NumClick0() {
        String str = tfRes.getText();
        str += btnNum0.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick00() {
        String str = tfRes.getText();
        str += btnNum00.getText();
        tfRes.setText(str);
    }

    @FXML
    public void ClickPoint() {
        String str = tfRes.getText();

        if (str.contains("."))
            return;

        str += btnPoint.getText();

        if (str.length() == 1)
            str = "0" + str;
        tfRes.setText(str);
    }

    @FXML
    public void ClickSum() {
        if (first_opr) {
            opr1 = Double.parseDouble(tfRes.getText());
            tfRes.setText("");
        } else {
            opr2 = Double.parseDouble(tfRes.getText());
            tfRes.setText(""+(opr1+opr2));
        }

        first_opr = !first_opr;
    }
}
