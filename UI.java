import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class UI extends Application
{
    TextField InputField;
    TextField OutputField;
    public void start(Stage window)
    {
        window.show();
        window.setTitle("PostFix Calc");
        
        Pane canvas = new Pane();
        Scene myScene = new Scene(canvas, 300, 300);
        window.setScene(myScene);
        
        Label InputLabel = new Label("Input");
        Label OutputLabel = new Label("Output");
        canvas.getChildren().add(InputLabel);
        canvas.getChildren().add(OutputLabel);
        InputLabel.relocate(20,40);
        OutputLabel.relocate(20,78);
        
        InputField = new TextField();
        OutputField = new TextField();
        canvas.getChildren().add(InputField);
        canvas.getChildren().add(OutputField);
        InputField.relocate(80,38);
        OutputField.relocate(80,78);
        
        Button evaluateButton = new Button("Evaluate");
        Button clearButton = new Button("Clear");
        canvas.getChildren().add(evaluateButton);
        canvas.getChildren().add(clearButton);
        evaluateButton.relocate(120, 240);
        clearButton.relocate(195, 240);
        
        Button zeroButton = new Button("0");
        Button oneButton = new Button("1");
        Button twoButton = new Button("2");
        Button threeButton = new Button("3");
        Button fourButton = new Button("4");
        Button fiveButton = new Button("5");
        Button sixButton = new Button("6");
        Button sevenButton = new Button("7");
        Button eightButton = new Button("8");
        Button nineButton = new Button("9");
        Button sinButton = new Button("sin");
        Button cosButton = new Button("cos");
        Button tanButton = new Button("tan");
        Button addButton = new Button("+");
        Button subButton = new Button("-");
        Button multButton = new Button("*");
        Button divButton = new Button("/");
        Button powButton = new Button("^");
        Button sqrtButton = new Button("sqrt");
        Button swapButton = new Button("swap");
        Button dupButton = new Button("dup");
        Button rotButton = new Button("rot");
        Button spcButton = new Button("spc");
        Button ansButton = new Button("ans");
        Button smootButton = new Button("smoot");
        Button modButton = new Button("mod");
        
        canvas.getChildren().add(zeroButton);
        canvas.getChildren().add(oneButton);
        canvas.getChildren().add(twoButton);
        canvas.getChildren().add(threeButton);
        canvas.getChildren().add(fourButton);
        canvas.getChildren().add(fiveButton);
        canvas.getChildren().add(sixButton);
        canvas.getChildren().add(sevenButton);
        canvas.getChildren().add(eightButton);
        canvas.getChildren().add(nineButton);
        canvas.getChildren().add(sinButton);
        canvas.getChildren().add(cosButton);
        canvas.getChildren().add(tanButton);
        canvas.getChildren().add(addButton);
        canvas.getChildren().add(subButton);
        canvas.getChildren().add(multButton);
        canvas.getChildren().add(divButton);
        canvas.getChildren().add(powButton);
        canvas.getChildren().add(sqrtButton);
        canvas.getChildren().add(swapButton);
        canvas.getChildren().add(dupButton);
        canvas.getChildren().add(rotButton);
        canvas.getChildren().add(spcButton);
        canvas.getChildren().add(ansButton);
        canvas.getChildren().add(smootButton);
        canvas.getChildren().add(modButton);
        
        zeroButton.relocate(90,240);
        oneButton.relocate(90,210);
        twoButton.relocate(120,210);
        threeButton.relocate(150,210);
        fourButton.relocate(90,180);
        fiveButton.relocate(120,180);
        sixButton.relocate(150,180);
        sevenButton.relocate(90,150);
        eightButton.relocate(120,150);
        nineButton.relocate(150,150);
        sinButton.relocate(195,150);
        cosButton.relocate(195,180);
        tanButton.relocate(195,210);
        addButton.relocate(50,150);
        subButton.relocate(50,180);
        multButton.relocate(50,210);
        divButton.relocate(50,240);
        powButton.relocate(50,120);
        sqrtButton.relocate(80,120);
        swapButton.relocate(120,120);
        dupButton.relocate(165,120);
        rotButton.relocate(205,120);
        spcButton.relocate(235,210);
        ansButton.relocate(235,180);
        smootButton.relocate(235,150);
        modButton.relocate(240,120);
        
        oneButton.setOnAction(this::handleOneButton);
        zeroButton.setOnAction(this::handleZeroButton);
        twoButton.setOnAction(this::handleTwoButton);
        threeButton.setOnAction(this::handleThreeButton);
        fourButton.setOnAction(this::handleFourButton);
        fiveButton.setOnAction(this::handleFiveButton);
        sixButton.setOnAction(this::handleSixButton);
        sevenButton.setOnAction(this::handleSevenButton);
        eightButton.setOnAction(this::handleEightButton);
        nineButton.setOnAction(this::handleNineButton);
        addButton.setOnAction(this::handleAddButton);
        subButton.setOnAction(this::handleSubButton);
        multButton.setOnAction(this::handleMultButton);
        divButton.setOnAction(this::handleDivButton);
        powButton.setOnAction(this::handlePowButton);
        sqrtButton.setOnAction(this::handleSqrtButton);
        dupButton.setOnAction(this::handleDupButton);
        swapButton.setOnAction(this::handleSwapButton);
        rotButton.setOnAction(this::handleRotButton);
        sinButton.setOnAction(this::handleSinButton);
        cosButton.setOnAction(this::handleCosButton);
        tanButton.setOnAction(this::handleTanButton);
        clearButton.setOnAction(this::handleClearButton);
        spcButton.setOnAction(this::handleSpcButton);
        evaluateButton.setOnAction(this::handleEvalButton);
        ansButton.setOnAction(this::handleAnsButton);
        smootButton.setOnAction(this::handleSmootButton);
        modButton.setOnAction(this::handleModButton);
    }
    
    public void handleOneButton(ActionEvent ae)
    {
      int oneButton = 1;
      InputField.setText(InputField.getText() + oneButton);
    }
    
    public void handleZeroButton(ActionEvent ae)
    {
       int zeroButton = 0;
       InputField.setText(InputField.getText() + zeroButton);
    }
    
     public void handleTwoButton(ActionEvent ae)
    {
       int twoButton = 2;
       InputField.setText(InputField.getText() + twoButton);
    }
    
    public void handleThreeButton(ActionEvent ae)
    {
        int threeButton = 3;
        InputField.setText(InputField.getText() + threeButton);
    }
    
    public void handleFourButton(ActionEvent ae)
    {
      int fourButton = 4;
      InputField.setText(InputField.getText() + fourButton);
    }
    
    public void handleFiveButton(ActionEvent ae)
    {
        int fiveButton = 5;
        InputField.setText(InputField.getText() + fiveButton);
    }
    
    public void handleSixButton(ActionEvent ae)
    {
       int sixButton = 6;
       InputField.setText(InputField.getText() + sixButton);
    }
    
    public void handleSevenButton(ActionEvent ae)
    {
       int sevenButton = 7;
       InputField.setText(InputField.getText() + sevenButton);
    }
    
    public void handleEightButton(ActionEvent ae)
    {
       int eightButton = 8;
       InputField.setText(InputField.getText() + eightButton);
    }
    
    public void handleNineButton(ActionEvent ae)
    {
       int nineButton = 9;
       InputField.setText(InputField.getText() + nineButton);
    }
    
    public void handleAddButton(ActionEvent ae)
    {
      String addButton = "+";
      
      String text = InputField.getText();
      
      InputField.setText(text + addButton);
    }
    
    public void handleSubButton(ActionEvent ae)
    {
        String subButton = "-";
        
        String text = InputField.getText();
        
        InputField.setText(text + subButton);
    }
    
    public void handleMultButton(ActionEvent ae)
    {
      String multButton = "*";
      
      String text = InputField.getText();
      
      InputField.setText(text + multButton);
    }
    
    public void handleDivButton(ActionEvent ae)
    {
       String divButton = "/";
       
       String text = InputField.getText();
       
       InputField.setText(text + divButton);
    }
    
    public void handlePowButton(ActionEvent ae)
    {
       String powButton = "^";
       
       String text = InputField.getText();
       
       InputField.setText(text + powButton);
    }
    
    public void handleSqrtButton(ActionEvent ae)
    {
        String sqrtButton = "sqrt";
        
        String text = InputField.getText();
        
        InputField.setText(text + sqrtButton);
    }
    
    public void handleDupButton(ActionEvent ae)
    {
      String dupButton = "dup";
      
      String text = InputField.getText();
      
      InputField.setText(text + dupButton);
    }
    
    public void handleSwapButton(ActionEvent ae)
    {
      String swapButton = "swap";
      
      String text = InputField.getText();
      
      InputField.setText(text + swapButton);
    }
    
    public void handleRotButton(ActionEvent ae)
    {
       String rotButton = "rot";
       
       String text = InputField.getText();
       
       InputField.setText(text + rotButton);
    }
    
    public void handleSinButton(ActionEvent ae)
    {
        String sinButton = "sin";
        
        String text = InputField.getText();
        
        InputField.setText(text + sinButton);
    }
    
    public void handleCosButton(ActionEvent ae)
    {
        String cosButton = "cos";
        
        String text = InputField.getText();
        
        InputField.setText(text + cosButton);
    }
    
    public void handleTanButton(ActionEvent ae)
    {
       String tanButton = "tan";
       
       String text = InputField.getText();
       
       InputField.setText(text + tanButton);
    }
    
    public void handleSpcButton(ActionEvent ae)
    {
       String spcButton = " ";
       
       String text = InputField.getText();
       
       InputField.setText(text + spcButton);
    }
    
    public void handleAnsButton(ActionEvent ae)
    {
        String ex = OutputField.getText();
        InputField.setText("" + ex);
    }
    
    public void handleSmootButton(ActionEvent ae)
    {
        String smootButton = "smoot";
        
        String text = InputField.getText();
        
        InputField.setText(text + smootButton);
    }
    
    public void handleModButton(ActionEvent ae)
    {
        String modButton = "mod";
        
        String text = InputField.getText();
        
        InputField.setText(text + modButton);
    }
    
    public void handleClearButton(ActionEvent ae)
    {
        InputField.setText("");
        OutputField.setText("");
    }
    
    public void handleEvalButton(ActionEvent ae)
    {
        String text = InputField.getText();
        
        Postfix e = new Postfix(text);
        
        double ex = e.eval();
        
        OutputField.setText("" + ex);
    }
}

