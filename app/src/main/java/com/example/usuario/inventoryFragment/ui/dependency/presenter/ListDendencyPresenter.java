package com.example.usuario.inventoryFragment.ui.dependency.presenter;

/**
 * Created by mamorky on 23/11/17.
 */

public class ListDendencyPresenter implements ListDependencyContract.Presenter{
    ListDependencyContract.View view;

    public ListDendencyPresenter(ListDependencyContract.View view) {
        this.view = view;
    }
}
