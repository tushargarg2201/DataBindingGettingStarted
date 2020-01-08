package codingwithmitch.com.databindinggettingstarted;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import codingwithmitch.com.databindinggettingstarted.databinding.ActivityMainBinding;
import codingwithmitch.com.databindinggettingstarted.models.Product;
import codingwithmitch.com.databindinggettingstarted.util.Products;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Product mProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Products products = new Products();
        mProduct = products.PRODUCTS[0];
        binding.setProduct(mProduct);
    }
}
