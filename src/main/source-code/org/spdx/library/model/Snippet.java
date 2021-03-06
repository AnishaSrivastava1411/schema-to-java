
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** 
 * The set of bytes in a file. The name of the snippet is the name of the file appended with the byte range in parenthesis (ie: "./file/name(2145:5532)")
 */
public class Snippet extends SpdxItem
{
    private Collection<Pointer> rangeList = new Collection<Pointer>();
    private File snippetFromFile;
    private Collection<SimpleLicensingInfo> licenseInfoInSnippetList = new Collection<SimpleLicensingInfo>();

    Snippet(String Id) {
        super(Id);
    }

    Snippet(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "Snippet";
    }

    /** 
     * Get the list of 'range' element items. This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * 
     * @return list
     */
    public Collection<Pointer> getRangeList() {
        return rangeList;
    }

    /** 
     * Set the list of 'range' element items. This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * 
     * @param list
     */
    public void setRangeList(List<Pointer> list) {
        rangeList = list;
    }

    /** 
     * Get the 'snippetFromFile' element value. File containing the SPDX element (e.g. the file contaning a snippet).
     * 
     * @return value
     */
    public File getSnippetFromFile() {
        return snippetFromFile;
    }

    /** 
     * Set the 'snippetFromFile' element value. File containing the SPDX element (e.g. the file contaning a snippet).
     * 
     * @param snippetFromFile
     */
    public void setSnippetFromFile(File snippetFromFile) {
        this.snippetFromFile = snippetFromFile;
    }

    /** 
     * Get the list of 'licenseInfoInSnippet' element items. Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * @return list
     */
    public Collection<SimpleLicensingInfo> getLicenseInfoInSnippetList() {
        return licenseInfoInSnippetList;
    }

    /** 
     * Set the list of 'licenseInfoInSnippet' element items. Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * @param list
     */
    public void setLicenseInfoInSnippetList(List<SimpleLicensingInfo> list) {
        licenseInfoInSnippetList = list;
    }
}
