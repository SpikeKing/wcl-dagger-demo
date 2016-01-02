package clwang.chunyu.me.wcl_dagger_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // 应用注入
        DemoApplication.component().inject(this);
    }

    @OnCheckedChanged(R.id.main_cb_mock_data)
    public void onRememberMeCheckChanged(CompoundButton compoundButton, boolean checked) {

        // 改变状态, 重新设置注入
        DemoApplication.buildComponentAndInject();
    }

    // 跳转列表视图
    public void gotoReposList(View view) {
        startActivity(new Intent(this, ReposListActivity.class));
    }
}
