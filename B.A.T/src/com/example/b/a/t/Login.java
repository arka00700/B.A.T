package com.example.b.a.t;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Login extends Activity {
	
	private Button btlogin,btregistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       
        //IDENTIFICACIÓN
        btlogin = (Button) findViewById(R.id.login);
        btregistro= (Button) findViewById(R.id.registrarse);
        //LISTENERS
        btlogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				lanzarMainActivity();
				
			}
		});
        btregistro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				lanzarRegistro();
				
			}
		}); 
        
    }
    private void lanzarMainActivity(){
    	Intent i = new Intent (this, MainActivity.class);
    	startActivity(i);
    	}

    private void lanzarRegistro(){
    	Intent i = new Intent (this, Registro.class);
    	startActivity(i);
    	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.registro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
