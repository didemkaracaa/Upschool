
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.R
import androidx.navigation.fragment.findNavController
import com.didemkaraca.ecommerce.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var fragmentLoginBinding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding=DataBindingUtil.inflate(inflater,
            com.didemkaraca.ecommerce.R.layout.fragment_login,container,false)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentLoginBinding.imageView6.setOnClickListener {
            findNavController().navigate(com.didemkaraca.ecommerce.R.id.action_loginFragment2_to_passwordFragment2)
        }

    }
}