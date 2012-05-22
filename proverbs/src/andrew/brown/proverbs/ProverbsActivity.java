package andrew.brown.proverbs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProverbsActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void generateProverb(View view) {
		TextView text = (TextView) findViewById(R.id.textView1);
		Button button = (Button) findViewById(R.id.button1);
		int num = (int) (Math.random() * 10 + 1);

		switch (num) {
		case 1:
			text.setText(R.string.proverb1);
			break;
		case 2:
			text.setText(R.string.proverb2);
			break;
		case 3:
			text.setText(R.string.proverb3);
			break;
		case 4:
			text.setText(R.string.proverb4);
			break;
		case 5:
			text.setText(R.string.proverb5);
			break;
		case 6:
			text.setText(R.string.proverb6);
			break;
		case 7:
			text.setText(R.string.proverb7);
			break;
		case 8:
			text.setText(R.string.proverb8);
			break;
		case 9:
			text.setText(R.string.proverb9);
			break;
		case 10:
			text.setText(R.string.proverb10);
			break;
		}
		button.setText(R.string.button_clicked);
	}
}
