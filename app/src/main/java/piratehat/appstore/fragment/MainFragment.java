package piratehat.appstore.fragment;


import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageButton;

import com.shizhefei.mvc.MVCCoolHelper;
import com.shizhefei.mvc.MVCHelper;
import com.shizhefei.view.coolrefreshview.CoolRefreshView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import piratehat.appstore.Bean.AppBean;
import piratehat.appstore.Bean.BannerBean;
import piratehat.appstore.Bean.SerializableMap;
import piratehat.appstore.R;
import piratehat.appstore.adapter.MainAppsAdapter;
import piratehat.appstore.contract.IMainContract;
import piratehat.appstore.module.AppsDataSource;
import piratehat.appstore.presenter.MainPresenter;
import piratehat.appstore.ui.RankActivity;


/**
 * Created by PirateHat on 2018/10/27.
 */

public class MainFragment extends BaseFragment implements IMainContract.IView {


    @BindView(R.id.et_search)
    EditText mEtSearch;
    @BindView(R.id.btn_download)
    ImageButton mBtnDownload;

    @BindView(R.id.crv_apps)
    CoolRefreshView mCrvApps;
    @BindView(R.id.rv_apps)
    RecyclerView mRvApps;

    private MainAppsAdapter mAppsAdapter;
    private IMainContract.IPresenter mPresenter;
    private MVCHelper<List<AppBean>> mMVCHelper;
    private Map<String, List<AppBean>> mMap;

    @Override
    protected int setLayoutResId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initData(Bundle bundle) {


        mRvApps.setLayoutManager(new LinearLayoutManager(mActivity));
        mMVCHelper = new MVCCoolHelper<>(mCrvApps);
        mMVCHelper.setDataSource(new AppsDataSource());
        mAppsAdapter = new MainAppsAdapter(mActivity);
        mMVCHelper.setAdapter(mAppsAdapter);
        mMap = new HashMap<>();
        mPresenter = new MainPresenter(this);
        mPresenter.getMainPage();
        mMVCHelper.refresh();


    }

    @Override
    protected void initView() {


    }

    @Override
    protected void initListener() {
        mAppsAdapter.setTabListener(new MainAppsAdapter.OnTabClickListener() {
            @Override
            public void click(int id) {
                switch (id) {
                    case 0:
                        break;
                    case R.id.tab_rank:
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("map", new SerializableMap(mMap));
                        RankActivity.actionStart(mActivity, bundle);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
            }
        });


    }

    @Override
    public void setRankApps(Map<String, List<AppBean>> beans) {
        mMap = beans;
    }

    @Override
    public void setBanner(ArrayList<BannerBean> beans, ArrayList<String> titles) {
        mAppsAdapter.startBanner(beans, titles);
    }

    @Override
    public void showError(String msg) {

    }

    @OnClick(R.id.btn_download)
    public void onViewClicked() {

    }


}
