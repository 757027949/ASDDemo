package com.asd.asdutils.widget.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/8/5 0005.
 */

public class BaseFragmentDialogWithLayout extends DialogFragment {

    /**
     * 获取实例  记得继承DialogCallback
     * @param layoutId
     * @return
     */
    public static BaseFragmentDialogWithLayout getInstance(int layoutId) {
        BaseFragmentDialogWithLayout dialog = new BaseFragmentDialogWithLayout();
        Bundle bundle = new Bundle();
        bundle.putInt("layoutId", layoutId);
        dialog.setArguments(bundle);
        return dialog;
    }

    @Override
    public void onAttach(Context context) {
        if (!(context instanceof DialogCallback)) {
            throw new IllegalStateException("fragment所在的Activity必须实现Callbacks接口");
        }
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getArguments().getInt("layoutId"), null);
        ((DialogCallback) getActivity()).dialogLayoutView(view);
        return view;
    }

    public interface DialogCallback {
        void dialogLayoutView(View view);
    }
}
