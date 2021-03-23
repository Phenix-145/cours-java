package fr.pgah.libgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class souris {
    public void render() {        
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            sprite.setPosition(Gdx.input.getX() - sprite.getWidth()/2,
                    Gdx.graphics.getHeight() - Gdx.input.getY() - sprite.getHeight()/2);
        }
        if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT)){
            sprite.setPosition(Gdx.graphics.getWidth()/2 -sprite.getWidth()/2, 
                    Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);
        }
        batch.begin();
        sprite.draw(batch);
        batch.end();
    }
}
