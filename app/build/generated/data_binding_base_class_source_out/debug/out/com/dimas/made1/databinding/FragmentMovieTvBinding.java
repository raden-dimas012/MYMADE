// Generated by view binder compiler. Do not edit!
package com.dimas.made1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.dimas.made1.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMovieTvBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fabSort;

  @NonNull
  public final FloatingActionButton fabSortId;

  @NonNull
  public final FloatingActionButton fabSortRating;

  @NonNull
  public final FloatingActionButton fabSortVoting;

  @NonNull
  public final NoItemBinding notFound;

  @NonNull
  public final RecyclerView rvMovieTv;

  @NonNull
  public final ShimmerFrameLayout shimmerMovieTv;

  private FragmentMovieTvBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fabSort, @NonNull FloatingActionButton fabSortId,
      @NonNull FloatingActionButton fabSortRating, @NonNull FloatingActionButton fabSortVoting,
      @NonNull NoItemBinding notFound, @NonNull RecyclerView rvMovieTv,
      @NonNull ShimmerFrameLayout shimmerMovieTv) {
    this.rootView = rootView;
    this.fabSort = fabSort;
    this.fabSortId = fabSortId;
    this.fabSortRating = fabSortRating;
    this.fabSortVoting = fabSortVoting;
    this.notFound = notFound;
    this.rvMovieTv = rvMovieTv;
    this.shimmerMovieTv = shimmerMovieTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMovieTvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMovieTvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movie_tv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMovieTvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab_sort;
      FloatingActionButton fabSort = rootView.findViewById(id);
      if (fabSort == null) {
        break missingId;
      }

      id = R.id.fab_sort_id;
      FloatingActionButton fabSortId = rootView.findViewById(id);
      if (fabSortId == null) {
        break missingId;
      }

      id = R.id.fab_sort_rating;
      FloatingActionButton fabSortRating = rootView.findViewById(id);
      if (fabSortRating == null) {
        break missingId;
      }

      id = R.id.fab_sort_voting;
      FloatingActionButton fabSortVoting = rootView.findViewById(id);
      if (fabSortVoting == null) {
        break missingId;
      }

      id = R.id.not_found;
      View notFound = rootView.findViewById(id);
      if (notFound == null) {
        break missingId;
      }
      NoItemBinding binding_notFound = NoItemBinding.bind(notFound);

      id = R.id.rv_movie_tv;
      RecyclerView rvMovieTv = rootView.findViewById(id);
      if (rvMovieTv == null) {
        break missingId;
      }

      id = R.id.shimmer_movie_tv;
      ShimmerFrameLayout shimmerMovieTv = rootView.findViewById(id);
      if (shimmerMovieTv == null) {
        break missingId;
      }

      return new FragmentMovieTvBinding((ConstraintLayout) rootView, fabSort, fabSortId,
          fabSortRating, fabSortVoting, binding_notFound, rvMovieTv, shimmerMovieTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
