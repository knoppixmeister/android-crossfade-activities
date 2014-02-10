package lv.bizapps.crossfadeactivityproba;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	protected View contentView;
	protected View loadingView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		contentView = findViewById(R.id.content);
		loadingView = findViewById(R.id.loading_spinner);

		contentView.setVisibility(View.GONE);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == R.id.action_settings) {
			if(loadingView.getVisibility() == View.GONE) {
				contentView.setVisibility(View.GONE);
				loadingView.setVisibility(View.VISIBLE);
			}
			else {
				loadingView.setVisibility(View.GONE);
				contentView.setVisibility(View.VISIBLE);
			}
		}

		return super.onOptionsItemSelected(item);
	}
}
