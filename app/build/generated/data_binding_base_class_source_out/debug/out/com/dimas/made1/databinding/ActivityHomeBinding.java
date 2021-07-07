// Generated by view binder compiler. Do not edit!
package com.dimas.made1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.dimas.made1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FragmentContainerView fragmentContainerView;

  @NonNull
  public final BottomNavigationView navBottom;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull FragmentContainerView fragmentContainerView,
      @NonNull BottomNavigationView navBottom) {
    this.rootView = rootView;
    this.fragmentContainerView = fragmentContainerView;
    this.navBottom = navBottom;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragmentContainerView;
      FragmentContainerView fragmentContainerView = rootView.findViewById(id);
      if (fragmentContainerView == null) {
        break missingId;
      }

      id = R.id.nav_bottom;
      BottomNavigationView navBottom = rootView.findViewById(id);
      if (navBottom == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, fragmentContainerView, navBottom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
