// (c)2016 Flipboard Inc, All Rights Reserved.

package com.daryl.rnetwork.fragment;

import android.app.AlertDialog;
import android.app.Fragment;

import com.daryl.rnetwork.R;

import butterknife.OnClick;
import rx.Subscription;

public abstract class BaseFragment extends Fragment {
    protected Subscription subscription;

    @OnClick(R.id.tipBt)
    void tip() {
        new AlertDialog.Builder(getActivity())
                .setTitle("default")
                .setView(getActivity().getLayoutInflater().inflate(R.layout.dialog_map, null))
                .show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unsubscribe();
    }

    protected void unsubscribe() {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

/*    protected abstract int getDialogRes();

    protected abstract int getTitleRes();*/
}
