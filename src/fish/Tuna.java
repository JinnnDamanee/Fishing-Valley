package fish;

import javafx.scene.image.ImageView;
import logic.GameLogic;

public class Tuna extends Fish {
	public int kokdafaff;
	public Tuna() {
		super();
		fishType = FishType.TUNA;
		this.price = 200;
		this.name = "Tuna";
		this.setSpeed(2);
		// ADD BELOW
	}

	@Override
	public ImageView imageViewFish() {
		if(isRight) {
			return new ImageView(GameLogic.getInstance().tuna_Right);
		} else {
			return new ImageView(GameLogic.getInstance().tuna_Left);
		}
	}
	@Override
	protected boolean isNeedToRotate() {
		return true;
	}
	
}