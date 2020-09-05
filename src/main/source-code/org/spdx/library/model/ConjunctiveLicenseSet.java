
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** 
 * A ConjunctiveLicenseSet represents a set of licensing information all of which apply.
 */
public class ConjunctiveLicenseSet extends AnyLicenseInfo
{
    private Collection<AnyLicenseInfo> memberList = new Collection<AnyLicenseInfo>();

    ConjunctiveLicenseSet(String Id) {
        super(Id);
    }

    ConjunctiveLicenseSet(IModelStore modelStore, String documentUri,
            String id, ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "ConjunctiveLicenseSet";
    }

    /** 
     * Get the list of 'member' element items. A license, or other licensing information, that is a member of the subject license set.
     * 
     * @return list
     */
    public Collection<AnyLicenseInfo> getMemberList() {
        return memberList;
    }

    /** 
     * Set the list of 'member' element items. A license, or other licensing information, that is a member of the subject license set.
     * 
     * @param list
     */
    public void setMemberList() {
        memberList = list;
    }
}
