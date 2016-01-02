package clwang.chunyu.me.wcl_dagger_demo.modules;

import javax.inject.Singleton;

import clwang.chunyu.me.wcl_dagger_demo.contents.GitHubService;
import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * 接口模块
 * <p>
 * Created by wangchenlong on 16/1/2.
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    protected GitHubService provideGitHubService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GitHubService.ENDPOINT)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 添加Rx适配器
                .addConverterFactory(GsonConverterFactory.create()) // 添加Gson转换器
                .build();
        return retrofit.create(GitHubService.class);
    }
}
