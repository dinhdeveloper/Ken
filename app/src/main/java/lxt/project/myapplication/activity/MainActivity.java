package lxt.project.myapplication.activity;

import android.os.Bundle;

import androidx.core.app.ActivityCompat;

import b.laixuantam.myaarlibrary.base.BaseFragmentActivity;
import b.laixuantam.myaarlibrary.base.BaseParameters;
import b.laixuantam.myaarlibrary.helper.OnKeyboardVisibilityListener;
import lxt.project.myapplication.R;
import lxt.project.myapplication.fragment.customer.dashboard.FragmentDashBoardCustomer;
import lxt.project.myapplication.ui.views.action_bar.base_main_actionbar.BaseMainActionbarViewCallback;
import lxt.project.myapplication.ui.views.action_bar.base_main_actionbar.BaseMainActionbarViewInterface;
import lxt.project.myapplication.ui.views.activity.main_activity.MainActivityView;
import lxt.project.myapplication.ui.views.activity.main_activity.MainActivityViewCallback;
import lxt.project.myapplication.ui.views.activity.main_activity.MainActivityViewInterface;

public class MainActivity extends BaseFragmentActivity<MainActivityViewInterface, BaseMainActionbarViewInterface, BaseParameters> implements BaseMainActionbarViewCallback, MainActivityViewCallback, ActivityCompat.OnRequestPermissionsResultCallback, OnKeyboardVisibilityListener {
    private final int OPEN_MEDIA_PICKER = 10101;
    private final int OPEN_MEDIA_PICKER_PERMISSION = 10102;
    private static final int CAMERA_REQUEST = 10103;
    public static final int EMAIL_SEND = 10104;
    private final int MY_CAMERA_PERMISSION_CODE = 10104;
    public static final int MY_BARCODE_PERMISSION_CODE = 10105;
    @Override
    protected void initialize(Bundle savedInstanceState) {
        view.init(this,this);
        changeToFragmentDashboard();
    }

    public void toggleNav(){
        view.toggleNav();
    }

    private void changeToFragmentDashboard() {
        replaceFragment(new FragmentDashBoardCustomer(), true, Animation.SLIDE_IN_OUT);
    }

    @Override
    protected MainActivityViewInterface getViewInstance() {
        return new MainActivityView();
    }

    @Override
    protected BaseMainActionbarViewInterface getActionbarInstance() {
        return null;
    }

    @Override
    protected BaseParameters getParametersContainer() {
        return null;
    }

    @Override
    protected int getFragmentContainerId() {
        return R.id.content_frame;
    }


    @Override
    public void onVisibilityChanged(boolean visible) {

    }

    @Override
    public void onFilterToggle(boolean showFilter) {

    }

    @Override
    public void onFiltering(String keyword) {

    }

    @Override
    public void onClickButtonLeftActionbar() {

    }

    @Override
    public void onClickButtonRightActionbar() {

    }
}
