package com.yanbing.calendar.pager;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.yanbing.calendar.Activity.fragment.BaseFragment;
import com.yanbing.calendar.Article;
import com.yanbing.calendar.ArticleAdapter;
import com.yanbing.calendar.R;
import com.yanbing.calendar.group.GroupItemDecoration;
import com.yanbing.calendar.group.GroupRecyclerView;


public class PagerFragment extends BaseFragment {

    private GroupRecyclerView mRecyclerView;


    static PagerFragment newInstance() {
        return new PagerFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_pager;
    }

    @Override
    protected void initView() {
        mRecyclerView = mRootView.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.addItemDecoration(new GroupItemDecoration<String, Article>());
        mRecyclerView.setAdapter(new ArticleAdapter(mContext));
        mRecyclerView.notifyDataSetChanged();
    }

    @Override
    protected void initData() {

    }

    boolean isScrollTop() {
        return mRecyclerView != null && mRecyclerView.computeVerticalScrollOffset() == 0;
    }
}
