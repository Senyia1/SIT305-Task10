// Generated by view binder compiler. Do not edit!
package com.game.carorder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.game.carorder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView ivAddNew;

  @NonNull
  public final ImageView ivMenu;

  @NonNull
  public final RecyclerView recycler;

  @NonNull
  public final RelativeLayout titleBar;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull ImageView ivAddNew,
      @NonNull ImageView ivMenu, @NonNull RecyclerView recycler, @NonNull RelativeLayout titleBar) {
    this.rootView = rootView;
    this.ivAddNew = ivAddNew;
    this.ivMenu = ivMenu;
    this.recycler = recycler;
    this.titleBar = titleBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_add_new;
      ImageView ivAddNew = ViewBindings.findChildViewById(rootView, id);
      if (ivAddNew == null) {
        break missingId;
      }

      id = R.id.iv_menu;
      ImageView ivMenu = ViewBindings.findChildViewById(rootView, id);
      if (ivMenu == null) {
        break missingId;
      }

      id = R.id.recycler;
      RecyclerView recycler = ViewBindings.findChildViewById(rootView, id);
      if (recycler == null) {
        break missingId;
      }

      id = R.id.titleBar;
      RelativeLayout titleBar = ViewBindings.findChildViewById(rootView, id);
      if (titleBar == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, ivAddNew, ivMenu, recycler,
          titleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
