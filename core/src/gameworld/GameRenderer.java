package gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Meliodas on 20/12/2016.
 */
public class GameRenderer
{
    public GameWorld myWorld;
    public OrthographicCamera cam;
    public ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld gw)
    {
        myWorld = gw;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }
    public void render()
    {
        System.out.println("in render");

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(myWorld.rect.x, myWorld.rect.y, myWorld.rect.width, myWorld.rect.height);
        shapeRenderer.end();

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(myWorld.rect.x, myWorld.rect.y, myWorld.rect.width, myWorld.rect.height);
        shapeRenderer.end();
    }
}
