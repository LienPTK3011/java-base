package com.base.web.common.dto.response;

import com.base.web.common.ResponseCode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response<T> {
    protected Integer code;
    private T data;
    public Response ok() {
        this.code = ResponseCode.CODE_SUCCESS;
        return this;
    }
}
