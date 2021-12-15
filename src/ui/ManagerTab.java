package ui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import logic.ShopSystem;
import main.Main;

public class ManagerTab extends HBox {
	private Text moneyText;
	private Button buyBtn;

	public ManagerTab() {
		this.setAlignment(Pos.CENTER_RIGHT);
		this.setPrefWidth(800);
		this.setPrefHeight(50);
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(5))));
		this.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, null, null)));
		
		Text space = new Text("   ");
		
		initMoneyText();
		initBuyBtn();
		
		this.getChildren().addAll(moneyText, buyBtn, space);
	}

	private void initMoneyText() {
		Text moneyText = new Text("Fish Catched: " + "Money: " + ShopSystem.getMoney() + "       ");
		// will be changing to sum of fish price soon
		moneyText.setFont(Font.font("Comic Sans Ms", FontWeight.LIGHT, FontPosture.REGULAR, 18));
		moneyText.setFill(Color.LIGHTGOLDENRODYELLOW);
		setMoneyText(moneyText);
		
	}
	
	private void initBuyBtn() {
		Button buyBtn = new Button("Buy");
		buyBtn.setFont(new Font(15));
		buyBtn.setPrefWidth(70);
		buyBtn.setPrefHeight(30);
		buyBtn.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
		buyBtn.setBorder(new Border(new BorderStroke(Color.AZURE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));
		setBuyBtn(buyBtn);
		buyBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				Main.getBuyTab().setVisible(true);
				Main.getGameScreen().requestFocus();
			}
		});
	}


	private void setMoneyText(Text moneyText) {
		this.moneyText = moneyText;
		
	}
	
	private void setBuyBtn(Button buyBtn) {
		this.buyBtn = buyBtn;
		
	}
}
