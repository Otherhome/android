// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogQuickeditBinding extends ViewDataBinding {
  @NonNull
  public final EditText inputEditText;

  @NonNull
  public final TextInputLayout inputLayout;

  protected DialogQuickeditBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText inputEditText, TextInputLayout inputLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.inputEditText = inputEditText;
    this.inputLayout = inputLayout;
  }

  @NonNull
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_quickedit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogQuickeditBinding>inflateInternal(inflater, R.layout.dialog_quickedit, root, attachToRoot, component);
  }

  @NonNull
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_quickedit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogQuickeditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogQuickeditBinding>inflateInternal(inflater, R.layout.dialog_quickedit, null, false, component);
  }

  public static DialogQuickeditBinding bind(@NonNull View view) {
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
  public static DialogQuickeditBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogQuickeditBinding)bind(component, view, R.layout.dialog_quickedit);
  }
}
