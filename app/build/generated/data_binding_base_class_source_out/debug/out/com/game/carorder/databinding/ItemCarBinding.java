// Generated by view binder compiler. Do not edit!
package com.game.carorder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.game.carorder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView face;

  @NonNull
  public final ImageView ivShare;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  private ItemCarBinding(@NonNull LinearLayout rootView, @NonNull ImageView face,
      @NonNull ImageView ivShare, @NonNull TextView tvName, @NonNull TextView tvPrice) {
    this.rootView = rootView;
    this.face = face;
    this.ivShare = ivShare;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_car, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.face;
      ImageView face = ViewBindings.findChildViewById(rootView, id);
      if (face == null) {
        break missingId;
      }

      id = R.id.iv_share;
      ImageView ivShare = ViewBindings.findChildViewById(rootView, id);
      if (ivShare == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_price;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      return new ItemCarBinding((LinearLayout) rootView, face, ivShare, tvName, tvPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
