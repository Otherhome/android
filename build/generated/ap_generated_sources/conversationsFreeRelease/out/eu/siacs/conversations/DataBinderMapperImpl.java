package eu.siacs.conversations;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import eu.siacs.conversations.databinding.ActivityAboutBindingImpl;
import eu.siacs.conversations.databinding.ActivityChangePasswordBindingImpl;
import eu.siacs.conversations.databinding.ActivityChannelDiscoveryBindingImpl;
import eu.siacs.conversations.databinding.ActivityChooseContactBindingImpl;
import eu.siacs.conversations.databinding.ActivityContactDetailsBindingImpl;
import eu.siacs.conversations.databinding.ActivityConversationsBindingImpl;
import eu.siacs.conversations.databinding.ActivityConversationsBindingW945dpImpl;
import eu.siacs.conversations.databinding.ActivityEasyInviteBindingImpl;
import eu.siacs.conversations.databinding.ActivityEditAccountBindingImpl;
import eu.siacs.conversations.databinding.ActivityImportBackupBindingImpl;
import eu.siacs.conversations.databinding.ActivityMagicCreateBindingImpl;
import eu.siacs.conversations.databinding.ActivityManageAccountsBindingImpl;
import eu.siacs.conversations.databinding.ActivityMediaBrowserBindingImpl;
import eu.siacs.conversations.databinding.ActivityMucDetailsBindingImpl;
import eu.siacs.conversations.databinding.ActivityMucUsersBindingImpl;
import eu.siacs.conversations.databinding.ActivityPickServerBindingImpl;
import eu.siacs.conversations.databinding.ActivityPublishProfilePictureBindingImpl;
import eu.siacs.conversations.databinding.ActivityRecordingBindingImpl;
import eu.siacs.conversations.databinding.ActivityRtpSessionBindingImpl;
import eu.siacs.conversations.databinding.ActivitySearchBindingImpl;
import eu.siacs.conversations.databinding.ActivitySettingsBindingImpl;
import eu.siacs.conversations.databinding.ActivityShareLocationBindingImpl;
import eu.siacs.conversations.databinding.ActivityShareWithBindingImpl;
import eu.siacs.conversations.databinding.ActivityShowLocationBindingImpl;
import eu.siacs.conversations.databinding.ActivityStartConversationBindingImpl;
import eu.siacs.conversations.databinding.ActivityTrustKeysBindingImpl;
import eu.siacs.conversations.databinding.ActivityUriHandlerBindingImpl;
import eu.siacs.conversations.databinding.ActivityWelcomeBindingImpl;
import eu.siacs.conversations.databinding.ContactKeyBindingImpl;
import eu.siacs.conversations.databinding.DialogBlockContactBindingImpl;
import eu.siacs.conversations.databinding.DialogCreateConferenceBindingImpl;
import eu.siacs.conversations.databinding.DialogCreatePublicChannelBindingImpl;
import eu.siacs.conversations.databinding.DialogEnterJidBindingImpl;
import eu.siacs.conversations.databinding.DialogEnterPasswordBindingImpl;
import eu.siacs.conversations.databinding.DialogJoinConferenceBindingImpl;
import eu.siacs.conversations.databinding.DialogPresenceBindingImpl;
import eu.siacs.conversations.databinding.DialogQuickeditBindingImpl;
import eu.siacs.conversations.databinding.FragmentConversationBindingImpl;
import eu.siacs.conversations.databinding.FragmentConversationsOverviewBindingImpl;
import eu.siacs.conversations.databinding.ItemAccountBindingImpl;
import eu.siacs.conversations.databinding.ItemChannelDiscoveryBindingImpl;
import eu.siacs.conversations.databinding.ItemContactBindingImpl;
import eu.siacs.conversations.databinding.ItemConversationBindingImpl;
import eu.siacs.conversations.databinding.ItemMediaBindingImpl;
import eu.siacs.conversations.databinding.ItemMediaPreviewBindingImpl;
import eu.siacs.conversations.databinding.ItemMessageContentBindingImpl;
import eu.siacs.conversations.databinding.ItemMessageDateBubbleBindingImpl;
import eu.siacs.conversations.databinding.ItemMessageReceivedBindingImpl;
import eu.siacs.conversations.databinding.ItemMessageRtpSessionBindingImpl;
import eu.siacs.conversations.databinding.ItemMessageSentBindingImpl;
import eu.siacs.conversations.databinding.ItemMessageStatusBindingImpl;
import eu.siacs.conversations.databinding.ItemUserPreviewBindingImpl;
import eu.siacs.conversations.databinding.KeysCardBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUT = 1;

  private static final int LAYOUT_ACTIVITYCHANGEPASSWORD = 2;

  private static final int LAYOUT_ACTIVITYCHANNELDISCOVERY = 3;

  private static final int LAYOUT_ACTIVITYCHOOSECONTACT = 4;

  private static final int LAYOUT_ACTIVITYCONTACTDETAILS = 5;

  private static final int LAYOUT_ACTIVITYCONVERSATIONS = 6;

  private static final int LAYOUT_ACTIVITYEASYINVITE = 7;

  private static final int LAYOUT_ACTIVITYEDITACCOUNT = 8;

  private static final int LAYOUT_ACTIVITYIMPORTBACKUP = 9;

  private static final int LAYOUT_ACTIVITYMAGICCREATE = 10;

  private static final int LAYOUT_ACTIVITYMANAGEACCOUNTS = 11;

  private static final int LAYOUT_ACTIVITYMEDIABROWSER = 12;

  private static final int LAYOUT_ACTIVITYMUCDETAILS = 13;

  private static final int LAYOUT_ACTIVITYMUCUSERS = 14;

  private static final int LAYOUT_ACTIVITYPICKSERVER = 15;

  private static final int LAYOUT_ACTIVITYPUBLISHPROFILEPICTURE = 16;

  private static final int LAYOUT_ACTIVITYRECORDING = 17;

  private static final int LAYOUT_ACTIVITYRTPSESSION = 18;

  private static final int LAYOUT_ACTIVITYSEARCH = 19;

  private static final int LAYOUT_ACTIVITYSETTINGS = 20;

  private static final int LAYOUT_ACTIVITYSHARELOCATION = 21;

  private static final int LAYOUT_ACTIVITYSHAREWITH = 22;

  private static final int LAYOUT_ACTIVITYSHOWLOCATION = 23;

  private static final int LAYOUT_ACTIVITYSTARTCONVERSATION = 24;

  private static final int LAYOUT_ACTIVITYTRUSTKEYS = 25;

  private static final int LAYOUT_ACTIVITYURIHANDLER = 26;

  private static final int LAYOUT_ACTIVITYWELCOME = 27;

  private static final int LAYOUT_CONTACTKEY = 28;

  private static final int LAYOUT_DIALOGBLOCKCONTACT = 29;

  private static final int LAYOUT_DIALOGCREATECONFERENCE = 30;

  private static final int LAYOUT_DIALOGCREATEPUBLICCHANNEL = 31;

  private static final int LAYOUT_DIALOGENTERJID = 32;

  private static final int LAYOUT_DIALOGENTERPASSWORD = 33;

  private static final int LAYOUT_DIALOGJOINCONFERENCE = 34;

  private static final int LAYOUT_DIALOGPRESENCE = 35;

  private static final int LAYOUT_DIALOGQUICKEDIT = 36;

  private static final int LAYOUT_FRAGMENTCONVERSATION = 37;

  private static final int LAYOUT_FRAGMENTCONVERSATIONSOVERVIEW = 38;

  private static final int LAYOUT_ITEMACCOUNT = 39;

  private static final int LAYOUT_ITEMCHANNELDISCOVERY = 40;

  private static final int LAYOUT_ITEMCONTACT = 41;

  private static final int LAYOUT_ITEMCONVERSATION = 42;

  private static final int LAYOUT_ITEMMEDIA = 43;

  private static final int LAYOUT_ITEMMEDIAPREVIEW = 44;

  private static final int LAYOUT_ITEMMESSAGECONTENT = 45;

  private static final int LAYOUT_ITEMMESSAGEDATEBUBBLE = 46;

  private static final int LAYOUT_ITEMMESSAGERECEIVED = 47;

  private static final int LAYOUT_ITEMMESSAGERTPSESSION = 48;

  private static final int LAYOUT_ITEMMESSAGESENT = 49;

  private static final int LAYOUT_ITEMMESSAGESTATUS = 50;

  private static final int LAYOUT_ITEMUSERPREVIEW = 51;

  private static final int LAYOUT_KEYSCARD = 52;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(52);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_about, LAYOUT_ACTIVITYABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_change_password, LAYOUT_ACTIVITYCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_channel_discovery, LAYOUT_ACTIVITYCHANNELDISCOVERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_choose_contact, LAYOUT_ACTIVITYCHOOSECONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_contact_details, LAYOUT_ACTIVITYCONTACTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_conversations, LAYOUT_ACTIVITYCONVERSATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_easy_invite, LAYOUT_ACTIVITYEASYINVITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_edit_account, LAYOUT_ACTIVITYEDITACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_import_backup, LAYOUT_ACTIVITYIMPORTBACKUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_magic_create, LAYOUT_ACTIVITYMAGICCREATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_manage_accounts, LAYOUT_ACTIVITYMANAGEACCOUNTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_media_browser, LAYOUT_ACTIVITYMEDIABROWSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_muc_details, LAYOUT_ACTIVITYMUCDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_muc_users, LAYOUT_ACTIVITYMUCUSERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_pick_server, LAYOUT_ACTIVITYPICKSERVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_publish_profile_picture, LAYOUT_ACTIVITYPUBLISHPROFILEPICTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_recording, LAYOUT_ACTIVITYRECORDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_rtp_session, LAYOUT_ACTIVITYRTPSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_settings, LAYOUT_ACTIVITYSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_share_location, LAYOUT_ACTIVITYSHARELOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_share_with, LAYOUT_ACTIVITYSHAREWITH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_show_location, LAYOUT_ACTIVITYSHOWLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_start_conversation, LAYOUT_ACTIVITYSTARTCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_trust_keys, LAYOUT_ACTIVITYTRUSTKEYS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_uri_handler, LAYOUT_ACTIVITYURIHANDLER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.activity_welcome, LAYOUT_ACTIVITYWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.contact_key, LAYOUT_CONTACTKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_block_contact, LAYOUT_DIALOGBLOCKCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_create_conference, LAYOUT_DIALOGCREATECONFERENCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_create_public_channel, LAYOUT_DIALOGCREATEPUBLICCHANNEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_enter_jid, LAYOUT_DIALOGENTERJID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_enter_password, LAYOUT_DIALOGENTERPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_join_conference, LAYOUT_DIALOGJOINCONFERENCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_presence, LAYOUT_DIALOGPRESENCE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.dialog_quickedit, LAYOUT_DIALOGQUICKEDIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.fragment_conversation, LAYOUT_FRAGMENTCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.fragment_conversations_overview, LAYOUT_FRAGMENTCONVERSATIONSOVERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_account, LAYOUT_ITEMACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_channel_discovery, LAYOUT_ITEMCHANNELDISCOVERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_contact, LAYOUT_ITEMCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_conversation, LAYOUT_ITEMCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_media, LAYOUT_ITEMMEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_media_preview, LAYOUT_ITEMMEDIAPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_message_content, LAYOUT_ITEMMESSAGECONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_message_date_bubble, LAYOUT_ITEMMESSAGEDATEBUBBLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_message_received, LAYOUT_ITEMMESSAGERECEIVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_message_rtp_session, LAYOUT_ITEMMESSAGERTPSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_message_sent, LAYOUT_ITEMMESSAGESENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_message_status, LAYOUT_ITEMMESSAGESTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.item_user_preview, LAYOUT_ITEMUSERPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.siacs.conversations.R.layout.keys_card, LAYOUT_KEYSCARD);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYABOUT: {
        if ("layout/activity_about_0".equals(tag)) {
          return new ActivityAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_about is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHANGEPASSWORD: {
        if ("layout/activity_change_password_0".equals(tag)) {
          return new ActivityChangePasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_change_password is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHANNELDISCOVERY: {
        if ("layout/activity_channel_discovery_0".equals(tag)) {
          return new ActivityChannelDiscoveryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_channel_discovery is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHOOSECONTACT: {
        if ("layout/activity_choose_contact_0".equals(tag)) {
          return new ActivityChooseContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_choose_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCONTACTDETAILS: {
        if ("layout/activity_contact_details_0".equals(tag)) {
          return new ActivityContactDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_contact_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCONVERSATIONS: {
        if ("layout-w945dp/activity_conversations_0".equals(tag)) {
          return new ActivityConversationsBindingW945dpImpl(component, view);
        }
        if ("layout/activity_conversations_0".equals(tag)) {
          return new ActivityConversationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_conversations is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEASYINVITE: {
        if ("layout/activity_easy_invite_0".equals(tag)) {
          return new ActivityEasyInviteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_easy_invite is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEDITACCOUNT: {
        if ("layout/activity_edit_account_0".equals(tag)) {
          return new ActivityEditAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_edit_account is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYIMPORTBACKUP: {
        if ("layout/activity_import_backup_0".equals(tag)) {
          return new ActivityImportBackupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_import_backup is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAGICCREATE: {
        if ("layout/activity_magic_create_0".equals(tag)) {
          return new ActivityMagicCreateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_magic_create is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMANAGEACCOUNTS: {
        if ("layout/activity_manage_accounts_0".equals(tag)) {
          return new ActivityManageAccountsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_manage_accounts is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMEDIABROWSER: {
        if ("layout/activity_media_browser_0".equals(tag)) {
          return new ActivityMediaBrowserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_media_browser is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMUCDETAILS: {
        if ("layout/activity_muc_details_0".equals(tag)) {
          return new ActivityMucDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_muc_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMUCUSERS: {
        if ("layout/activity_muc_users_0".equals(tag)) {
          return new ActivityMucUsersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_muc_users is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPICKSERVER: {
        if ("layout/activity_pick_server_0".equals(tag)) {
          return new ActivityPickServerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_pick_server is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPUBLISHPROFILEPICTURE: {
        if ("layout/activity_publish_profile_picture_0".equals(tag)) {
          return new ActivityPublishProfilePictureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_publish_profile_picture is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRECORDING: {
        if ("layout/activity_recording_0".equals(tag)) {
          return new ActivityRecordingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_recording is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRTPSESSION: {
        if ("layout/activity_rtp_session_0".equals(tag)) {
          return new ActivityRtpSessionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_rtp_session is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSEARCH: {
        if ("layout/activity_search_0".equals(tag)) {
          return new ActivitySearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSETTINGS: {
        if ("layout/activity_settings_0".equals(tag)) {
          return new ActivitySettingsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_settings is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSHARELOCATION: {
        if ("layout/activity_share_location_0".equals(tag)) {
          return new ActivityShareLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_share_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSHAREWITH: {
        if ("layout/activity_share_with_0".equals(tag)) {
          return new ActivityShareWithBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_share_with is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSHOWLOCATION: {
        if ("layout/activity_show_location_0".equals(tag)) {
          return new ActivityShowLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_show_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSTARTCONVERSATION: {
        if ("layout/activity_start_conversation_0".equals(tag)) {
          return new ActivityStartConversationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_start_conversation is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTRUSTKEYS: {
        if ("layout/activity_trust_keys_0".equals(tag)) {
          return new ActivityTrustKeysBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_trust_keys is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYURIHANDLER: {
        if ("layout/activity_uri_handler_0".equals(tag)) {
          return new ActivityUriHandlerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_uri_handler is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWELCOME: {
        if ("layout/activity_welcome_0".equals(tag)) {
          return new ActivityWelcomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_welcome is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTKEY: {
        if ("layout/contact_key_0".equals(tag)) {
          return new ContactKeyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_key is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGBLOCKCONTACT: {
        if ("layout/dialog_block_contact_0".equals(tag)) {
          return new DialogBlockContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_block_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCREATECONFERENCE: {
        if ("layout/dialog_create_conference_0".equals(tag)) {
          return new DialogCreateConferenceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_create_conference is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCREATEPUBLICCHANNEL: {
        if ("layout/dialog_create_public_channel_0".equals(tag)) {
          return new DialogCreatePublicChannelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_create_public_channel is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGENTERJID: {
        if ("layout/dialog_enter_jid_0".equals(tag)) {
          return new DialogEnterJidBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_enter_jid is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGENTERPASSWORD: {
        if ("layout/dialog_enter_password_0".equals(tag)) {
          return new DialogEnterPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_enter_password is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGJOINCONFERENCE: {
        if ("layout/dialog_join_conference_0".equals(tag)) {
          return new DialogJoinConferenceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_join_conference is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGPRESENCE: {
        if ("layout/dialog_presence_0".equals(tag)) {
          return new DialogPresenceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_presence is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGQUICKEDIT: {
        if ("layout/dialog_quickedit_0".equals(tag)) {
          return new DialogQuickeditBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_quickedit is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONVERSATION: {
        if ("layout/fragment_conversation_0".equals(tag)) {
          return new FragmentConversationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_conversation is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONVERSATIONSOVERVIEW: {
        if ("layout/fragment_conversations_overview_0".equals(tag)) {
          return new FragmentConversationsOverviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_conversations_overview is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMACCOUNT: {
        if ("layout/item_account_0".equals(tag)) {
          return new ItemAccountBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_account is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCHANNELDISCOVERY: {
        if ("layout/item_channel_discovery_0".equals(tag)) {
          return new ItemChannelDiscoveryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_channel_discovery is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCONTACT: {
        if ("layout/item_contact_0".equals(tag)) {
          return new ItemContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCONVERSATION: {
        if ("layout/item_conversation_0".equals(tag)) {
          return new ItemConversationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_conversation is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMEDIA: {
        if ("layout/item_media_0".equals(tag)) {
          return new ItemMediaBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_media is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMEDIAPREVIEW: {
        if ("layout/item_media_preview_0".equals(tag)) {
          return new ItemMediaPreviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_media_preview is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMESSAGECONTENT: {
        if ("layout/item_message_content_0".equals(tag)) {
          return new ItemMessageContentBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for item_message_content is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMESSAGEDATEBUBBLE: {
        if ("layout/item_message_date_bubble_0".equals(tag)) {
          return new ItemMessageDateBubbleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_message_date_bubble is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMESSAGERECEIVED: {
        if ("layout/item_message_received_0".equals(tag)) {
          return new ItemMessageReceivedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_message_received is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMESSAGERTPSESSION: {
        if ("layout/item_message_rtp_session_0".equals(tag)) {
          return new ItemMessageRtpSessionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_message_rtp_session is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMESSAGESENT: {
        if ("layout/item_message_sent_0".equals(tag)) {
          return new ItemMessageSentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_message_sent is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMESSAGESTATUS: {
        if ("layout/item_message_status_0".equals(tag)) {
          return new ItemMessageStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_message_status is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMUSERPREVIEW: {
        if ("layout/item_user_preview_0".equals(tag)) {
          return new ItemUserPreviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_user_preview is invalid. Received: " + tag);
      }
      case  LAYOUT_KEYSCARD: {
        if ("layout/keys_card_0".equals(tag)) {
          return new KeysCardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for keys_card is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_ITEMMESSAGECONTENT: {
          if("layout/item_message_content_0".equals(tag)) {
            return new ItemMessageContentBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for item_message_content is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(53);

    static {
      sKeys.put("layout/activity_about_0", eu.siacs.conversations.R.layout.activity_about);
      sKeys.put("layout/activity_change_password_0", eu.siacs.conversations.R.layout.activity_change_password);
      sKeys.put("layout/activity_channel_discovery_0", eu.siacs.conversations.R.layout.activity_channel_discovery);
      sKeys.put("layout/activity_choose_contact_0", eu.siacs.conversations.R.layout.activity_choose_contact);
      sKeys.put("layout/activity_contact_details_0", eu.siacs.conversations.R.layout.activity_contact_details);
      sKeys.put("layout-w945dp/activity_conversations_0", eu.siacs.conversations.R.layout.activity_conversations);
      sKeys.put("layout/activity_conversations_0", eu.siacs.conversations.R.layout.activity_conversations);
      sKeys.put("layout/activity_easy_invite_0", eu.siacs.conversations.R.layout.activity_easy_invite);
      sKeys.put("layout/activity_edit_account_0", eu.siacs.conversations.R.layout.activity_edit_account);
      sKeys.put("layout/activity_import_backup_0", eu.siacs.conversations.R.layout.activity_import_backup);
      sKeys.put("layout/activity_magic_create_0", eu.siacs.conversations.R.layout.activity_magic_create);
      sKeys.put("layout/activity_manage_accounts_0", eu.siacs.conversations.R.layout.activity_manage_accounts);
      sKeys.put("layout/activity_media_browser_0", eu.siacs.conversations.R.layout.activity_media_browser);
      sKeys.put("layout/activity_muc_details_0", eu.siacs.conversations.R.layout.activity_muc_details);
      sKeys.put("layout/activity_muc_users_0", eu.siacs.conversations.R.layout.activity_muc_users);
      sKeys.put("layout/activity_pick_server_0", eu.siacs.conversations.R.layout.activity_pick_server);
      sKeys.put("layout/activity_publish_profile_picture_0", eu.siacs.conversations.R.layout.activity_publish_profile_picture);
      sKeys.put("layout/activity_recording_0", eu.siacs.conversations.R.layout.activity_recording);
      sKeys.put("layout/activity_rtp_session_0", eu.siacs.conversations.R.layout.activity_rtp_session);
      sKeys.put("layout/activity_search_0", eu.siacs.conversations.R.layout.activity_search);
      sKeys.put("layout/activity_settings_0", eu.siacs.conversations.R.layout.activity_settings);
      sKeys.put("layout/activity_share_location_0", eu.siacs.conversations.R.layout.activity_share_location);
      sKeys.put("layout/activity_share_with_0", eu.siacs.conversations.R.layout.activity_share_with);
      sKeys.put("layout/activity_show_location_0", eu.siacs.conversations.R.layout.activity_show_location);
      sKeys.put("layout/activity_start_conversation_0", eu.siacs.conversations.R.layout.activity_start_conversation);
      sKeys.put("layout/activity_trust_keys_0", eu.siacs.conversations.R.layout.activity_trust_keys);
      sKeys.put("layout/activity_uri_handler_0", eu.siacs.conversations.R.layout.activity_uri_handler);
      sKeys.put("layout/activity_welcome_0", eu.siacs.conversations.R.layout.activity_welcome);
      sKeys.put("layout/contact_key_0", eu.siacs.conversations.R.layout.contact_key);
      sKeys.put("layout/dialog_block_contact_0", eu.siacs.conversations.R.layout.dialog_block_contact);
      sKeys.put("layout/dialog_create_conference_0", eu.siacs.conversations.R.layout.dialog_create_conference);
      sKeys.put("layout/dialog_create_public_channel_0", eu.siacs.conversations.R.layout.dialog_create_public_channel);
      sKeys.put("layout/dialog_enter_jid_0", eu.siacs.conversations.R.layout.dialog_enter_jid);
      sKeys.put("layout/dialog_enter_password_0", eu.siacs.conversations.R.layout.dialog_enter_password);
      sKeys.put("layout/dialog_join_conference_0", eu.siacs.conversations.R.layout.dialog_join_conference);
      sKeys.put("layout/dialog_presence_0", eu.siacs.conversations.R.layout.dialog_presence);
      sKeys.put("layout/dialog_quickedit_0", eu.siacs.conversations.R.layout.dialog_quickedit);
      sKeys.put("layout/fragment_conversation_0", eu.siacs.conversations.R.layout.fragment_conversation);
      sKeys.put("layout/fragment_conversations_overview_0", eu.siacs.conversations.R.layout.fragment_conversations_overview);
      sKeys.put("layout/item_account_0", eu.siacs.conversations.R.layout.item_account);
      sKeys.put("layout/item_channel_discovery_0", eu.siacs.conversations.R.layout.item_channel_discovery);
      sKeys.put("layout/item_contact_0", eu.siacs.conversations.R.layout.item_contact);
      sKeys.put("layout/item_conversation_0", eu.siacs.conversations.R.layout.item_conversation);
      sKeys.put("layout/item_media_0", eu.siacs.conversations.R.layout.item_media);
      sKeys.put("layout/item_media_preview_0", eu.siacs.conversations.R.layout.item_media_preview);
      sKeys.put("layout/item_message_content_0", eu.siacs.conversations.R.layout.item_message_content);
      sKeys.put("layout/item_message_date_bubble_0", eu.siacs.conversations.R.layout.item_message_date_bubble);
      sKeys.put("layout/item_message_received_0", eu.siacs.conversations.R.layout.item_message_received);
      sKeys.put("layout/item_message_rtp_session_0", eu.siacs.conversations.R.layout.item_message_rtp_session);
      sKeys.put("layout/item_message_sent_0", eu.siacs.conversations.R.layout.item_message_sent);
      sKeys.put("layout/item_message_status_0", eu.siacs.conversations.R.layout.item_message_status);
      sKeys.put("layout/item_user_preview_0", eu.siacs.conversations.R.layout.item_user_preview);
      sKeys.put("layout/keys_card_0", eu.siacs.conversations.R.layout.keys_card);
    }
  }
}
