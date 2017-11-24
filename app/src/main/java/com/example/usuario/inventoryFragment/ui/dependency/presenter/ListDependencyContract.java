package com.example.usuario.inventoryFragment.ui.dependency.presenter;

/**
 * Created by mamorky on 23/11/17.
 */

public interface ListDependencyContract {

    public interface Presenter {
    }

    public interface View {
        void setPresenter(ListDependencyContract.Presenter presenter);
    }
}
