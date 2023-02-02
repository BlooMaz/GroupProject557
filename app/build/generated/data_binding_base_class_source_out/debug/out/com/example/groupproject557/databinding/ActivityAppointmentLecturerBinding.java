// Generated by view binder compiler. Do not edit!
package com.example.groupproject557.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.groupproject557.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAppointmentLecturerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView AppReq;

  @NonNull
  public final FloatingActionButton fabtnsorApprove1;

  @NonNull
  public final FloatingActionButton fabtnsorDecline1;

  @NonNull
  public final FloatingActionButton fabtnsortNew1;

  private ActivityAppointmentLecturerBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView AppReq, @NonNull FloatingActionButton fabtnsorApprove1,
      @NonNull FloatingActionButton fabtnsorDecline1, @NonNull FloatingActionButton fabtnsortNew1) {
    this.rootView = rootView;
    this.AppReq = AppReq;
    this.fabtnsorApprove1 = fabtnsorApprove1;
    this.fabtnsorDecline1 = fabtnsorDecline1;
    this.fabtnsortNew1 = fabtnsortNew1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAppointmentLecturerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAppointmentLecturerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_appointment_lecturer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAppointmentLecturerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AppReq;
      RecyclerView AppReq = ViewBindings.findChildViewById(rootView, id);
      if (AppReq == null) {
        break missingId;
      }

      id = R.id.fabtnsorApprove1;
      FloatingActionButton fabtnsorApprove1 = ViewBindings.findChildViewById(rootView, id);
      if (fabtnsorApprove1 == null) {
        break missingId;
      }

      id = R.id.fabtnsorDecline1;
      FloatingActionButton fabtnsorDecline1 = ViewBindings.findChildViewById(rootView, id);
      if (fabtnsorDecline1 == null) {
        break missingId;
      }

      id = R.id.fabtnsortNew1;
      FloatingActionButton fabtnsortNew1 = ViewBindings.findChildViewById(rootView, id);
      if (fabtnsortNew1 == null) {
        break missingId;
      }

      return new ActivityAppointmentLecturerBinding((ConstraintLayout) rootView, AppReq,
          fabtnsorApprove1, fabtnsorDecline1, fabtnsortNew1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}