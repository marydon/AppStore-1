package piratehat.appstore.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import piratehat.appstore.Bean.AppBean;
import piratehat.appstore.R;
import piratehat.appstore.adapter.RankAppsAdapter;
import piratehat.appstore.app.App;

/**
 *
 * Created by PirateHat on 2018/10/31.
 */

public class RankFragment extends BaseFragment {


    @BindView(R.id.rv_apps)
    RecyclerView mRvApps;

    private List<AppBean> mAppBeans;
    private RankAppsAdapter mAppsAdapter;


    @Override
    protected int setLayoutResId() {
        return R.layout.fragment_rank;
    }

    @Override
    protected void initData(Bundle bundle) {
        mAppBeans = (List<AppBean>) bundle.getSerializable("apps");
        mAppsAdapter = new RankAppsAdapter(mAppBeans,mActivity);
    }

    @Override
    protected void initView() {
        mRvApps.setLayoutManager(new LinearLayoutManager(mActivity,LinearLayoutManager.VERTICAL,false));
        mRvApps.setAdapter(mAppsAdapter);
    }

    @Override
    protected void initListener() {

    }

    public static RankFragment newInstance(ArrayList appBeans){
        RankFragment fragment = new RankFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("apps", appBeans);
        fragment.setArguments(bundle);
        return fragment;
    }

}
