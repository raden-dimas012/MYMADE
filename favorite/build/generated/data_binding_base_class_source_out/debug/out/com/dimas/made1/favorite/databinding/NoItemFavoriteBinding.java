// Generated by view binder compiler. Do not edit!
package com.dimas.made1.favorite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dimas.made1.favorite.R;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoItemFavoriteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView lottieAnimNotFound;

  @NonNull
  public final MaterialTextView tvNotFound;

  private NoItemFavoriteBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView lottieAnimNotFound, @NonNull MaterialTextView tvNotFound) {
    this.rootView = rootView;
    this.lottieAnimNotFound = lottieAnimNotFound;
    this.tvNotFound = tvNotFound;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NoItemFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoItemFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.no_item_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoItemFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lottie_anim_not_found;
      LottieAnimationView lottieAnimNotFound = rootView.findViewById(id);
      if (lottieAnimNotFound == null) {
        break missingId;
      }

      id = R.id.tv_not_found;
      MaterialTextView tvNotFound = rootView.findViewById(id);
      if (tvNotFound == null) {
        break missingId;
      }

      return new NoItemFavoriteBinding((ConstraintLayout) rootView, lottieAnimNotFound, tvNotFound);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
