package com.guiying.androidmodulepattern;

import com.github.mzule.activityrouter.annotation.Modules;
import com.guiying.common.base.BaseApplication;

/**
 * <p>应用程序的Application只负责管理组件</p>
 *
 * @author 张华洋 2017/2/15 20:14
 * @version V1.2.0
 * @name MyApplication
 */
@Modules({"app", "main", "girls", "news"})
public class MyApplication extends BaseApplication {


    @Override
    public void onCreate() {
        super.onCreate();
    }

}
