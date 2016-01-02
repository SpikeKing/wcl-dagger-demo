package clwang.chunyu.me.wcl_dagger_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        DemoApplication.component().inject(this); // 应用注入
    }

    // 跳转列表视图
    public void gotoReposList(View view) {
        startActivity(new Intent(this, ReposListActivity.class));
    }
}
