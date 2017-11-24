package com.example.usuario.inventoryFragment.ui.prefs;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

import com.example.usuario.inventoryFragment.R;

/**
 * Created by mamorky on 2/11/17.
 */

public class AccountSettingActivity extends PreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.account_setting);
    }
}