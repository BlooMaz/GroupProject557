// Generated by view binder compiler. Do not edit!
package com.example.groupproject557.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.groupproject557.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNewRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnBack;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText edtEmail;

  @NonNull
  public final EditText edtName;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtRole;

  @NonNull
  public final EditText edtUsername;

  @NonNull
  public final ImageView imageView3;

  private ActivityNewRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnBack,
      @NonNull Button btnRegister, @NonNull EditText edtEmail, @NonNull EditText edtName,
      @NonNull EditText edtPassword, @NonNull EditText edtRole, @NonNull EditText edtUsername,
      @NonNull ImageView imageView3) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnRegister = btnRegister;
    this.edtEmail = edtEmail;
    this.edtName = edtName;
    this.edtPassword = edtPassword;
    this.edtRole = edtRole;
    this.edtUsername = edtUsername;
    this.imageView3 = imageView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNewRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_new_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      Button btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.edtEmail;
      EditText edtEmail = ViewBindings.findChildViewById(rootView, id);
      if (edtEmail == null) {
        break missingId;
      }

      id = R.id.edtName;
      EditText edtName = ViewBindings.findChildViewById(rootView, id);
      if (edtName == null) {
        break missingId;
      }

      id = R.id.edtPassword;
      EditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edtRole;
      EditText edtRole = ViewBindings.findChildViewById(rootView, id);
      if (edtRole == null) {
        break missingId;
      }

      id = R.id.edtUsername;
      EditText edtUsername = ViewBindings.findChildViewById(rootView, id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      return new ActivityNewRegisterBinding((ConstraintLayout) rootView, btnBack, btnRegister,
          edtEmail, edtName, edtPassword, edtRole, edtUsername, imageView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
