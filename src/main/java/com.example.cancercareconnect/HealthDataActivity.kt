import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cancercareconnect.databinding.ActivityHealthDataBinding

class HealthDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHealthDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Implement fetching and displaying health data logic
    }
}
