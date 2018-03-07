package cichengmanage.com.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yayiln on 2018/1/7.
 */

@Module
public class UserModule {

    @Provides//提供依赖
    public ApiService providesApiService(){
        return new ApiService();
    }
}
