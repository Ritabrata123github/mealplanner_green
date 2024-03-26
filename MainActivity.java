import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript if the page requires it
        webSettings.setLoadWithOverviewMode(true); // Load the entire webpage in overview mode
        webSettings.setUseWideViewPort(true); // Enable support for the viewport meta tag

        webView.loadUrl("https://abanusara99.github.io/mealplanner_green.github.io/meal_diet.html");
    }
}
