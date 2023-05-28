// Generated by view binder compiler. Do not edit!
package com.game.carorder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.game.carorder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddOrderStep2Binding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final EditText etHeight;

  @NonNull
  public final EditText etLength;

  @NonNull
  public final EditText etTypeOther;

  @NonNull
  public final EditText etVehicleOther;

  @NonNull
  public final EditText etWeight;

  @NonNull
  public final EditText etWidth;

  @NonNull
  public final TextView titleBar;

  @NonNull
  public final TextView tvBuildingMaterial;

  @NonNull
  public final TextView tvCreateOrder;

  @NonNull
  public final TextView tvDryGoods;

  @NonNull
  public final TextView tvFood;

  @NonNull
  public final TextView tvFurniture;

  @NonNull
  public final TextView tvMiniTruck;

  @NonNull
  public final TextView tvRefrigerated;

  @NonNull
  public final TextView tvTruck;

  @NonNull
  public final TextView tvVan;

  private ActivityAddOrderStep2Binding(@NonNull LinearLayoutCompat rootView,
      @NonNull EditText etHeight, @NonNull EditText etLength, @NonNull EditText etTypeOther,
      @NonNull EditText etVehicleOther, @NonNull EditText etWeight, @NonNull EditText etWidth,
      @NonNull TextView titleBar, @NonNull TextView tvBuildingMaterial,
      @NonNull TextView tvCreateOrder, @NonNull TextView tvDryGoods, @NonNull TextView tvFood,
      @NonNull TextView tvFurniture, @NonNull TextView tvMiniTruck,
      @NonNull TextView tvRefrigerated, @NonNull TextView tvTruck, @NonNull TextView tvVan) {
    this.rootView = rootView;
    this.etHeight = etHeight;
    this.etLength = etLength;
    this.etTypeOther = etTypeOther;
    this.etVehicleOther = etVehicleOther;
    this.etWeight = etWeight;
    this.etWidth = etWidth;
    this.titleBar = titleBar;
    this.tvBuildingMaterial = tvBuildingMaterial;
    this.tvCreateOrder = tvCreateOrder;
    this.tvDryGoods = tvDryGoods;
    this.tvFood = tvFood;
    this.tvFurniture = tvFurniture;
    this.tvMiniTruck = tvMiniTruck;
    this.tvRefrigerated = tvRefrigerated;
    this.tvTruck = tvTruck;
    this.tvVan = tvVan;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddOrderStep2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddOrderStep2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_order_step2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddOrderStep2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.et_height;
      EditText etHeight = ViewBindings.findChildViewById(rootView, id);
      if (etHeight == null) {
        break missingId;
      }

      id = R.id.et_length;
      EditText etLength = ViewBindings.findChildViewById(rootView, id);
      if (etLength == null) {
        break missingId;
      }

      id = R.id.et_type_other;
      EditText etTypeOther = ViewBindings.findChildViewById(rootView, id);
      if (etTypeOther == null) {
        break missingId;
      }

      id = R.id.et_vehicle_other;
      EditText etVehicleOther = ViewBindings.findChildViewById(rootView, id);
      if (etVehicleOther == null) {
        break missingId;
      }

      id = R.id.et_weight;
      EditText etWeight = ViewBindings.findChildViewById(rootView, id);
      if (etWeight == null) {
        break missingId;
      }

      id = R.id.et_width;
      EditText etWidth = ViewBindings.findChildViewById(rootView, id);
      if (etWidth == null) {
        break missingId;
      }

      id = R.id.titleBar;
      TextView titleBar = ViewBindings.findChildViewById(rootView, id);
      if (titleBar == null) {
        break missingId;
      }

      id = R.id.tv_building_material;
      TextView tvBuildingMaterial = ViewBindings.findChildViewById(rootView, id);
      if (tvBuildingMaterial == null) {
        break missingId;
      }

      id = R.id.tv_create_order;
      TextView tvCreateOrder = ViewBindings.findChildViewById(rootView, id);
      if (tvCreateOrder == null) {
        break missingId;
      }

      id = R.id.tv_dry_goods;
      TextView tvDryGoods = ViewBindings.findChildViewById(rootView, id);
      if (tvDryGoods == null) {
        break missingId;
      }

      id = R.id.tv_food;
      TextView tvFood = ViewBindings.findChildViewById(rootView, id);
      if (tvFood == null) {
        break missingId;
      }

      id = R.id.tv_furniture;
      TextView tvFurniture = ViewBindings.findChildViewById(rootView, id);
      if (tvFurniture == null) {
        break missingId;
      }

      id = R.id.tv_mini_truck;
      TextView tvMiniTruck = ViewBindings.findChildViewById(rootView, id);
      if (tvMiniTruck == null) {
        break missingId;
      }

      id = R.id.tv_refrigerated;
      TextView tvRefrigerated = ViewBindings.findChildViewById(rootView, id);
      if (tvRefrigerated == null) {
        break missingId;
      }

      id = R.id.tv_truck;
      TextView tvTruck = ViewBindings.findChildViewById(rootView, id);
      if (tvTruck == null) {
        break missingId;
      }

      id = R.id.tv_van;
      TextView tvVan = ViewBindings.findChildViewById(rootView, id);
      if (tvVan == null) {
        break missingId;
      }

      return new ActivityAddOrderStep2Binding((LinearLayoutCompat) rootView, etHeight, etLength,
          etTypeOther, etVehicleOther, etWeight, etWidth, titleBar, tvBuildingMaterial,
          tvCreateOrder, tvDryGoods, tvFood, tvFurniture, tvMiniTruck, tvRefrigerated, tvTruck,
          tvVan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}