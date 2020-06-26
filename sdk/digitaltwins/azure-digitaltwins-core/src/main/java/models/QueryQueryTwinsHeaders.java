/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package digitaltwins.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for QueryTwins operation.
 */
public class QueryQueryTwinsHeaders {
    /**
     * The query charge.
     */
    @JsonProperty(value = "query-charge")
    private Double queryCharge;

    /**
     * Get the query charge.
     *
     * @return the queryCharge value
     */
    public Double queryCharge() {
        return this.queryCharge;
    }

    /**
     * Set the query charge.
     *
     * @param queryCharge the queryCharge value to set
     * @return the QueryQueryTwinsHeaders object itself.
     */
    public QueryQueryTwinsHeaders withQueryCharge(Double queryCharge) {
        this.queryCharge = queryCharge;
        return this;
    }

}