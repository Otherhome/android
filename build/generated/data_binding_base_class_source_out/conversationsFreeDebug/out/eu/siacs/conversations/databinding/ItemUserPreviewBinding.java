// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemUserPreviewBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView avatar;

  protected ItemUserPreviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RoundedImageView avatar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
  }

  @NonNull
  public static ItemUserPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_user_preview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemUserPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemUserPreviewBinding>inflateInternal(inflater, R.layout.item_user_preview, root, attachToRoot, component);
  }

  @NonNull
  public static ItemUserPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_user_preview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemUserPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemUserPreviewBinding>inflateInternal(inflater, R.layout.item_user_preview, null, false, component);
  }

  public static ItemUserPreviewBinding bind(@NonNull View view) {
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
  public static ItemUserPreviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemUserPreviewBinding)bind(component, view, R.layout.item_user_preview);
  }
}