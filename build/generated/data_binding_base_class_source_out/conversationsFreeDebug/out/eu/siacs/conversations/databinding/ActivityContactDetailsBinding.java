// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.makeramen.roundedimageview.RoundedImageView;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityContactDetailsBinding extends ViewDataBinding {
  @NonNull
  public final Button addContactButton;

  @NonNull
  public final TextView detailsAccount;

  @NonNull
  public final RoundedImageView detailsContactBadge;

  @NonNull
  public final LinearLayout detailsContactKeys;

  @NonNull
  public final TextView detailsContactjid;

  @NonNull
  public final LinearLayout detailsJidbox;

  @NonNull
  public final TextView detailsLastseen;

  @NonNull
  public final LinearLayout detailsMainLayout;

  @NonNull
  public final CheckBox detailsReceivePresence;

  @NonNull
  public final CheckBox detailsSendPresence;

  @NonNull
  public final Flow flowWidget;

  @NonNull
  public final MaterialCardView keysWrapper;

  @NonNull
  public final RecyclerView media;

  @NonNull
  public final MaterialCardView mediaWrapper;

  @NonNull
  public final Button scanButton;

  @NonNull
  public final Button showInactiveDevices;

  @NonNull
  public final Button showMedia;

  @NonNull
  public final TextView statusMessage;

  @NonNull
  public final ConstraintLayout tags;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final LinearLayout unverifiedWarning;

  protected ActivityContactDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button addContactButton, TextView detailsAccount,
      RoundedImageView detailsContactBadge, LinearLayout detailsContactKeys,
      TextView detailsContactjid, LinearLayout detailsJidbox, TextView detailsLastseen,
      LinearLayout detailsMainLayout, CheckBox detailsReceivePresence, CheckBox detailsSendPresence,
      Flow flowWidget, MaterialCardView keysWrapper, RecyclerView media,
      MaterialCardView mediaWrapper, Button scanButton, Button showInactiveDevices,
      Button showMedia, TextView statusMessage, ConstraintLayout tags, MaterialToolbar toolbar,
      LinearLayout unverifiedWarning) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addContactButton = addContactButton;
    this.detailsAccount = detailsAccount;
    this.detailsContactBadge = detailsContactBadge;
    this.detailsContactKeys = detailsContactKeys;
    this.detailsContactjid = detailsContactjid;
    this.detailsJidbox = detailsJidbox;
    this.detailsLastseen = detailsLastseen;
    this.detailsMainLayout = detailsMainLayout;
    this.detailsReceivePresence = detailsReceivePresence;
    this.detailsSendPresence = detailsSendPresence;
    this.flowWidget = flowWidget;
    this.keysWrapper = keysWrapper;
    this.media = media;
    this.mediaWrapper = mediaWrapper;
    this.scanButton = scanButton;
    this.showInactiveDevices = showInactiveDevices;
    this.showMedia = showMedia;
    this.statusMessage = statusMessage;
    this.tags = tags;
    this.toolbar = toolbar;
    this.unverifiedWarning = unverifiedWarning;
  }

  @NonNull
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_contact_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityContactDetailsBinding>inflateInternal(inflater, R.layout.activity_contact_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_contact_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityContactDetailsBinding>inflateInternal(inflater, R.layout.activity_contact_details, null, false, component);
  }

  public static ActivityContactDetailsBinding bind(@NonNull View view) {
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
  public static ActivityContactDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityContactDetailsBinding)bind(component, view, R.layout.activity_contact_details);
  }
}
