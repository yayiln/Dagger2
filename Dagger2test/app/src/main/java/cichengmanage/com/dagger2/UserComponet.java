package cichengmanage.com.dagger2;

import dagger.Component;

/**
 * Created by yayiln on 2018/1/7.
 */

@Component(modules = UserModule.class)
public interface UserComponet {
    void inJect(MainActivity activity);
}
