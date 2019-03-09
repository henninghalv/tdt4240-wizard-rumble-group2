package com.progark.group2.wizardrumble;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.progark.group2.wizardrumble.entities.Spell;
import com.progark.group2.wizardrumble.network.NetworkController;

import java.io.IOException;
import java.util.List;

public class Application extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;

	private NetworkController nc;
	private int height;
	private int width;
	private List<Spell> spellList;

	/*
	public void update(){

	}

	* */
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		// Used to test server connection.
		// Not necessarily the right way to do it.
		nc = new NetworkController();

		try {
			nc.init();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// =====
	}



	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
