package com.test.roomtest;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;


@Singleton
@Component(modules = {
        AppModule.class,
        RoomModule.class,
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App app);

        Builder appModule(AppModule appModule);

        AppComponent build();
    }

    void inject(App app);
}
