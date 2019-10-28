

/*
 * Created by rogergcc
 * Copyright Ⓒ 2019 . All rights reserved.
 */

package com.rogergcc.sisfaedcoh.generics.service;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.ArrayMap;
import android.widget.ImageView;

import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.rogergcc.sisfaedcoh.generics.base.BaseApplication;

import java.util.Map;



public class ServiceHandler {

    private Map<String, String> mHeaders;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public ServiceHandler() {
        mHeaders = new ArrayMap<String, String>();
    }

    public void addHeader(String key, String value) {
        mHeaders.put(key,value);
    }

    public <T> void objectRequest(String url, int method, Map<String, Object> params, Class clazz,
                                  Response.Listener<T> response, Response.ErrorListener error) {
        String tag_json_arry = "object_req";

        ObjectRequest objectRequest;

        if (params != null) {
            objectRequest = new ObjectRequest<T>(method, url, params, clazz, response, error);
            objectRequest.setHeaders(mHeaders);
        } else {
            objectRequest = new ObjectRequest<T>(method, url, null, clazz, response, error);
            objectRequest.setHeaders(mHeaders);
        }

        BaseApplication.getInstance().addToRequestQueue(objectRequest, tag_json_arry);
    }

    public void imageRequest(String url, ImageView imageView, int icon_loading, int icon_error) {
        ImageLoader imageLoader = BaseApplication.getInstance().getImageLoader();
        imageLoader.get(url, ImageLoader.getImageListener(imageView, icon_loading, icon_error));
    }
}
