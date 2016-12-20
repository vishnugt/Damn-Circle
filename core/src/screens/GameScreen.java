package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import gameworld.GameRenderer;
import gameworld.GameWorld;

/**
 * Created by Meliodas on 20/12/2016.
 */
public class GameScreen implements Screen {


    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen()
    {
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void render(float delta)
    {
        world.update(delta);
        renderer.render();

    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }

}
