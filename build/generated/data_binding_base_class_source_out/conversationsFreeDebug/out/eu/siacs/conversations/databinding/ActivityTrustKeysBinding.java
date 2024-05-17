// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTrustKeysBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final RelativeLayout buttonBar;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Button disableButton;

  @NonNull
  public final LinearLayout foreignKeys;

  @NonNull
  public final TextView keyErrorGeneral;

  @NonNull
  public final TextView keyErrorHintMutual;

  @NonNull
  public final TextView keyErrorMessage;

  @NonNull
  public final MaterialCardView keyErrorMessageCard;

  @NonNull
  public final TextView keyErrorMessageTitle;

  @NonNull
  public final MaterialCardView ownKeysCard;

  @NonNull
  public final LinearLayout ownKeysDetails;

  @NonNull
  public final TextView ownKeysTitle;

  @NonNull
  public final Button saveButton;

  @NonNull
  public final MaterialToolbar toolbar;

  protected ActivityTrustKeysBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarLayout, RelativeLayout buttonBar, Button cancelButton,
      Button disableButton, LinearLayout foreignKeys, TextView keyErrorGeneral,
      TextView keyErrorHintMutual, TextView keyErrorMessage, MaterialCardView keyErrorMessageCard,
      TextView keyErrorMessageTitle, MaterialCardView ownKeysCard, LinearLayout ownKeysDetails,
      TextView ownKeysTitle, Button saveButton, MaterialToolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.buttonBar = buttonBar;
    this.cancelButton = cancelButton;
    this.disableButton = disableButton;
    this.foreignKeys = foreignKeys;
    this.keyErrorGeneral = keyErrorGeneral;
    this.keyErrorHintMutual = keyErrorHintMutual;
    this.keyErrorMessage = keyErrorMessage;
    this.keyErrorMessageCard = keyErrorMessageCard;
    this.keyErrorMessageTitle = keyErrorMessageTitle;
    this.ownKeysCard = ownKeysCard;
    this.ownKeysDetails = ownKeysDetails;
    this.ownKeysTitle = ownKeysTitle;
    this.saveButton = saveButton;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_trust_keys, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTrustKeysBinding>inflateInternal(inflater, R.layout.activity_trust_keys, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_trust_keys, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTrustKeysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTrustKeysBinding>inflateInternal(inflater, R.layout.activity_trust_keys, null, false, component);
  }

  public static ActivityTrustKeysBinding bind(@NonNull View view) {
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
  public static ActivityTrustKeysBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTrustKeysBinding)bind(component, view, R.layout.activity_trust_keys);
  }
}
