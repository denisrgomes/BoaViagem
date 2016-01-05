package boaviagem.denis.rainer.br.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends Activity{

    private EditText user;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.user = (EditText) findViewById(R.id.user);
        this.password = (EditText) findViewById(R.id.password);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void LoginOnClick(View view) {
        String userInformed = this.user.getText().toString();
        String passwordInformed = this.password.getText().toString();

        if(userInformed.equals("denis") && passwordInformed.equals("123")){
            startActivity(new Intent(this, DashBoardActivity.class));
        }else{
            String errorMessage = getString(R.string.error_authentication);
            Toast toast = Toast.makeText(this,errorMessage,Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
