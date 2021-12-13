package animation;

import javafx.scene.image.ImageView;
import logic.Entity;
import main.Main;
public interface ImageViewable {
	// for Classify
	public abstract void createFirstSprite();
	public abstract void upDateSprite();
	public abstract void upDateImageView();
	/*
	    Main.removeFromPane(imageView);
		imageView.relocate(getX(), getY());
		Main.addToPane(imageView);
	 */
}
