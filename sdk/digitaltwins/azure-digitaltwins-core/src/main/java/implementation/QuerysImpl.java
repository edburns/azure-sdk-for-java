/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package digitaltwins.implementation;

import retrofit2.Retrofit;
import .Querys;
import .models.ErrorResponseException;
import .models.QueryQueryTwinsHeaders;
import .models.QueryResult;
import .models.QuerySpecification;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Querys.
 */
public class QuerysImpl implements Querys {
    /** The Retrofit service to perform REST calls. */
    private QuerysService service;
    /** The service client containing this operation class. */
    private AzureDigitalTwinsAPIImpl client;

    /**
     * Initializes an instance of Querys.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public QuerysImpl(Retrofit retrofit, AzureDigitalTwinsAPIImpl client) {
        this.service = retrofit.create(QuerysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Querys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface QuerysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: .Querys queryTwins" })
        @POST("query")
        Observable<Response<ResponseBody>> queryTwins(@Body QuerySpecification querySpecification, @Query("api-version") String apiVersion);

    }

    /**
     * Executes a query that allows traversing relationships and filtering by property values.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param querySpecification The query specification to execute.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QueryResult object if successful.
     */
    public QueryResult queryTwins(QuerySpecification querySpecification) {
        return queryTwinsWithServiceResponseAsync(querySpecification).toBlocking().single().body();
    }

    /**
     * Executes a query that allows traversing relationships and filtering by property values.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param querySpecification The query specification to execute.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<QueryResult> queryTwinsAsync(QuerySpecification querySpecification, final ServiceCallback<QueryResult> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(queryTwinsWithServiceResponseAsync(querySpecification), serviceCallback);
    }

    /**
     * Executes a query that allows traversing relationships and filtering by property values.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param querySpecification The query specification to execute.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueryResult object
     */
    public Observable<QueryResult> queryTwinsAsync(QuerySpecification querySpecification) {
        return queryTwinsWithServiceResponseAsync(querySpecification).map(new Func1<ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders>, QueryResult>() {
            @Override
            public QueryResult call(ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Executes a query that allows traversing relationships and filtering by property values.
     Status codes:
     200 (OK): Success.
     400 (Bad Request): The request is invalid.
     *
     * @param querySpecification The query specification to execute.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueryResult object
     */
    public Observable<ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders>> queryTwinsWithServiceResponseAsync(QuerySpecification querySpecification) {
        if (querySpecification == null) {
            throw new IllegalArgumentException("Parameter querySpecification is required and cannot be null.");
        }
        Validator.validate(querySpecification);
        return service.queryTwins(querySpecification, this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders> clientResponse = queryTwinsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<QueryResult, QueryQueryTwinsHeaders> queryTwinsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<QueryResult, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<QueryResult>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, QueryQueryTwinsHeaders.class);
    }

}