package com.example.usuario.inventoryFragment.ui.dependency.presenter;

/**
 * Created by mamorky on 23/11/17.
 */

public interface AddEditDependencyContract{
    interface View{
        void setPresenter(AddEditDependencyContract.Presenter presenter);
    }

    interface Presenter{

        void validatedependency();
    }
}
