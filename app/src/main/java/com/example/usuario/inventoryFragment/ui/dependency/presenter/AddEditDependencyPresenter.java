package com.example.usuario.inventoryFragment.ui.dependency.presenter;

/**
 * Created by mamorky on 23/11/17.
 */

public class AddEditDependencyPresenter implements  AddEditDependencyContract.Presenter{

    private  AddEditDependencyContract.View view;

    public AddEditDependencyPresenter (AddEditDependencyContract.View view) {
        this.view = view;
    }

    @Override
    public void validatedependency() {
        this.view = view;
    }
}
