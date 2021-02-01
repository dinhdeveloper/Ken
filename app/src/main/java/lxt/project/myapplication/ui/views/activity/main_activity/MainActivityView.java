package lxt.project.myapplication.ui.views.activity.main_activity;

import android.widget.FrameLayout;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import b.laixuantam.myaarlibrary.base.BaseUiContainer;
import b.laixuantam.myaarlibrary.base.BaseView;
import b.laixuantam.myaarlibrary.helper.AppUtils;
import lxt.project.myapplication.R;
import lxt.project.myapplication.activity.MainActivity;

public class MainActivityView extends BaseView<MainActivityView.UIContainer> implements MainActivityViewInterface {

    MainActivity activity;
    MainActivityViewCallback viewCallback;
    @Override
    public <A, C> void init(A activity, C callback) {
        this.activity = (MainActivity) activity;
        this.viewCallback = (MainActivityViewCallback) callback;
    }

    @Override
    public void toggleNav() {
        if (isDrawerOpen()){
            closeDrawer();
        }else{
            openDrawer();
        }
    }
    public boolean isDrawerOpen() {
        return ui.drawer_layout.isDrawerOpen(GravityCompat.START);
    }

    public void openDrawer() {
        AppUtils.hideKeyBoard(getView());
        ui.drawer_layout.openDrawer(GravityCompat.START);
    }

    public void closeDrawer() {
        if (isDrawerOpen()) {
            ui.drawer_layout.closeDrawer(GravityCompat.START);
        }
    }


    @Override
    public BaseUiContainer getUiContainer() {
        return new MainActivityView.UIContainer();
    }

    @Override
    public int getViewId() {
        return R.layout.dinh_layout_activity_main;
    }

    public class UIContainer extends BaseUiContainer {
        @UiElement(R.id.nav_view)
        public NavigationView nav_view;

        @UiElement(R.id.drawer_layout)
        public DrawerLayout drawer_layout;

        @UiElement(R.id.content_frame)
        public FrameLayout frameLayout;

    }
}
