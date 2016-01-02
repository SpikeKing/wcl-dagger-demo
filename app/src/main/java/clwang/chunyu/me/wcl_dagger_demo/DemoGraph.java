package clwang.chunyu.me.wcl_dagger_demo;

/**
 * Dagger的图接口
 * <p/>
 * Created by wangchenlong on 16/1/2.
 */
public interface DemoGraph {
    void inject(MainActivity mainActivity); // 注入MainActivity

    void inject(ReposListActivity reposListActivity); // 注入列表Activity
}
