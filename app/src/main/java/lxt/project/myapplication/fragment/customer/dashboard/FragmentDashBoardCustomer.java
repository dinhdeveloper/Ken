package lxt.project.myapplication.fragment.customer.dashboard;

import android.text.TextUtils;

import b.laixuantam.myaarlibrary.api.ApiRequest;
import b.laixuantam.myaarlibrary.api.ErrorApiResponse;
import b.laixuantam.myaarlibrary.base.BaseFragment;
import b.laixuantam.myaarlibrary.base.BaseParameters;
import b.laixuantam.myaarlibrary.widgets.dialog.alert.KAlertDialog;
import lxt.project.myapplication.R;
import lxt.project.myapplication.activity.MainActivity;
import lxt.project.myapplication.api.customer.RequestGetSlideHeader;
import lxt.project.myapplication.dependency.AppProvider;
import lxt.project.myapplication.model.BaseResponseModel;
import lxt.project.myapplication.model.ImageSlideModel;
import lxt.project.myapplication.ui.views.fragment.customer.dashboard.FragmentDashBoardCustomerView;
import lxt.project.myapplication.ui.views.fragment.customer.dashboard.FragmentDashBoardCustomerViewCallback;
import lxt.project.myapplication.ui.views.fragment.customer.dashboard.FragmentDashBoardCustomerViewInterface;

public class FragmentDashBoardCustomer extends BaseFragment<FragmentDashBoardCustomerViewInterface, BaseParameters> implements FragmentDashBoardCustomerViewCallback {
    MainActivity activity;

    @Override
    protected void initialize() {
        this.activity = (MainActivity) getActivity();
        view.init(activity, this);
        requestGetSlideHeader();
    }

    @Override
    protected FragmentDashBoardCustomerViewInterface getViewInstance() {
        return new FragmentDashBoardCustomerView();
    }

    @Override
    public void onOpenNav() {
        if (activity != null) {
            activity.toggleNav();
        }
    }

    private void requestGetSlideHeader() {
//        if (!AppProvider.getConnectivityHelper().hasInternetConnection()) {
//            showAlert(getContext().getResources().getString(R.string.error_internet_connection), KAlertDialog.ERROR_TYPE);
//            return;
//        }
//        showProgress();
//        RequestGetSlideHeader.ApiParams params = new RequestGetSlideHeader.ApiParams();
//
//        AppProvider.getApiManagement().call(RequestGetSlideHeader.class, params, new ApiRequest.ApiCallback<BaseResponseModel<ImageSlideModel>>() {
//            @Override
//            public void onSuccess(BaseResponseModel<ImageSlideModel> result) {
//                dismissProgress();
//                if (!TextUtils.isEmpty(result.getSuccess()) && result.getSuccess().equalsIgnoreCase("true")) {
//                    view.setDataImageSlide(result.getData());
//                }
//            }
//
//            @Override
//            public void onError(ErrorApiResponse error) {
//                view.setDataImageSlide(null);
//            }
//
//            @Override
//            public void onFail(ApiRequest.RequestError error) {
//                view.setDataImageSlide(null);
//            }
//        });
    }


    @Override
    protected BaseParameters getParametersContainer() {
        return null;
    }
}
