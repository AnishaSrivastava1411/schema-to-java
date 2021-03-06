
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** 
 * An SpdxElement is any thing described in SPDX, either a document or an SpdxItem. SpdxElements can be related to other SpdxElements.
 */
public class SpdxElement extends ModelObject
{
    private String name;
    private String comment;
    private Collection<Relationship> relationshipList = new Collection<Relationship>();
    private Collection<Annotation> annotationList = new Collection<Annotation>();
    private String SPDXID;

    SpdxElement(String Id) {
        super(Id);
    }

    SpdxElement(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "SpdxElement";
    }

    /** 
     * Get the 'name' element value. Identify name of this SpdxElement.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Identify name of this SpdxElement.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'comment' element value.
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'comment' element value.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the list of 'relationship' element items. Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument.
     * 
     * @return list
     */
    public Collection<Relationship> getRelationshipList() {
        return relationshipList;
    }

    /** 
     * Set the list of 'relationship' element items. Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument.
     * 
     * @param list
     */
    public void setRelationshipList(List<Relationship> list) {
        relationshipList = list;
    }

    /** 
     * Get the list of 'annotation' element items. Provide additional information about an SpdxElement.
     * 
     * @return list
     */
    public Collection<Annotation> getAnnotationList() {
        return annotationList;
    }

    /** 
     * Set the list of 'annotation' element items. Provide additional information about an SpdxElement.
     * 
     * @param list
     */
    public void setAnnotationList(List<Annotation> list) {
        annotationList = list;
    }

    /** 
     * Get the 'SPDXID' element value.
     * 
     * @return value
     */
    public String getSPDXID() {
        return SPDXID;
    }

    /** 
     * Set the 'SPDXID' element value.
     * 
     * @param SPDXID
     */
    public void setSPDXID(String SPDXID) {
        this.SPDXID = SPDXID;
    }
}
