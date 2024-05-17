// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;
import eu.siacs.conversations.R;
import eu.siacs.conversations.ui.widget.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityChangePasswordBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final RelativeLayout buttonBar;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button changePasswordButton;

  @NonNull
  public final TextInputEditText currentPassword;

  @NonNull
  public final TextInputLayout currentPasswordLayout;

  @NonNull
  public final TextInputEditText newPassword;

  @NonNull
  public final TextInputLayout newPasswordLayout;

  @NonNull
  public final MaterialToolbar toolbar;

  protected ActivityChangePasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBarLayout, RelativeLayout buttonBar,
      Button cancelButton, Button changePasswordButton, TextInputEditText currentPassword,
      TextInputLayout currentPasswordLayout, TextInputEditText newPassword,
      TextInputLayout newPasswordLayout, MaterialToolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.buttonBar = buttonBar;
    this.cancelButton = cancelButton;
    this.changePasswordButton = changePasswordButton;
    this.currentPassword = currentPassword;
    this.currentPasswordLayout = currentPasswordLayout;
    this.newPassword = newPassword;
    this.newPasswordLayout = newPasswordLayout;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_change_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityChangePasswordBinding>inflateInternal(inflater, R.layout.activity_change_password, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_change_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityChangePasswordBinding>inflateInternal(inflater, R.layout.activity_change_password, null, false, component);
  }

  public static ActivityChangePasswordBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityChangePasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityChangePasswordBinding)bind(component, view, R.layout.activity_change_password);
  }
}
