package gameworld;

import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Meliodas on 20/12/2016.
 */
public class GameWorld
{
    public Rectangle rect = new Rectangle(0, 0, 17, 12);

    public void update(float delta)
    {
        System.out.println(" updating");
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }
}
