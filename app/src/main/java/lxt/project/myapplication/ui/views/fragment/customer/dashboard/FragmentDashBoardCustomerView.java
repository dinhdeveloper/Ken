package lxt.project.myapplication.ui.views.fragment.customer.dashboard;

import android.content.res.AssetManager;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import b.laixuantam.myaarlibrary.base.BaseUiContainer;
import b.laixuantam.myaarlibrary.base.BaseView;
import b.laixuantam.myaarlibrary.widgets.viewpage.ViewPagerIndicator;
import lxt.project.myapplication.R;
import lxt.project.myapplication.activity.MainActivity;
import lxt.project.myapplication.model.ImageSlideModel;

public class FragmentDashBoardCustomerView extends BaseView<FragmentDashBoardCustomerView.UIContainer> implements FragmentDashBoardCustomerViewInterface {
    MainActivity activity;
    FragmentDashBoardCustomerViewCallback viewCallback;

    @Override
    public <A, C> void init(A activity, C callback) {
        this.activity = (MainActivity) activity;
        this.viewCallback = (FragmentDashBoardCustomerViewCallback) callback;
        setGone(ui.tvTitleHeader);

        ui.btnBackHeader.setOnClickListener(v -> {
            if (viewCallback != null) {
                viewCallback.onOpenNav();
            }
        });

    }

    @Override
    public void setDataImageSlide(ImageSlideModel[] data) {
        if (data != null && data.length > 0) {
            setVisible(ui.layoutHeaderSlide);
            setGone(ui.layoutShimmerSliderDashboard);
            setGone(ui.viewEmptyImageSlider);
            setVisible(ui.layoutSliderImage);

            ArrayList<String> listImage = new ArrayList<>();

//            for (ImageSlideModel itemSlide : data) {
//                listImage.add(itemSlide.getSlide_img());
//            }
//
//            NUM_PAGES = listImage.size();
//            SlidingImage_Adapter slidingImage_adapter = new SlidingImage_Adapter(activity, SlidingImage_Adapter.SliderImageType.LINK);
//            slidingImage_adapter.setIMAGE_LINK(listImage);
//            ui.pager_slider_image.setAdapter(slidingImage_adapter);
//
//            ui.indicator_pager_slider_image.setupWithViewPager(ui.pager_slider_image);
//
//            handler.post(loopSliderImage);
//
//            // Pager listener over indicator
//            ui.indicator_pager_slider_image.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//                @Override
//                public void onPageSelected(int position) {
//                    currentPage = position;
//
//                }
//
//                @Override
//                public void onPageScrolled(int pos, float arg1, int arg2) {
//
//                }
//
//                @Override
//                public void onPageScrollStateChanged(int pos) {
//
//                }
//            });
        } else {
            setGone(ui.layoutHeaderSlide);
            setVisible(ui.viewEmptyImageSlider);
            setGone(ui.layoutShimmerSliderDashboard);
            setGone(ui.layoutSliderImage);
        }
    }

    @Override
    public BaseUiContainer getUiContainer() {
        return new FragmentDashBoardCustomerView.UIContainer();
    }

    @Override
    public int getViewId() {
        return R.layout.dinh_layout_customer_fragment_dashboard;
    }

    public class UIContainer extends BaseUiContainer {
        @UiElement(R.id.btnBackHeader)
        public ImageView btnBackHeader;

        @UiElement(R.id.tvTitleHeader)
        public TextView tvTitleHeader;

        @UiElement(R.id.btnActionCart)
        public ImageView btnActionCart;

        @UiElement(R.id.layoutRootView)
        public LinearLayout layoutRootView;

        @UiElement(R.id.layoutSliderImage)
        public View layoutSliderImage;

        @UiElement(R.id.layoutHeaderSlide)
        public View layoutHeaderSlide;

        @UiElement(R.id.viewEmptyImageSlider)
        public View viewEmptyImageSlider;

        @UiElement(R.id.layoutShimmerSliderDashboard)
        public View layoutShimmerSliderDashboard;
    }
}
