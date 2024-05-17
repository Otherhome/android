// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMessageRtpSessionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView indicatorReceived;

  @NonNull
  public final TextView messageBody;

  @NonNull
  public final LinearLayout messageBox;

  protected ItemMessageRtpSessionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView indicatorReceived, TextView messageBody, LinearLayout messageBox) {
    super(_bindingComponent, _root, _localFieldCount);
    this.indicatorReceived = indicatorReceived;
    this.messageBody = messageBody;
    this.messageBox = messageBox;
  }

  @NonNull
  public static ItemMessageRtpSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_message_rtp_session, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMessageRtpSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMessageRtpSessionBinding>inflateInternal(inflater, R.layout.item_message_rtp_session, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMessageRtpSessionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_message_rtp_session, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMessageRtpSessionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMessageRtpSessionBinding>inflateInternal(inflater, R.layout.item_message_rtp_session, null, false, component);
  }

  public static ItemMessageRtpSessionBinding bind(@NonNull View view) {
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
  public static ItemMessageRtpSessionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMessageRtpSessionBinding)bind(component, view, R.layout.item_message_rtp_session);
  }
}