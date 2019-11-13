package com.tb.pro.rocery_store;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.tb.pro.R;
import com.tbpower.tools.TBTools;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class MainActivity extends Activity {

    private Unbinder unbinder;

    @BindView(R.id.main_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TBTools.log().i("TASK TEST","main create>>>>>>>>>>>>");

        TBTools.log().i("mzr", TBTools.convert().px2dp(100)+"");
        unbinder = ButterKnife.bind(this);

        //生成头部
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withAccountHeader(R.layout.drawer_header)//头部布局
                .build();

        new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)  //绑定toolbar
                .withAccountHeader(headerResult)  //添加头部
                .addDrawerItems(  //添加菜单item
                        new PrimaryDrawerItem().withName("ULL").withIcon(R.mipmap.ic_launcher).withSelectable(false),
                        new PrimaryDrawerItem().withName("Weather").withIcon(R.mipmap.ic_launcher).withSelectable(false),
                        new PrimaryDrawerItem().withName("HOOK").withIcon(R.mipmap.ic_launcher).withSelectable(false)
                )
                //添加点击事件
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        switch(position) {
                            case 0://头部点击
                                break;
                            case 1://当前界面
                                break;
                            case 2://Weather
                                break;
                            case 3://HOOK
                                break;

                        }
                        return false;
                    }
                })
                .withSelectedItemByPosition(1)//设置默认选择菜单项
                .build();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
