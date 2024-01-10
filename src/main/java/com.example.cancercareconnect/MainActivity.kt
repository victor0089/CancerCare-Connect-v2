import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cancercareconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, AuthActivity::class.java))
        }

        binding.btnHealthData.setOnClickListener {
            startActivity(Intent(this, HealthDataActivity::class.java))
        }

        binding.btnWebSocket.setOnClickListener {
            startActivity(Intent(this, WebSocketActivity::class.java))
        }
    }
}
