package com.chelo.mentoringperficientlinkv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chelo.mentoringperficientlinkv1.databinding.ActivityMainBinding
import com.chelo.mentoringperficientlinkv1.model.ItemList
import com.chelo.mentoringperficientlinkv1.view.PerficientLinkViewAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // view binding for the activity
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    // Hilt
    @Inject
    lateinit var recyclerViewAdapter: PerficientLinkViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // view binding for the activity
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val rvadapter = PerficientLinkViewAdapter(this, getDataSourceForViewAdapter())
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recyclerViewAdapter
        }
    }

    object DataSourceForViewAdapter {
        fun getDataSourceForViewAdapter(): ArrayList<ItemList> {
            val dataList = ArrayList<ItemList>()
            dataList.add(ItemList(ItemList.Layout_Two_Employee, R.drawable.cake48, "Juan Targarna", "Muy Feliz Cumpleaños Juan"))
            dataList.add(ItemList(ItemList.Layout_One_Kudos, R.drawable.congrats,  "Kudos de Disney", "Pedro, has hecho un gran trabajo"))
            dataList.add(ItemList(ItemList.Layout_Two_Employee, R.drawable.cake48, "Romina Romaniuk", "Muy Feliz Cumpleaños Romina"))
            dataList.add(ItemList(ItemList.Layout_One_Kudos, R.drawable.congrats,  "Kudos de Canadian Toys", "Tania, 10 años en el empresa"))
            dataList.add(ItemList(ItemList.Layout_Two_Employee, R.drawable.cake48, "Pedro De la Cruz", "Muy Feliz Cumpleaños Pedro"))
            dataList.add(ItemList(ItemList.Layout_One_Kudos, R.drawable.congrats,  "Kudos de IBM", "Silvia, felicitaciones por el lanzamiento de X23"))
            dataList.add(ItemList(ItemList.Layout_One_Kudos, R.drawable.cake48,    "Carlos Garcia", "Que pases un lindo dia"))
            dataList.add(ItemList(ItemList.Layout_One_Kudos, R.drawable.cake48,    "Marcela Clay", "Felicidades, lo mejor para vos en este dia"))
            dataList.add(ItemList(ItemList.Layout_One_Kudos, R.drawable.cake48,    "Carlos Dio", "Te deseamos que tengas un gran dia"))
            return dataList
        }
    }

 }

