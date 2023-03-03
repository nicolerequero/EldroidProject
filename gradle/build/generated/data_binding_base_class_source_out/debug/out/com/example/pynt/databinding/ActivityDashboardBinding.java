// Generated by view binder compiler. Do not edit!
package com.example.pynt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pynt.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDashboardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomAppBar bottombar;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final CardView cardView21;

  @NonNull
  public final CardView cardView22;

  @NonNull
  public final CardView cardView23;

  @NonNull
  public final CardView cardView24;

  @NonNull
  public final CardView cardView25;

  @NonNull
  public final CardView cardView26;

  @NonNull
  public final CardView cardView27;

  @NonNull
  public final CardView cardView28;

  @NonNull
  public final CardView cardView29;

  @NonNull
  public final CardView cardView30;

  @NonNull
  public final CardView cardView31;

  @NonNull
  public final ImageView mainmenu;

  private ActivityDashboardBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomAppBar bottombar, @NonNull CardView cardView2, @NonNull CardView cardView21,
      @NonNull CardView cardView22, @NonNull CardView cardView23, @NonNull CardView cardView24,
      @NonNull CardView cardView25, @NonNull CardView cardView26, @NonNull CardView cardView27,
      @NonNull CardView cardView28, @NonNull CardView cardView29, @NonNull CardView cardView30,
      @NonNull CardView cardView31, @NonNull ImageView mainmenu) {
    this.rootView = rootView;
    this.bottombar = bottombar;
    this.cardView2 = cardView2;
    this.cardView21 = cardView21;
    this.cardView22 = cardView22;
    this.cardView23 = cardView23;
    this.cardView24 = cardView24;
    this.cardView25 = cardView25;
    this.cardView26 = cardView26;
    this.cardView27 = cardView27;
    this.cardView28 = cardView28;
    this.cardView29 = cardView29;
    this.cardView30 = cardView30;
    this.cardView31 = cardView31;
    this.mainmenu = mainmenu;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottombar;
      BottomAppBar bottombar = ViewBindings.findChildViewById(rootView, id);
      if (bottombar == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.cardView21;
      CardView cardView21 = ViewBindings.findChildViewById(rootView, id);
      if (cardView21 == null) {
        break missingId;
      }

      id = R.id.cardView22;
      CardView cardView22 = ViewBindings.findChildViewById(rootView, id);
      if (cardView22 == null) {
        break missingId;
      }

      id = R.id.cardView23;
      CardView cardView23 = ViewBindings.findChildViewById(rootView, id);
      if (cardView23 == null) {
        break missingId;
      }

      id = R.id.cardView24;
      CardView cardView24 = ViewBindings.findChildViewById(rootView, id);
      if (cardView24 == null) {
        break missingId;
      }

      id = R.id.cardView25;
      CardView cardView25 = ViewBindings.findChildViewById(rootView, id);
      if (cardView25 == null) {
        break missingId;
      }

      id = R.id.cardView26;
      CardView cardView26 = ViewBindings.findChildViewById(rootView, id);
      if (cardView26 == null) {
        break missingId;
      }

      id = R.id.cardView27;
      CardView cardView27 = ViewBindings.findChildViewById(rootView, id);
      if (cardView27 == null) {
        break missingId;
      }

      id = R.id.cardView28;
      CardView cardView28 = ViewBindings.findChildViewById(rootView, id);
      if (cardView28 == null) {
        break missingId;
      }

      id = R.id.cardView29;
      CardView cardView29 = ViewBindings.findChildViewById(rootView, id);
      if (cardView29 == null) {
        break missingId;
      }

      id = R.id.cardView30;
      CardView cardView30 = ViewBindings.findChildViewById(rootView, id);
      if (cardView30 == null) {
        break missingId;
      }

      id = R.id.cardView31;
      CardView cardView31 = ViewBindings.findChildViewById(rootView, id);
      if (cardView31 == null) {
        break missingId;
      }

      id = R.id.mainmenu;
      ImageView mainmenu = ViewBindings.findChildViewById(rootView, id);
      if (mainmenu == null) {
        break missingId;
      }

      return new ActivityDashboardBinding((ConstraintLayout) rootView, bottombar, cardView2,
          cardView21, cardView22, cardView23, cardView24, cardView25, cardView26, cardView27,
          cardView28, cardView29, cardView30, cardView31, mainmenu);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
