package com.example.welcome;
import java.util.Scanner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends Activity {
public TextView tv01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv01=(TextView)findViewById(R.id.textView1);
        tv01.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MainActivity.this,MainActivity2.class);
				startActivity(intent);
			}
		});
    }
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String username ;
			do{
				System.out.println("«Î ‰»Î’À∫≈:");
				String name =input.next();
				System.out.println("«Î ‰»Î’À∫≈√‹¬Î:");
				String pw1 = input.next();
				if(name.equals("zzp")&&pw1.equals("123"))
				System.out.println("πßœ≤"+name+"µ«¬º≥…π¶!");
				else
			    System.out.println("±ß«∏£°"+name+"µ«¬º ß∞‹");
			}while(true);    		
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
