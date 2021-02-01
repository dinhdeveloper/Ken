package lxt.project.myapplication.api.customer;

import b.laixuantam.myaarlibrary.api.ApiRequest;
import b.laixuantam.myaarlibrary.api.BaseApiParams;
import lxt.project.myapplication.helper.Consts;
import lxt.project.myapplication.model.BaseResponseModel;
import lxt.project.myapplication.model.ImageSlideModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@ApiRequest.ApiName("get_company_slide")
public class  RequestGetSlideHeader extends ApiRequest<RequestGetSlideHeader.Service, BaseResponseModel<ImageSlideModel>, RequestGetSlideHeader.ApiParams> {

    public RequestGetSlideHeader() {
        super(RequestGetSlideHeader.Service.class, RequestOrigin.NONE, Consts.HOST_API, Consts.MODE, Consts.TRUST_CERTIFICATE);
    }

    @Override
    protected void postAfterRequest(BaseResponseModel<ImageSlideModel> result) {

    }

    @Override
    protected Call<BaseResponseModel<ImageSlideModel>> call(RequestGetSlideHeader.ApiParams params) {
        params.detect = "get_company_slide";
        return getService().call(params);
    }

    interface Service {
        @Headers(Consts.HEADES)
        @POST(Consts.REST_ENDPOINT)
        Call<BaseResponseModel<ImageSlideModel>> call(@Body RequestGetSlideHeader.ApiParams params);
    }

    public static class ApiParams extends BaseApiParams {
        String detect;
    }
}