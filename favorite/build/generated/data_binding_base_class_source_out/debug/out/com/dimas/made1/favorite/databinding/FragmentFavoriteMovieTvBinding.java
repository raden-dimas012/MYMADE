// Generated by view binder compiler. Do not edit!
package com.dimas.made1.favorite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.dimas.made1.favorite.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFavoriteMovieTvBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final NoItemFavoriteBinding notFound;

  @NonNull
  public final ProgressBar pbFavMovieTv;

  @NonNull
  public final RecyclerView rvFavMovieTv;

  private FragmentFavoriteMovieTvBinding(@NonNull ConstraintLayout rootView,
      @NonNull NoItemFavoriteBinding notFound, @NonNull ProgressBar pbFavMovieTv,
      @NonNull RecyclerView rvFavMovieTv) {
    this.rootView = rootView;
    this.notFound = notFound;
    this.pbFavMovieTv = pbFavMovieTv;
    this.rvFavMovieTv = rvFavMovieTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFavoriteMovieTvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFavoriteMovieTvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_favorite_movie_tv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFavoriteMovieTvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.not_found;
      View notFound = rootView.findViewById(id);
      if (notFound == null) {
        break missingId;
      }
      NoItemFavoriteBinding binding_notFound = NoItemFavoriteBinding.bind(notFound);

      id = R.id.pb_fav_movie_tv;
      ProgressBar pbFavMovieTv = rootView.findViewById(id);
      if (pbFavMovieTv == null) {
        break missingId;
      }

      id = R.id.rv_fav_movie_tv;
      RecyclerView rvFavMovieTv = rootView.findViewById(id);
      if (rvFavMovieTv == null) {
        break missingId;
      }

      return new FragmentFavoriteMovieTvBinding((ConstraintLayout) rootView, binding_notFound,
          pbFavMovieTv, rvFavMovieTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
