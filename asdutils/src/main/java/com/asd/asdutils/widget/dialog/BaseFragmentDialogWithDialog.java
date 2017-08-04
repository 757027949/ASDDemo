package com.asd.asdutils.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * 如果这个时候屏幕方向发生变化，就会导致Activity重建，然后之前显示的对话框就不见了。
 * Created by Administrator on 2017/8/5 0005.
 */

public class BaseFragmentDialogWithDialog extends DialogFragment {

    /**
     * 获取实例  记得继承DialogCallback
     *
     * @return
     */
    public static BaseFragmentDialogWithDialog getInstance() {
        BaseFragmentDialogWithDialog dialog = new BaseFragmentDialogWithDialog();
        return dialog;
    }

    @Override
    public void onAttach(Context context) {
        if (!(context instanceof DialogCallback)) {
            throw new IllegalStateException("fragment所在的Activity必须实现Callbacks接口");
        }
        super.onAttach(context);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return ((DialogCallback) getActivity()).getDialog();
    }

    public interface DialogCallback {
        Dialog getDialog();
    }
}
