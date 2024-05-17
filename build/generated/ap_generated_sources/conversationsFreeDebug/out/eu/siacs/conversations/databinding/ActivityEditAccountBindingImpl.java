package eu.siacs.conversations.databinding;
import eu.siacs.conversations.R;
import eu.siacs.conversations.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditAccountBindingImpl extends ActivityEditAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.account_main_layout, 3);
        sViewsWithIds.put(R.id.editor, 4);
        sViewsWithIds.put(R.id.avater, 5);
        sViewsWithIds.put(R.id.account_jid_layout, 6);
        sViewsWithIds.put(R.id.account_jid, 7);
        sViewsWithIds.put(R.id.account_password_layout, 8);
        sViewsWithIds.put(R.id.account_password, 9);
        sViewsWithIds.put(R.id.name_port, 10);
        sViewsWithIds.put(R.id.hostname_layout, 11);
        sViewsWithIds.put(R.id.hostname, 12);
        sViewsWithIds.put(R.id.port_layout, 13);
        sViewsWithIds.put(R.id.port, 14);
        sViewsWithIds.put(R.id.account_register_new, 15);
        sViewsWithIds.put(R.id.os_optimization, 16);
        sViewsWithIds.put(R.id.os_optimization_headline, 17);
        sViewsWithIds.put(R.id.os_optimization_body, 18);
        sViewsWithIds.put(R.id.os_optimization_disable, 19);
        sViewsWithIds.put(R.id.stats, 20);
        sViewsWithIds.put(R.id.session_est, 21);
        sViewsWithIds.put(R.id.server_info_more, 22);
        sViewsWithIds.put(R.id.server_info_pep, 23);
        sViewsWithIds.put(R.id.server_info_blocking, 24);
        sViewsWithIds.put(R.id.server_info_sm, 25);
        sViewsWithIds.put(R.id.server_info_external_service, 26);
        sViewsWithIds.put(R.id.server_info_roster_version, 27);
        sViewsWithIds.put(R.id.server_info_carbons, 28);
        sViewsWithIds.put(R.id.server_info_mam, 29);
        sViewsWithIds.put(R.id.server_info_csi, 30);
        sViewsWithIds.put(R.id.push_row, 31);
        sViewsWithIds.put(R.id.server_info_push, 32);
        sViewsWithIds.put(R.id.server_info_http_upload_description, 33);
        sViewsWithIds.put(R.id.server_info_http_upload, 34);
        sViewsWithIds.put(R.id.your_name_box, 35);
        sViewsWithIds.put(R.id.your_name, 36);
        sViewsWithIds.put(R.id.your_name_desc, 37);
        sViewsWithIds.put(R.id.action_edit_your_name, 38);
        sViewsWithIds.put(R.id.pgp_fingerprint_box, 39);
        sViewsWithIds.put(R.id.pgp_fingerprint, 40);
        sViewsWithIds.put(R.id.pgp_fingerprint_desc, 41);
        sViewsWithIds.put(R.id.action_delete_pgp, 42);
        sViewsWithIds.put(R.id.axolotl_fingerprint_box, 43);
        sViewsWithIds.put(R.id.axolotl_fingerprint, 44);
        sViewsWithIds.put(R.id.own_fingerprint_desc, 45);
        sViewsWithIds.put(R.id.axolotl_actions, 46);
        sViewsWithIds.put(R.id.show_qr_code_button, 47);
        sViewsWithIds.put(R.id.action_regenerate_axolotl_key, 48);
        sViewsWithIds.put(R.id.other_device_keys_card, 49);
        sViewsWithIds.put(R.id.other_device_keys_title, 50);
        sViewsWithIds.put(R.id.other_device_keys, 51);
        sViewsWithIds.put(R.id.unverified_warning, 52);
        sViewsWithIds.put(R.id.scan_button, 53);
        sViewsWithIds.put(R.id.clear_devices, 54);
        sViewsWithIds.put(R.id.button_bar, 55);
        sViewsWithIds.put(R.id.cancel_button, 56);
        sViewsWithIds.put(R.id.save_button, 57);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 58, sIncludes, sViewsWithIds));
    }
    private ActivityEditAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[3]
            , (eu.siacs.conversations.ui.widget.TextInputEditText) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (android.widget.CheckBox) bindings[15]
            , (android.widget.ImageButton) bindings[42]
            , (android.widget.ImageButton) bindings[38]
            , (android.widget.ImageButton) bindings[48]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[46]
            , (android.widget.TextView) bindings[44]
            , (android.widget.RelativeLayout) bindings[43]
            , (android.widget.RelativeLayout) bindings[55]
            , (android.widget.Button) bindings[56]
            , (android.widget.Button) bindings[54]
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (android.widget.EditText) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.Button) bindings[19]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[51]
            , (com.google.android.material.card.MaterialCardView) bindings[49]
            , (android.widget.TextView) bindings[50]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[40]
            , (android.widget.RelativeLayout) bindings[39]
            , (android.widget.TextView) bindings[41]
            , (android.widget.EditText) bindings[14]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (android.widget.TableRow) bindings[31]
            , (android.widget.Button) bindings[57]
            , (android.widget.Button) bindings[53]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TableLayout) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ImageButton) bindings[47]
            , (com.google.android.material.card.MaterialCardView) bindings[20]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[2]
            , (android.widget.LinearLayout) bindings[52]
            , (android.widget.TextView) bindings[36]
            , (android.widget.RelativeLayout) bindings[35]
            , (android.widget.TextView) bindings[37]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}