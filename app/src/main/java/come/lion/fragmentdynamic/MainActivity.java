package come.lion.fragmentdynamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


	@Override
	protected void onCreate(Bundle savedInstanceState)  {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn_fire =findViewById(R.id.btn_fire);
		Button btn_water =findViewById(R.id.btn_water);

btn_fire.setOnClickListener(this);

		btn_water.setOnClickListener(this);
	}

	@Override
	public void onClick(View v){
		//获取FragmentManager
		FragmentManager manager =getSupportFragmentManager();
//			开启fragment事务
		FragmentTransaction transaction = manager.beginTransaction();

		switch (v.getId()){
			case R.id.btn_fire:
				transaction.replace(R.id.linear, new Throwable());
				break;
			case R.id.btn_water :
				transaction.replace(R.id.linear, new Water());
		break;
		}
		transaction.commit();

}
}
