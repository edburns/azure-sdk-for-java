/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package digitaltwins.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An incoming relationship.
 */
public class IncomingRelationship {
    /**
     * A user-provided string representing the id of this relationship, unique
     * in the context of the source digital twin, i.e. sourceId +
     * relationshipId is unique in the context of the service.
     */
    @JsonProperty(value = "$relationshipId")
    private String relationshipId;

    /**
     * The id of the source digital twin.
     */
    @JsonProperty(value = "$sourceId")
    private String sourceId;

    /**
     * The name of the relationship.
     */
    @JsonProperty(value = "$relationshipName")
    private String relationshipName;

    /**
     * Link to the relationship, to be used for deletion.
     */
    @JsonProperty(value = "$relationshipLink")
    private String relationshipLink;

    /**
     * Get a user-provided string representing the id of this relationship, unique in the context of the source digital twin, i.e. sourceId + relationshipId is unique in the context of the service.
     *
     * @return the relationshipId value
     */
    public String relationshipId() {
        return this.relationshipId;
    }

    /**
     * Set a user-provided string representing the id of this relationship, unique in the context of the source digital twin, i.e. sourceId + relationshipId is unique in the context of the service.
     *
     * @param relationshipId the relationshipId value to set
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship withRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
        return this;
    }

    /**
     * Get the id of the source digital twin.
     *
     * @return the sourceId value
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the id of the source digital twin.
     *
     * @param sourceId the sourceId value to set
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the name of the relationship.
     *
     * @return the relationshipName value
     */
    public String relationshipName() {
        return this.relationshipName;
    }

    /**
     * Set the name of the relationship.
     *
     * @param relationshipName the relationshipName value to set
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship withRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
        return this;
    }

    /**
     * Get link to the relationship, to be used for deletion.
     *
     * @return the relationshipLink value
     */
    public String relationshipLink() {
        return this.relationshipLink;
    }

    /**
     * Set link to the relationship, to be used for deletion.
     *
     * @param relationshipLink the relationshipLink value to set
     * @return the IncomingRelationship object itself.
     */
    public IncomingRelationship withRelationshipLink(String relationshipLink) {
        this.relationshipLink = relationshipLink;
        return this;
    }

}